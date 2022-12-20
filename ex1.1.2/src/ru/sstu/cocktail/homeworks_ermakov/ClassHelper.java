package ru.sstu.cocktail.homeworks_ermakov;

public class ClassHelper {
    public static int [] concat(int[] a1, int[] a2){
        int []a3 = new int [a1.length+a2.length];
        int k = 0, i = 0, j = 0;
        while(i<a1.length)a3[k++] = a1[i++];
        while(j<a2.length)a3[k++] = a2[j++];
        return a3;
    }
}
