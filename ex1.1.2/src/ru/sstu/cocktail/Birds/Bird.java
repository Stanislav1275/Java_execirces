package ru.sstu.cocktail.Birds;

public abstract class Bird implements IBird{
    protected final String txt;
    public Bird(String txt) {
        this.txt = txt;
    }


    public void song(String txt) {
        System.out.println(txt);
    }
}
