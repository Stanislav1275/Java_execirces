package ru.sstu.cocktail.ex_1_3_.City_1_3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class City{
    private String cityName;
    private ArrayList<Way> ways = new ArrayList<>();

    public City(String cityName, ArrayList<Way> ways) {
        this.cityName = cityName;
        setWays(ways);
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    private Way searchCityInWays(Way way) {
        Way res = null;
        for (Way w : way.getCity().getWays()) {
            if (w.getCity() == this) {
                res = w;
                return res;
//                w.setCost(way.getCost());
            }
        }
        if(cityName != null)
//        res.setCost(0);

        way.getCity().getWays().add(new Way(this, way.getCost()));
        return res;
    }

    public void addWay(Way way) throws IllegalArgumentException {
        Way res = searchCityInWays(way);
        if (res != null && res.getCost() == 0) {
            res.setCost(way.getCost());
        }
        for (Way w : ways) {
            if (w.getCity().equals(way.getCity())) {
                w.setCost(way.getCost());
                return;
            }
        }
        ways.add(way);

    }


    public void addWay(City city, int cost) {
        addWay(new Way(city, cost));
    }

    public void removeWay(City city) {
        for (int i = 0; i < ways.size(); i++) {
            if (ways.get(i).getCity().equals(city)) {
                ways.remove(i);
                break;
            }
        }
    }

    public ArrayList<Way> getWays() {
        return ways;
    }

    public Way getWay(int index) {
        return ways.get(index);
    }

    public void setWays(ArrayList<Way> ways) throws IllegalArgumentException {
        for (int i = 0; i < ways.size(); i++) {
            for (int j = i + 1; j < ways.size(); j++) {
                if (ways.get(j).equals(ways.get(i))) {
                    throw new IllegalArgumentException("Заданы одинковые города");
                }
            }
        }
        this.ways = ways;
    }


    public boolean equals(City o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = o;
        return Objects.equals(cityName, city.cityName) && Objects.equals(ways, city.ways);
    }


    @Override
    public String toString() {
        String res = "";
        if (ways != null)
            for (Way way : ways) {
                res += String.format("%s:%s\n", way.getCity().cityName, way.getCost());
            }
        else return "No ways< brother";
        return res;
    }

    public City[] findWay(City city, Algs alg) {
       return alg.findWay(this, city);
    }
}
