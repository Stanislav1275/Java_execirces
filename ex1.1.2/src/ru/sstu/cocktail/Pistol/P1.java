package ru.sstu.cocktail.Pistol;

public class P1 extends Weapon implements INO_AUTOMATIC_DEF {
    private String SHOOT_EFFECT;
    private String PATRONS_IS_GONE_EFFECT;

    public P1(int maxPatronsCount, String SHOOT_EFFECT, String PATRONS_IS_GONE_EFFECT) {
        super(maxPatronsCount);
        this.SHOOT_EFFECT = SHOOT_EFFECT;
        this.PATRONS_IS_GONE_EFFECT = PATRONS_IS_GONE_EFFECT;
    }

    public P1(int maxPatronsCount) {
        this(maxPatronsCount, INO_AUTOMATIC_DEF.SHOOT_EFFECT, INO_AUTOMATIC_DEF.PATRONS_IS_GONE_EFFECT);
    }

    public P1() {
        this(INO_AUTOMATIC_DEF.DEFAULT_PATRONS_COUNT);
    }
    public void shoot() {
        if (patronsCount > 0) {
            patronsCount--;

            System.out.println(SHOOT_EFFECT);
        } else {
            System.out.println(PATRONS_IS_GONE_EFFECT);
        }
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
