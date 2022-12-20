package ru.sstu.cocktail.sixHead;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Student<T> implements Cloneable {
    String name;
    final Predicate<T> rule;
    Averageable<T> av;
    List<T> marks = new ArrayList<>();

    public Student(String name, Averageable<T> av, Predicate<T> rule) {
        this.name = name;
        this.rule = (rule == null) ? (x) -> true : rule;
        if (av == null) {
            this.av = marks -> marks.get(0);
        } else this.av = av;
    }

    public Student(String name, Averageable<T> av) {
        this(name, av, null);
    }

    public Student(String name) {
        this(name, null, null);
    }

    public List<T> getMarks() {
        return marks;
    }

    public void addMark(T mark) {
        if (rule.test(mark)) {
            marks.add(mark);
        } else {
            throw new IllegalArgumentException("Ahtung");
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void delMark(int x) {
        marks.remove(x);
    }

    public T getAverage() {
        return av.getAverage(marks);
    }

    @Override
    protected Student<T> clone() throws CloneNotSupportedException {
        try {
            Student<T> clone = (Student<T>) (super.clone());
            clone.marks = new ArrayList<T>(marks);
            return clone;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}



