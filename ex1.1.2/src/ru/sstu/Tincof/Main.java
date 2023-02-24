package ru.sstu.Tincof;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        diplaySets(5);
    }

    public static void diplaySets(int n) {
        int len = n;
        int[] arr;
        List<int[]> sets = new ArrayList<>();
        int k = 0;
        for (int o = len; o > 1; o--) {
            arr = new int[len];
            arr[k] = o;
            for (int i = o - 1; i >= 1 && k != len - 1; i--) {
                arr[++k] = i;
            }
            sets.add(Arrays.copyOfRange(arr, 0, arr.length));
            k = 0;
        }
        for (int[] set : sets) {
            int[] a = Arrays.copyOfRange(set, 0, sets.get(0).length);
            int index = len - 1;
            while (index != 1) {
                if (a[index] == 0) index--;
                a[index]--;
                if (index == 1) break;
//                sets.add(Arrays.copyOf(a,a.length));
            }
        }

        for (int[] set : sets)
            System.out.println(Arrays.toString(set));
    }
}
