package ru.sstu.cocktail.ex_1_3_.City_1_3_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        HashMap<String, City> cities = new HashMap<>();
        cities.put("A", new City("A"));
        cities.put("B", new City("B"));
        cities.put("C", new City("C"));
        cities.put("D", new City("D"));
        cities.put("E", new City("E"));
        cities.put("F", new City("F"));
        City A = cities.get("A");
        City B = cities.get("B");
        City C = cities.get("C");
        City D = cities.get("D");
        City E = cities.get("E");
        City F = cities.get("F");
        cities.put("G", new City("d",
                new ArrayList(
                        Arrays.asList(
                                new Way(F, 1),
                                new Way(B, 5),
                                new Way(D, 6)
                        )
                )
        ));


        A.setWays(
                new ArrayList(
                        Arrays.asList(
                                new Way(F, 1),
                                new Way(B, 5),
                                new Way(D, 6)
                        )
                )
        );

        B.setWays(
                new ArrayList(
                        Arrays.asList(
                                new Way(A, 5)
                        )
                )
        );
        C.setWays(
                new ArrayList(
                        Arrays.asList(
                                new Way(B, 3),
                                new Way(D, 4)
                        )
                )
        );
        D.setWays(
                new ArrayList(
                        Arrays.asList(
                                new Way(A, 6),
                                new Way(E, 2),
                                new Way(C, 4)
                        )
                )
        );
        E.setWays(
                new ArrayList(
                        Arrays.asList(
                                new Way(F, 2)
                        )
                )
        );
        F.setWays(
                new ArrayList(
                        Arrays.asList(
                                new Way(E, 2),
                                new Way(B, 1)

                        )
                )
        );
        System.out.println(cities.get("A"));
        System.out.println(cities.get("B"));
        System.out.println(cities.get("C"));
        System.out.println(cities.get("D"));
        System.out.println(cities.get("E"));
        System.out.println(cities.get("F"));
    }

}

