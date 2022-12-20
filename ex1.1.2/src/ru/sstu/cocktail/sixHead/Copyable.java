package ru.sstu.cocktail.sixHead;

public interface Copyable<T> extends Cloneable {
    T clone();
}
