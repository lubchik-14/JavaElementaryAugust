package com.hillel.lessons.lesson9;

import com.hillel.lessons.lesson9.actions.Action;
import com.hillel.lessons.lesson9.actions.Message;

import java.util.*;
import java.util.stream.Collectors;

public class Phone {

    /**
     * Returns a Collection of Contacts that contain the given substring in any field
     *
     * @param contacts  The Collection of Contacts
     * @param substring The substring to search
     * @return Collection of Contacts
     */
    static Collection<Contact> findContacts(Collection<Contact> contacts, String substring) {
        Collection<Contact> foundContacts = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().contains(substring) || (contact.getPhoneNumber().contains(substring))) {
                foundContacts.add(contact);
            }
        }
        return foundContacts;
    }

    /**
     * Returns a Collection of Messages that contain the given substring in any field
     *
     * @param messages  The Collection of Messages
     * @param substring The substring to search
     * @return Collection of Messages
     */
    static Collection<Message> findMessages(Collection<Message> messages, String substring) {
        Collection<Message> foundMessages = new ArrayList<>();
        for (Message message : messages) {
            if (message.getMessageText().contains(substring) || (message.getPhoneNumber().contains(substring))) {
                foundMessages.add(message);
            }
        }
        return foundMessages;
    }

    /**
     * Groups all of actions by all of contacts
     *
     * @param contacts List of Contact objects
     * @param actions  List of T objects
     * @param <T>      An action of contact than implements Action interface
     * @return a Map contains Contact-key and groped actions of these contacts
     */
    static <T extends Action> Map<Contact, List<T>> groupActionsByContact(List<Contact> contacts, List<T> actions) {
//        Map<Contact, List<T>> contactListMap = new HashMap<>();
//        for (T action : actions) {
//            Contact currentContact = getContactByPhoneNumber(contacts, action.getPhoneNumber());
//            if (!contactListMap.containsKey(currentContact)) {
//                contactListMap.put(currentContact, new ArrayList<>());
//            }
//            contactListMap.get(currentContact).add(action);
//        }
//        return contactListMap;

        return actions.stream()
                .collect(Collectors
                        .groupingBy(contact -> Phone.getContactByPhoneNumber(contacts, contact.getPhoneNumber())));
    }

    /**
     * Returns a Contact according to given phone number or creates a new one.
     *
     * @param contacts    List of contacts to find
     * @param phoneNumber String phone number
     * @return a Contact according to given phone number or new Contact from given phoneNumber
     */
    private static Contact getContactByPhoneNumber(List<Contact> contacts, String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return new Contact(phoneNumber, phoneNumber);
    }

    /**
     * Returns top 5 contacts based on their actions using Stream API
     *
     * @param contacts List of Contact objects
     * @param actions  List of T objects
     * @param <T>      An action of contact than implements Action interface
     * @return a sorted Map of contains Contact-keys and count of the contact actions-values
     */
    static <T extends Action> Map<Contact, Long> getTop5(List<Contact> contacts, List<T> actions) {
        return getActionsAmount(contacts, actions).entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    /**
     * Returns top 3 contacts based on their actions using Pair objects {@link Pair}
     *
     * @param contacts List of Contact objects
     * @param actions  List of T objects
     * @param <T>      An action of contact than implements Action interface
     * @return a sorted List of Pair {@link Pair} contains Contact-values and count of the contact actions-values
     */
    static <T extends Action> List<Pair<Contact, Long>> getTop3(List<Contact> contacts, List<T> actions) {
        List<Pair<Contact, Long>> result = new ArrayList<>();
        Map<Contact, Long> amount = getActionsAmount(contacts, actions);

        for (Map.Entry<Contact, Long> entry : amount.entrySet()) {
            result.add(new Pair<>(entry.getKey(), entry.getValue()));
        }

        result.sort((o1, o2) -> Long.compare(o2.getActions(), o1.getActions()));
        return result.subList(0, 3);
    }

    /**
     * Count actions by contacts
     *
     * @param contacts List of Contact objects
     * @param actions  List of T objects
     * @param <T>      An action of contact than implements Action interface
     * @return a Map contains Contact-keys and count of the contact actions-values
     */
    private static <T extends Action> Map<Contact, Long> getActionsAmount(List<Contact> contacts, List<T> actions) {
//        Map<Contact, Integer> foundContacts = new HashMap<>();
//
//        for (Map.Entry<Contact, List<T>> entry : groupActionsByContact(contacts, actions).entrySet()) {
//            foundContacts.put(entry.getKey(), entry.getValue().size());
//        }
        return actions.stream()
                .collect(Collectors
                        .groupingBy(t -> Phone.getContactByPhoneNumber(contacts, t.getPhoneNumber()), Collectors.counting()));
    }
}
