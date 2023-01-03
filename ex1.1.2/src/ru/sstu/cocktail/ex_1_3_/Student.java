package ru.sstu.cocktail.ex_1_3_;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Student<T> implements Comparable<T>{
    private String name;
    private List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        setMarks((ArrayList<Integer>) marks);
    }

    public ArrayList<Integer> getMarks() {
        if (!marks.isEmpty())
            return new ArrayList<Integer>(marks);
        else return null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(int index, int mark) {
        if (marks != null)
            marks.set(index, mark);
        getAverageScore();
    }

    public void addMarks(int... marks) {
        if (this.marks == null) this.marks = new ArrayList<Integer>();
        for (Integer mark : marks) {
            this.marks.add(mark);
        }

    }

    public void addMarks(ArrayList<Integer> marks) {
        this.marks.addAll(marks);
        getAverageScore();


    }

    public Integer getMark(int index) {
        if (!marksIsEmpty())
            return marks.get(index);
        else throw new IllegalArgumentException("нет оценок");
    }

    public boolean marksIsEmpty() {
        return marks == null || marks.isEmpty();
    }

    //debil
    public double getAverageScore() {
        double res = 0;
        if (marksIsEmpty()) {
            return 0;
        }
        for (int mark : marks) {
            res +=  mark;
        }
        res /= marks.size();
        return res;
    }

    public boolean isWellDone() {

        for (Integer mark : marks) {
            if (mark != 5) return false;
        }
        return true;
    }


    public void setMarks(ArrayList<Integer> marks) {
        if (marks != null) {
            this.marks = new ArrayList<Integer>(marks);
        }
    }

    public void setMarks(Integer... marks) {
        if (marks != null) {
            this.marks = new ArrayList<Integer>(List.of(marks));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks + " " +isWellDone() + " " +getAverageScore() + '}';
    }


    @Override
    public int compareTo(@NotNull T o) {
        return 0;
    }
}
