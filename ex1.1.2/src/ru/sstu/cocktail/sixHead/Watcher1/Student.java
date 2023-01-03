package ru.sstu.cocktail.sixHead.Watcher1;

public class Student extends Human{
    private String name;
    private int id;
    private Rule<Student> rule;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public Student(){
        this(null,-1);
    }

}
