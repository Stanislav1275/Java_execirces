package ru.sstu.cocktail.SecondHead.ConstArray;

import java.util.Arrays;

public class ConstArray {
    private int[] array;
    public ConstArray(int... array) {
        this.array = Arrays.copyOf(array, array.length);


    }

    public ConstArray(ConstArray constArray) {
        this(constArray.getArray());

    }

    protected boolean isGoodIndex(int i) {
        if (i >= 0 && i < size()) return true;
        else throw new ArrayIndexOutOfBoundsException("Invalid index of array");
    }

    public int size() {
        return array.length;
    }


    public int getN(int n) throws ArrayIndexOutOfBoundsException {
        if(n == -1) return array[size() - 1];
        if (isGoodIndex(n)) {
            return array[n];
        } else throw new ArrayIndexOutOfBoundsException("Invalid index of array");
    }

    public void change(int n, int num) {
        if (isGoodIndex(n)) {
            array[n] = num;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, size());
    }

    @Override
    public String toString() {

        return "ConstArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
