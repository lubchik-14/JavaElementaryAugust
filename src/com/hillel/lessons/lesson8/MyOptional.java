package com.hillel.lessons.lesson8;

import java.util.NoSuchElementException;
import java.util.Objects;

public class MyOptional<T> {
    private T value;

    private MyOptional(T value) {
        this.value = value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public T get() {
        if (value == null) {
            throw new NoSuchElementException();
        }
        return value;
    }

    public static <U> MyOptional<U> of(U u) {
        if (u == null) {
            throw new NullPointerException();
        }
        return new MyOptional<>(u);
    }

    public static <U> MyOptional<U> ofNullable(U u) {
        return new MyOptional<>(u);
    }

    public static <U> MyOptional<U> empty() {
        return new MyOptional<>(null);
    }

    public T orElse(T other) {
        if (isPresent()) {
            return value;
        }
        return other;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof MyOptional)) {
            return false;
        }

        MyOptional theOther = (MyOptional) obj;
        return Objects.equals(value, theOther.value);
    }
}
