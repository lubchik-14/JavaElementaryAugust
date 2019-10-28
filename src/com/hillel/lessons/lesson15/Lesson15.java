package com.hillel.lessons.lesson15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Lesson15 {
    public static void main(String[] args) {
        //1
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("d:/dataOutput.txt"))) {
            out.writeFloat(12.46f);
            out.writeUTF("string");
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }

        //2
        System.out.println("Read data");
        try (DataInputStream in = new DataInputStream(new FileInputStream("d:/dataOutput.txt"))) {
            float f = in.readFloat();
            String s = in.readUTF();
            System.out.println(f + " " + s);
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        //3
        List<String> strings = new ArrayList<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("d:/dataOutputCollection.txt"))) {
            out.writeInt(strings.size());
            for (String string : strings) {
                out.writeUTF(string);
            }
            out.writeInt(2000000);
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }
        List<String> strings1 = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(new FileInputStream("d:/dataOutputCollection.txt"))) {
            int count = in.readInt();
            for (int i = 1; i < count; i++) {
                strings1.add(in.readUTF());
            }
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        System.out.println("Read strings");
        strings1.forEach(System.out::println);

        //4
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("d:/dataOutputContacts.txt"))) {
            out.writeInt(Data.writtenContacts.size());
            for (Contact contact : Data.writtenContacts) {
                out.writeUTF(contact.getFirstName());
                out.writeUTF(contact.getLastName());
                out.writeUTF(contact.getPhoneNumber());
                out.writeInt(contact.getBirthYear());
            }
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }
        List<Contact> contactList = new ArrayList<>();
        try (DataInputStream in = new DataInputStream(new FileInputStream("d:/dataOutputContacts.txt"))) {
            int count = in.readInt();
            for (int i = 1; i < count; i++) {
                contactList.add(new Contact(in.readUTF(), in.readUTF(),
                        in.readUTF(), in.readInt()));
            }
        } catch (IOException e) {
            System.out.println("File not created");
            e.printStackTrace();
        }
        System.out.println("Read contacts");
        contactList.forEach(contact -> System.out.println(contact.getFirstName()
                + " " + contact.getLastName()
                + " " + contact.getPhoneNumber()
                + " " + contact.getBirthYear()));

        //5
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SerializableContact.txt"))) {
            out.writeObject(Data.writtenContacts);
        } catch (IOException e) {
            System.out.println("File is not exist");
            e.printStackTrace();
        }
        List<Contact> contactListSerial = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("SerializableContact.txt"))) {
            contactListSerial = (ArrayList<Contact>) in.readObject();
        } catch (IOException e) {
            System.out.println("File is not exist");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Read serializable contacts");
        contactListSerial.forEach(contact -> System.out.println(contact.getFirstName()
                + " " + contact.getLastName()
                + " " + contact.getPhoneNumber()
                + " " + contact.getBirthYear()));

        //6
        try (Stream<Path> pathFind =
                     Files.find(Paths.get("d:/hillel"), 100, (path, attr) -> attr.isRegularFile())) {
            System.out.println("Found " + pathFind.count() + " files");
//            pathFind.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Cannot resolve the path");
            e.printStackTrace();
        }
    }
}
