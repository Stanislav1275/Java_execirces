package ru.sstu.cocktail.sixHead;

public class Default <T>{
    private T avgScore;

    Default(T avgScore) {
        this.avgScore = avgScore;
    }

    public T getCorrect(T def){
        if(this.avgScore == null) return def;
        return this.avgScore;
    }
    public static <T>Default createDefEmpty(){

        return new Default<T>(null);
    }
    public static <T>Default createDefNullPointer(T value){
        if(value == null) throw  new NullPointerException("null");
        return new Default<T>(value);
    }
    public static <T>Default createDefAny(T value){
        return new Default<T>(value);
    }


}
