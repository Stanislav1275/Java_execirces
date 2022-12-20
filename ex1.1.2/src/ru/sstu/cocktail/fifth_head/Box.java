package ru.sstu.cocktail.fifth_head;

import java.lang.reflect.InaccessibleObjectException;

public class Box<T> {
    private T object = null;

    public T getObject() {
        return object;
    }

    public void putObject(T object) {
        if(isEmpty()) throw new IllegalArgumentException("box is not empty");
        this.object = object;
    }
    public boolean isEmpty(){
        return object != null;
    }
    public T takeObject(){
        T o = object;
        object = null;
        return o;
    }

    @Override
    public String toString() {

        return (String)object;
    }
}
