package ru.sstu.cocktail.ex_1_3_.City_1_3_3;

public class Way {
    private City city;
    private int cost;
    public Way(City city, int cost){
        this.city = city;
        this.cost = cost;
    }
    public int getCost(){
        return this.cost;
    }
    public City getCity(){return city;}
    public void setCost(int cost){
        this.cost = cost;
    }
    public City getCityName(){
        return this.city;
    }
    public void setCityName(String cityName){
        this.city = city;
    }

}
