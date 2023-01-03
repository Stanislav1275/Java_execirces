package me.chs.obj;

public class LineObject {

    private Dot start, end;

    public LineObject(Dot start, Dot end) {
        this.start = start;
        this.end = end;
    }

    public Dot getEnd() {
        return end;
    }

    public Dot getStart() {
        return start;
    }

    public void setEnd(Dot end) {
        this.end = end;
    }

    public void setStart(Dot start) {
        this.start = start;
    }

    public String toString() {
        return String.format("Линия от %s до %s", start.toString(), end.toString());
    }

}
