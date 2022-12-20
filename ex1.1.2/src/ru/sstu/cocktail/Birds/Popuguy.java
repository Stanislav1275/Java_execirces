package ru.sstu.cocktail.Birds;

import java.util.Arrays;

public class Popuguy extends Bird {


    public Popuguy(String txt) {
        super(txt);
    }
    public void song() {
        super.song(getRandomizeSongTxt());
    }


    private String getRandomizeSongTxt() {

        char[] t = txt.toCharArray();
        char tmp;
        if (t.length <= 1) return Arrays.toString(t);
        for (int i = 0; i < t.length; i++) {
            int rIndex = (int) (Math.random() * (t.length - 1));
            //swap
            tmp = t[i];
            t[i] = t[rIndex];
            t[rIndex] = tmp;
            //

        }
        return new String(t);
    }
}
