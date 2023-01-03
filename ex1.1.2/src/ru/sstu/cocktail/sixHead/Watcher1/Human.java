package ru.sstu.cocktail.sixHead.Watcher1;

public class Human {
    private Rule<Human> rule;

    public Human(Rule<Human> rule) {
        this.rule = rule;
    }
    public Human() {
        this(new Rule<Human>() {
            @Override
            public boolean isAccept(Human object) {
                return false;
            }
        });
    }
    public boolean check(){
        return rule != null && rule.isAccept(this);
    }



}
