package ru.sstu.cocktail.sixHead.Stock;


enum Enum{
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;
    Enum(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}