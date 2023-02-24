package ru.sstu.cocktail.Temporary;

public class ActualTmp {
    private final Temp cold = new Cold("Холодно", -50, 10);
    private final Temp warm = new Warm("Тепло", 10, 25);
    private final Temp hot= new Hot("Жарко", 25, 60);
    private final Temp def;
    int actualTmp;

    public ActualTmp(int actualTmp) {
        this.actualTmp = actualTmp;
        this.def = new Default("Никак", actualTmp, actualTmp);
    }
    public Temp getActualTemp(){
        if(!(actualTmp < cold.getMin() || actualTmp > hot.getMax())) {
            return (cold.isRelevant(actualTmp))?cold:(warm.isRelevant(actualTmp))?warm:hot;
        }return def;
    }

    public Temp getCold() {
        return cold;
    }

    public Temp getWarm() {
        return warm;
    }

    public Temp getHot() {
        return hot;
    }

    @Override
    public String toString() {
       return "actualTmp "+actualTmp +"{"+getActualTemp().toString()+"}\n";
    }
}
