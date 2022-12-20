package ru.sstu.cocktail.ex_1_1_;
public class House {
    public final static String SINGULAR = "ом";
    public final static String PLURAL = "ами";

    private int floorCount;
    public House(int floorCount){
        if(floorCount > 0)
        this.floorCount = floorCount;
        else         throw new Error("floorCount must be positive");
    }
    @Override
    public String toString(){
        return "Дом с "+floorCount+" этаж"+ ((getLastDigitOfFD()==1&&floorCount!=11)?SINGULAR:PLURAL);
    }
    private int getLastDigitOfFD(){
        return this.floorCount%10;
    }
}
