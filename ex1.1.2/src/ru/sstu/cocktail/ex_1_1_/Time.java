package ru.sstu.cocktail.ex_1_1_;

public class Time {
    private int m, h, s;

    public Time(int s){
        if (s < 0) throw new IllegalArgumentException("невалидное значение");
        this.s = s % 86400;
        this.time();
    }

    public Time(int h, int m, int s) throws Exception {

        this(h/3600 + m/60 + s);
    }

    private void time() {
        this.h = s / 3600;
        this.m = s % 3600 / 60;
        this.s = s % 3600 % 60 % 60;
    }

    public int getMinute() {
        return m;
    }

    public int getHour() {
        return h;
    }

    public int getSecond() {
        return s;
    }
    static private String getFormattedStr(int n ){
        return n < 10?"0" + n:n+"";

    }
    @Override
    public String toString() {
        return String.format("%s:%s:%s\n",getFormattedStr(h), getFormattedStr(m), getFormattedStr(s));

    }
}