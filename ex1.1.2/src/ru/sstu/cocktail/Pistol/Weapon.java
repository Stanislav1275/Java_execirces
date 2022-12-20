package ru.sstu.cocktail.Pistol;

import java.sql.SQLOutput;

public abstract class Weapon {
    protected int patronsCount = 0;
    protected int maxPatronsCount;

    protected Weapon(int maxPatronsCount) {
        setPatronsCount(maxPatronsCount);
    }


    public int shootingCount() {
        return maxPatronsCount - patronsCount;
    }

    public int discharge() {
        int p = patronsCount;
        patronsCount = 0;
        return p;

    }
    public abstract void shoot();
    public int reload(int newPatrons) {
        if (newPatrons < 0) {
            throw new IllegalArgumentException("нЕВАлидное колво патронов");
        }
        int d = maxPatronsCount - patronsCount;
        if (d < newPatrons) {
            this.patronsCount = maxPatronsCount;
            return d;
        } else {

            this.patronsCount += newPatrons;

            return 0;
        }


    }
    public int getMaxPatronsCount() {
        return maxPatronsCount;
    }

    public int getPatronsCount() {
        return patronsCount;
    }
    public int unload(){
        int psC = patronsCount;
        patronsCount = 0;
        return psC;

    }
    public void setPatronsCount(int maxPatronsCount) {
        if (maxPatronsCount > 0) this.maxPatronsCount = maxPatronsCount;
        else throw new IllegalArgumentException("невалидное колво патронов");
    }
    public abstract String getShootEffect();

    public abstract void setShootEffect(String SHOOT_EFFECT);

    public abstract String getPatronsIsGoneEffect();

    public abstract void setPatronsIsGoneEffect(String PATRONS_IS_GONE_EFFECT);

}
