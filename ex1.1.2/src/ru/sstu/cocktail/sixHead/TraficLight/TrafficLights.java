package ru.sstu.cocktail.sixHead.TraficLight;

public class TrafficLights {
    private Colorable cur;

    public Colorable getCur() {
        return cur;
    }
    public void next(){
        this.cur = cur.next();
    }
}
