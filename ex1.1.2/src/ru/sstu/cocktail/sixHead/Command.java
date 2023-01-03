package ru.sstu.cocktail.sixHead;

public interface Command {
    int execute();
    CommandCategory getType();
}

