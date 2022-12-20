package ru.sstu.cocktail.Birds;

public class Qqushka extends Bird {
    final static String songTxt = "QQ";

    public Qqushka() {
        super(songTxt);
    }

    public void song() {
        int randomTimesCount = (int) (10 * Math.random() + 1);
        System.out.println(randomTimesCount);
        while (randomTimesCount > 0) {
            super.song(songTxt);
            randomTimesCount--;
        }
    }


}
