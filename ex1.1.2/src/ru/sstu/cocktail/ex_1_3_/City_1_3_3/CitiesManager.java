package ru.sstu.cocktail.ex_1_3_.City_1_3_3;

import java.util.ArrayList;

public class CitiesManager {
    private static ArrayList<City> cities = new ArrayList<>();

    public  static City getCity(int index){
        if(!cities.isEmpty())
            return cities.get(index);
        else return null;
    }
    public static void addCity(City city){
        cities.add(city);
    }

    public  String get() {
        return "";
    }
}
