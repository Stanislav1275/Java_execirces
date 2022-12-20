package ru.sstu.cocktail;

import ru.sstu.cocktail.Interfaces.Longable;

public class MyString implements Longable {
    public String str;

    public MyString(String str) {
        this.str = str;
    }

    @Override
    public double getLength() {
        return str.length();
    }
}
