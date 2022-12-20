package ru.sstu.cocktail.Pistol;

public class Machine extends P1 implements IAUTOMATIC_DEF{
    private int rate = IAUTOMATIC_DEF.DEF_RATE_COUNT;

    public Machine(int maxPatronsCount, String SHOOT_EFFECT, String PATRONS_IS_GONE_EFFECT, int rate) {
        super(maxPatronsCount, SHOOT_EFFECT, PATRONS_IS_GONE_EFFECT);
        setRate(rate);
    }

    public Machine(int maxPatronsCount, int rate) {
        this(maxPatronsCount, SHOOT_EFFECT, PATRONS_IS_GONE_EFFECT, rate);
    }

    public Machine(int maxPatronsCount) {
        this(maxPatronsCount, maxPatronsCount/2);
    }

    public Machine() {
        this(IAUTOMATIC_DEF.DEFAULT_PATRONS_COUNT, DEF_RATE_COUNT);
    }
    @Override
    public void shoot(){
        for(int i = 0; i < rate; i++){
            super.shoot();
        }
    }
    public void shoot(int n){
        for(int i = 0; i < n; i++){
            shoot();
        }
    }

    public void setRate(int rate) {
        if(rate>0)
            this.rate = rate;
        else throw new IllegalArgumentException("invalid rate fire, must be positive");
    }

}
