package ru.sstu.cocktail.sixHead;

public interface Command<T> {
    T execute();
    CommandCategory getType();
}

