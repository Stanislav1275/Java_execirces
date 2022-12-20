package ru.sstu.cocktail.ex_1_3_;


import ru.sstu.cocktail.ex_1_1_.MyPoint;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private List<MyPoint> points = new ArrayList<>();
    public Polyline(ArrayList<MyPoint> points) {
        setPoints(points);
    };
    public Polyline(MyPoint ...points) {
        setPoints(points);
    };


    public Polyline() {
    }

    public MyPoint getPoint(int index) {
        return (
                index == -1) ?
                this.points.get(-1) :
                (index == 0) ?
                        this.points.get(0) :
                        this.points.get(index);
    }

    public void setPoints(ArrayList<MyPoint> points) {
        this.points = new ArrayList<MyPoint>(points);
    }
    public void setPoints(MyPoint ...points) {
        this.points = new ArrayList<MyPoint>(List.of(points));
    }
    public void addPoints(ArrayList<MyPoint> points) {
        this.points.addAll(points);
    }
    public void addPoints(MyPoint ...points) {
        this.points.addAll(List.of(points));
    }
    public ArrayList<MyPoint> getPoints() {
        return new ArrayList<MyPoint>(points);
    }

    public int getLength(){
        return points.size();
    }

    public void addPoint(MyPoint point) {
        points.add(point);
    }

    @Override
    public String toString() {
        return String.format("Линия %s\n", this.points);
    }

}
