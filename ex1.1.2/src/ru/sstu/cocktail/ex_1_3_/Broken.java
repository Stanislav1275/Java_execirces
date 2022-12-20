package ru.sstu.cocktail.ex_1_3_;


import ru.sstu.cocktail.Interfaces.IcanGetPolyline;
import ru.sstu.cocktail.Interfaces.Longable;
import ru.sstu.cocktail.ex_1_1_.Point2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Broken implements Longable, IcanGetPolyline {
    private List<Point2D> point2DS = new ArrayList<>();

    public Broken(ArrayList<Point2D> point2DS) {
        setPoints(point2DS);
    }

    public Broken(Point2D... point2DS) {
        setPoints(point2DS);
    }

    public Broken() {
    }

    public Point2D getPoint(int index) throws IllegalArgumentException {
        System.out.println(index);
        if (index >= 0) return point2DS.get(index);
        else if (index == -1) return point2DS.get(point2DS.size() - 1);
        else throw new IllegalArgumentException("неверный индекс");
    }

    public void setPoints(ArrayList<Point2D> point2DS) {
        this.point2DS = new ArrayList<Point2D>(point2DS);
    }

    public void setPoints(Point2D... point2DS) {
        this.point2DS = new ArrayList<Point2D>(List.of(point2DS));
    }

    public void addPoints(ArrayList<Point2D> point2DS) {
        this.point2DS.addAll(point2DS);
    }

    public void addPoints(Point2D... point2DS) {
        this.point2DS.addAll(List.of(point2DS));
    }

    public ArrayList<Point2D> getPoints() {
        return new ArrayList<Point2D>(point2DS);
    }

    @Override
    public double getLength() {
        double r = 0;
        for (int i = 0; i < point2DS.size() - 1; i++) {
            Point2D cur = point2DS.get(i);
            Point2D next = point2DS.get(i + 1);
            r += Math.sqrt(Math.pow(cur.x - next.x, 2) + Math.pow(cur.y - next.y, 2));
        }
        return r;
    }

    public void addPoint(Point2D point2D) {
        point2DS.add(point2D);
    }

    @Override
    public String toString() {
        return String.format("Линия %s\n", this.point2DS);
    }

    @Override
    public Broken getBroken() {
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Broken broken)) return false;
        return Objects.equals(point2DS, broken.point2DS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point2DS);
    }
}
