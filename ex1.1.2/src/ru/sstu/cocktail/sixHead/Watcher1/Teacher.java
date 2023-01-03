package ru.sstu.cocktail.sixHead.Watcher1;

public class Teacher extends Human{
    private String name;
    private int id;
    private String post;
    private Rule<Teacher> rule;

    public Teacher(String name, int id, String post) {
        this.name = name;
        this.id = id;
        this.post = post;
    }
    public Teacher() {
        this(null,-1,null);
    }
}
