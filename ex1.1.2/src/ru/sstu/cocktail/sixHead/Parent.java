package ru.sstu.cocktail.sixHead;

import java.util.function.Predicate;

public class Parent<T> {

    private final Predicate<T> rule;

    public Parent(Predicate<T> rule) {
        this.rule = rule;
    }
    public void addChild(Student<?> st){
        st.parents.add(this);
    }
    public void check(T mark){
        if(!rule.test(mark)){
            System.out.println("иди в угол!");
        }
    }
}
