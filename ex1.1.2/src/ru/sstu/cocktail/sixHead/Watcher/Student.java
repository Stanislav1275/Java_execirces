package ru.sstu.cocktail.sixHead.Watcher;

public class Student extends Human{
    String name; Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public boolean accept(Operation operation) {
        return operation.visit(this);
    }
}
