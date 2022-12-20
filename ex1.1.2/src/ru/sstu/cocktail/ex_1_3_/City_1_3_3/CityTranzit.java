package ru.sstu.cocktail.ex_1_3_.City_1_3_3;

import java.util.ArrayList;

public class CityTranzit extends City{
    public CityTranzit(String cityName, ArrayList<Way> ways) {
        super(cityName, ways);
    }

    public CityTranzit(String cityName) {
        super(cityName);
    }
}
