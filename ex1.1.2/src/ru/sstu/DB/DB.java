package ru.sstu.DB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DB {
    private List<String> data;
    {
        data = new ArrayList<>(Arrays.asList("ds","dg","fs","gf", "hg", "71tEy","dsfg3","cockr3"));
    }
    private int maxCountConnections;
    private int curCountConnections;
    public DB(int maxCountConnections){
        this.maxCountConnections = maxCountConnections;
    }
    public String getElement(int index){
        return data.get(index);
    }
}
