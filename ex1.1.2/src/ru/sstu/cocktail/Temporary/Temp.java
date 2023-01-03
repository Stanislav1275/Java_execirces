package ru.sstu.cocktail.Temporary;
public abstract class Temp {
    final String tmpInfo;
    private final int min;
    private final int max;
    public Temp(String tmpInfo, int min, int max) {
        this.tmpInfo = tmpInfo;
        this.min = min;
        this.max = max;
    }
    public int getMin() {
        return min;
    }


    public int getMax() {
        return max;
    }
    public boolean isRelevant(int tmp){
        return tmp >= min && tmp <= max;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "tmpInfo='" + tmpInfo + '\'' +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
