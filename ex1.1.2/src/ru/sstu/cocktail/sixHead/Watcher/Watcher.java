package ru.sstu.cocktail.sixHead.Watcher;

public class Watcher implements Operation{
    public Watcher() {
    }

    @Override
    public boolean visit(Human h) {
        return false;
    }

    @Override
    public boolean visit(Teacher t) {
        return true;
    }

    @Override
    public boolean visit(Student s) {
        return false;
    }
}
