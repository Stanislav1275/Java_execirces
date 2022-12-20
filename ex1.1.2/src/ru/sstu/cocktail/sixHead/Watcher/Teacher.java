package ru.sstu.cocktail.sixHead.Watcher;

public class Teacher extends Human{
    private String name; private Integer id; private String post;

    public Teacher(String name, Integer id, String post) {
        this.name = name;
        this.id = id;
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getPost() {
        return post;
    }

    @Override
    public boolean accept(Operation operation) {
        return operation.visit(this);
    }
}
