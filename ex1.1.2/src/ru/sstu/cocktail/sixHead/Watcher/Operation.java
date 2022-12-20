package ru.sstu.cocktail.sixHead.Watcher;

public interface Operation {
    boolean visit(Human h);
    boolean visit(Teacher t);
    boolean visit(Student s);
}
