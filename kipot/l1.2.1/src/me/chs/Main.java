package me.chs;

import me.chs.obj.Dot;
import me.chs.obj.LineObject;

import java.util.ArrayList;

public class Main {

    public Main() {
        ArrayList<LineObject> lines = new ArrayList<LineObject>();

        lines.add(new LineObject(new Dot(1,3), new Dot(23,8)));
        lines.add(new LineObject(new Dot(5,10), new Dot(25,10)));
        lines.add(new LineObject(lines.get(0).getStart(), lines.get(1).getEnd()));

        lines.forEach(line -> System.out.println(line.toString()));

        lines.get(0).setStart(new Dot(9, 5));
        lines.get(0).setEnd(new Dot(50, 55));

        lines.get(1).setStart(new Dot(2, 3));
        lines.get(1).setEnd(new Dot(15, 5));

        lines.get(2).setStart(lines.get(0).getStart());
        lines.get(2).setEnd(lines.get(1).getEnd());

        System.out.println("");
        lines.forEach(line -> System.out.println(line.toString()));
        System.out.println("");

        lines.get(0).setEnd(new Dot(55, 55));

        lines.get(2).setStart(lines.get(0).getStart());
        lines.get(2).setEnd(lines.get(1).getEnd());

        lines.forEach(line -> System.out.println(line.toString()));
    }

    public static void main(String[] args) {
        new Main();
    }
}