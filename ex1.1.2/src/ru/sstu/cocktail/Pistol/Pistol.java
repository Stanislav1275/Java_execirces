package ru.sstu.cocktail.Pistol;

public class Pistol  implements INO_AUTOMATIC_DEF {
    private int patronsCount = 0;
    private int maxPatronsCount;
    private String SHOOT_EFFECT;
    private String PATRONS_IS_GONE_EFFECT;

    public Pistol(int maxPatronsCount, String SHOOT_EFFECT, String PATRONS_IS_GONE_EFFECT) {
        setMaxPatronsCount(maxPatronsCount);

        this.SHOOT_EFFECT = SHOOT_EFFECT;
        this.PATRONS_IS_GONE_EFFECT = PATRONS_IS_GONE_EFFECT;
    }

    public Pistol(int maxPatronsCount) {
        this(maxPatronsCount, INO_AUTOMATIC_DEF.SHOOT_EFFECT, INO_AUTOMATIC_DEF.PATRONS_IS_GONE_EFFECT);
    }

    public Pistol() {
        this(INO_AUTOMATIC_DEF.DEFAULT_PATRONS_COUNT);
    }


    public int shootingCount() {
        return maxPatronsCount - patronsCount;
    }

    public int discharge() {
        int p = patronsCount;
        patronsCount = 0;
        return p;

    }

    public int reload(int newPatrons) {
        if (newPatrons < 0) {
            throw new IllegalArgumentException("нЕВАлидное колво патронов");
        }
        int d = maxPatronsCount - patronsCount;
        if (d < newPatrons) {
            patronsCount = maxPatronsCount;
            return d;
        } else {
            patronsCount += newPatrons;
            return 0;
        }


    }

    public void shoot() {
        if (patronsCount > 0) {
            patronsCount--;

            System.out.println(SHOOT_EFFECT);
        } else {
            System.out.println(PATRONS_IS_GONE_EFFECT);
        }
    }


    public int getMaxPatronsCount() {
        return maxPatronsCount;
    }

    public int getPatronsCount() {
        return patronsCount;
    }

    protected void setMaxPatronsCount(int maxPatronsCount) {
        if (maxPatronsCount > 0) this.maxPatronsCount = maxPatronsCount;
        else throw new IllegalArgumentException("невалидное колво патронов");
    }


    public String getShootEffect() {
        return SHOOT_EFFECT;
    }

    public void setShootEffect(String SHOOT_EFFECT) {
        this.SHOOT_EFFECT = SHOOT_EFFECT;
    }

    public String getPatronsIsGoneEffect() {
        return PATRONS_IS_GONE_EFFECT;
    }

    public void setPatronsIsGoneEffect(String PATRONS_IS_GONE_EFFECT) {
        this.PATRONS_IS_GONE_EFFECT = PATRONS_IS_GONE_EFFECT;
    }

}
