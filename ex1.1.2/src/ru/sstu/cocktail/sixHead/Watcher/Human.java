package ru.sstu.cocktail.sixHead.Watcher;

import ru.sstu.cocktail.ex_1_1_.Name;

public class Human implements Humans{
    public Human() {
    }

    @Override
    public int hashCode() {
        return 56*super.hashCode()-1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Посетитель";
    }

    @Override
    public boolean accept(Operation operation) {
        return operation.visit(this);
    }
}
