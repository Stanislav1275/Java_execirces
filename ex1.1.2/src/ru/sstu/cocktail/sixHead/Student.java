package ru.sstu.cocktail.sixHead;

import java.util.*;
import java.util.function.Predicate;

public class Student<T> implements Cloneable ,Subjectable<T>{
    List<Parent> parents = new ArrayList<>();

    public Deque<Command> commandsUndo = new ArrayDeque<>();
    private Deque<Command> commandsRedo = new LinkedList<>();
    public String name;
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
//        passRes(mark);
//        commandsUndo.push(new Command() {
//            @Override
//            public int execute() {
//                int index = marks.size()-1;
//                delMark(index);
//                return index;
//            }
//
//            @Override
//            public CommandCategory getType() {
//                return CommandCategory.DELMARKS;
//            }
//        });
//        if (rule.test(mark)) {
//            marks.add(mark);
//        } else {
//            throw new IllegalArgumentException("Ahtung");
//        }

    }

    private void setPName(String name) {
        this.name = name;
    }
    public void setName(String name) {
        String oldname = this.name;
        commandsUndo.push(new Command() {
            @Override
            public Integer execute() {
                setPName(oldname);
                return -1;
            }

            @Override
            public CommandCategory getType() {
                return CommandCategory.NAME;
            }
        });
        this.name = name;
    }

    public void delMark(int index) {
        T mark =  marks.get(index);
        commandsUndo.push(new Command<Integer>() {
            @Override
            public Integer execute() {
                addMark(mark);
                return index;
            }

            @Override
            public CommandCategory getType() {
                return CommandCategory.ADDMARKS;
            }
        });
        marks.remove(index);
    }
    public void undo(){
        Command c = commandsUndo.pop();

//        switch (c.getType()) {
//            case NAME:
//                String oldName = name;
//                commandsRedo.push(new Command() {
//                    @Override
//                    public int execute() {
//                        setPName(oldName);
//                        return -1;
//                    }
//
//                    @Override
//                    public CommandCategory getType() {
//                        return CommandCategory.NAME;
//                    }
//                });
//                break;
//
//            case DELMARKS:
//
//                break;
//
//            case ADDMARKS:
//
//                break;
//
//            default:
//                throw new RuntimeException();
//        }

        commandsRedo.push(c);
        c.execute();

    }
    public void redo(){
        Command c = commandsRedo.pop();
        commandsUndo.push(c);
        c.execute();
    }
    public Default<T> getAverage() {
        if (marks.isEmpty()) return new Default<T>(null);
        if (av != null)
            return new Default<T>((Command<T>) av.getAverage(marks));
        Avegatorable<T> av = (Avegatorable<T>) marks.get(0);
        List<T> tmp = new ArrayList<>(marks);
        tmp.remove(0);
        return new Default<T>((Command<T>) av.getAverage((T[]) tmp.toArray()));
    }
//

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

    @Override
    public void passRes(T mark) {
        for(Parent<T> p : parents){
            p.check(mark);
        }
    }
}



