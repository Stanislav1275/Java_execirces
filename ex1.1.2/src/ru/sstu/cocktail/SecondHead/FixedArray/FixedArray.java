package ru.sstu.cocktail.SecondHead.FixedArray;

import ru.sstu.cocktail.SecondHead.Array;
import ru.sstu.cocktail.SecondHead.ConstArray.ConstArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FixedArray {
    private int[] array = new int[0];
    private int maxLength;

    private int cur = 0;

    public FixedArray(int maxLength) {
        this.maxLength = maxLength;
    }

    public FixedArray() {
        this(DEPS.MAX_LEN_DEF);

    }

    public FixedArray(FixedArray fArray) {

        this(fArray.size());
        this.array = Arrays.copyOf(fArray.getArray(), fArray.size());
        maxLength = fArray.size();

    }

    protected boolean isGoodIndex(int i) {
        if (i >= 0 && i < size()) return true;
        else throw new ArrayIndexOutOfBoundsException("Invalid index of array");
    }

    public int size() {
        return array.length;
    }

    public void remove(int index) {
        int i = index;
        int[] newArray = new int[size() - 1];
        if (i == -1) i = size() - 1;
        if (isGoodIndex(i)) {
            System.arraycopy(array, 0, newArray, 0, i);
            System.arraycopy(array, i + 1, newArray, i, size() - i - 1);
            array = newArray;
        }
    }

    public int getN(int n) throws ArrayIndexOutOfBoundsException {
        if (n == -1) return array[size() - 1];
        if (isGoodIndex(n)) {
            return array[n];
        } else throw new ArrayIndexOutOfBoundsException("Invalid index of array");
    }

    public boolean isAddable() {
        return maxLength != cur;
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

    public void insert(int num, int index) {//stRoka
//        System.out.println(maxLength);
//        System.out.println(size());
        if ((size() == maxLength)) throw new IllegalArgumentException("Привышен максимум");
        int i = index;
        if (i == -1) i = size();
        if (!(i >= 0 && i <= size()) || size() == 0 && i < size())
            throw new ArrayIndexOutOfBoundsException("index is not right");

        int[] newArr = new int[size() + 1];

        System.arraycopy(array, 0, newArr, 0, i);
        newArr[i] = num;
        ;
        System.arraycopy(array, i, newArr, i + 1, array.length - i);
        array = newArr;

    }


    public void insert(int index, int... insertArray) {
        int i = index;
        if (i == -1) i = size();
        if (insertArray.length + size() > maxLength)
            throw new ArrayIndexOutOfBoundsException("Вставляемый массив не помещается в текущий");
        for (int element : insertArray) {
            insert(element, i++);
        }
    }

    @Override
    public String toString() {

        return "Farray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }



    public interface DEPS {
        int MAX_LEN_DEF = 100;
    }


}
