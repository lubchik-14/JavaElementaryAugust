package com.hillel.lessons.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Contact> writtenContacts = new ArrayList<>();
    static {
        writtenContacts.add(new Contact("Bertie", "Godain", "+46 258 926 8774", 1997));
        writtenContacts.add(new Contact("Vale", "Kopec", "+62 818 442 1880", 1997));
        writtenContacts.add(new Contact("Juliette", "Pinilla", "+86 410 585 4684", 1997));
        writtenContacts.add(new Contact("Bill", "Brass", "+1 202 850 9856", 2012));
        writtenContacts.add(new Contact("Lesli", "Patershall", "+60 188 153 2655", 1989));
        writtenContacts.add(new Contact("Rosaline", "Tibbles", "+55 767 793 1277", 1995));
        writtenContacts.add(new Contact("Kristoffer", "Yarker", "+62 170 463 5625", 1995));
        writtenContacts.add(new Contact("Linette", "Konig", "+48 457 717 4360", 2006));
        writtenContacts.add(new Contact("Erma", "Benez", "+53 712 595 8368", 2008));
        writtenContacts.add(new Contact("Grace", "Drennan", "+86 522 349 1358", 2002));
        writtenContacts.add(new Contact("Pip", "Garbutt", "+86 849 197 9980", 2011));
        writtenContacts.add(new Contact("Meris", "McDell", "+86 785 760 5668", 1940));
        writtenContacts.add(new Contact("Mahmoud", "Bremen", "+30 162 206 5093", 1999));
        writtenContacts.add(new Contact("Rustie", "Berkowitz", "+55 886 858 7983", 1998));
        writtenContacts.add(new Contact("Tim", "Crosen", "+380 642 788 4862", 2002));
        writtenContacts.add(new Contact("Jeth", "Livzey", "+62 901 722 9709", 1954));
        writtenContacts.add(new Contact("Louisa", "Denge", "+46 397 562 9393", 1970));
        writtenContacts.add(new Contact("Sean", "Yakunin", "+62 699 268 3821", 2004));
        writtenContacts.add(new Contact("Oliver", "McCamish", "+62 554 844 8040", 1997));
        writtenContacts.add(new Contact("Bobbi", "Addie", "+63 740 797 3529", 2003));
    }
}
