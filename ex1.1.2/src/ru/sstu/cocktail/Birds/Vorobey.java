package ru.sstu.cocktail.Birds;

public class Vorobey extends Bird{
    private static final String songTxt = "чырык" ;
    public Vorobey() {
        super(songTxt);
    }
    public void song(){
        super.song(songTxt);
    }
}
