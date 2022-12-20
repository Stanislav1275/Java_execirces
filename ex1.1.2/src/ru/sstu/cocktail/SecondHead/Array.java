package ru.sstu.cocktail.SecondHead;

import java.util.Arrays;
public abstract class Array {
    private int[] array;
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
    public abstract void insert(int i );

    @Override
    public String toString() {

        return "ConstArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
    public interface DEPS{
        static final int MAX_LEN_DEF = 100;
    }
}

