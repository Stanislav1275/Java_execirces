package ru.sstu.cocktail.ex_1_3_;

import ru.sstu.cocktail.ex_1_1_.Point2D;

import java.util.ArrayList;

public class ClosedBroken extends Broken {
    public ClosedBroken(ArrayList<Point2D> point2DS) {
        super(point2DS);
    }

    public ClosedBroken(Point2D... point2DS) {
        super(point2DS);
    }

    @Override
    public double getLength() {
        System.out.println();
        return super.getLength() + Math.sqrt(Math.pow(getPoint(0).x - getPoint(-1).x, 2) + Math.pow(getPoint(0).y - getPoint(-1).y, 2));
    }
    @Override
    public Broken getBroken(){
        Broken br = new Broken(getPoints());
        br.addPoint(getPoints().get(0));
        return br;
    }
}
