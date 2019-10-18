package com.hillel.lessons.lesson9;

import java.util.Objects;

/**
 * Pair class is a wrap for two objects
 */
public class Pair<C extends Contact, A> {
    /**
     * Field C contains a Contact nested instance
     */
    private final C contact;
    /**
     * Field A contains an object of A type
     */
    private final A actions;

    public Pair(C c, A a) {
        this.contact = c;
        this.actions = a;
    }

    public C getContact() {
        return contact;
    }

    public A getActions() {
        return actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(getContact(), pair.getContact()) &&
                Objects.equals(getActions(), pair.getActions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContact(), getActions());
    }
}
