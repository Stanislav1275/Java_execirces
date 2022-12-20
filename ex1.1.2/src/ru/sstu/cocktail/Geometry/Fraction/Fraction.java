package ru.sstu.cocktail.Geometry.Fraction;

import java.util.Objects;

public final class Fraction extends Number implements Cloneable {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction sum(Fraction fraction) {
        return getResult(fraction, "+");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public Fraction sum(int number) {
        return sum(new Fraction(number));
    }

    public Fraction minus(Fraction fraction) {
        return getResult(fraction, "-");
    }

    public Fraction minus(int number) {
        return minus(new Fraction(number));
    }

    protected void normalizeFr() {
        if (denominator < 0) {
            denominator *= -1;
            numerator *= -1;
        }
    }

    @Override
    public Fraction clone() throws CloneNotSupportedException {
        return (Fraction) super.clone();
    }

    private Fraction getResult(Fraction fraction, String actor) {
        normalizeFr();
        int commonDenominator = getCommonDenominator(this.denominator, fraction.denominator);

        int numerator1 = (commonDenominator / denominator) * numerator;
        int numerator2 = (commonDenominator / fraction.denominator) * fraction.numerator;
        Fraction res;
        if (actor == "-")
            res = new Fraction(numerator1 - numerator2, commonDenominator);
        else if (actor == "+")
            res = new Fraction(numerator1 + numerator2, commonDenominator);
        else if (actor == "*")
            res = new Fraction(this.numerator * fraction.numerator, this.denominator * fraction.denominator);
        else if (actor == "/")
            res = new Fraction(this.numerator * fraction.denominator, this.denominator * fraction.numerator);
        else throw new Error("нет знака такого");
        displayAction(this, fraction, actor, res);
        return res.shortF();

    }

    public Fraction multiply(Fraction fraction) {
        Fraction res = getResult(fraction, "*");
        return res;
    }

    public Fraction multiply(int number) {
        return multiply(new Fraction(number));
    }

    public Fraction div(Fraction fraction) {
        Fraction res = getResult(fraction, "-");
        return res;
    }

    public Fraction div(int number) {
        return div(new Fraction(number));
    }

    private void displayAction(Fraction fr1, Fraction fr2, String actor, Fraction result) {

        String res = "";
        Fraction correctResult = result.shortF();
        String correctRes = (correctResult.denominator == 1) ? "" + correctResult.numerator : correctResult.toString();
        if (NOD(result.denominator, result.numerator) == 1) {
            res = String.format("%s %s %s = %s\n", fr1, actor, fr2, correctRes);

        } else {
            System.out.println(1);
            res = String.format("%s %s %s = %s = %s\n", fr1, actor, fr2, correctResult, correctRes);

        }

        System.out.println(res);
    }


    public Fraction shortF() {

        return shortF(this);
    }

    public Fraction shortF(Fraction fr) {
        normalizeFr();
        int nod = NOD(fr.denominator, fr.numerator);
        return new Fraction(fr.numerator / nod, fr.denominator / nod);

    }


    private void setDenominator(int denominator) {
        normalizeFr();
        this.denominator = denominator;
    }

    private static int NOD(int x, int y) {

        if (y == 0) return x;
        return Math.abs(NOD(y, x % y));
    }

    private int NOD(Fraction f) {
        int y = f.denominator;
        int x = this.denominator;
        return NOD(x, y);
    }

    private int getCommonDenominator(int den1, int den2) {
        return den1 * den2 / NOD(den1, den2);

    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public int intValue() {
        return numerator / denominator;
    }

    @Override
    public long longValue() {
        return intValue();
    }

    @Override
    public float floatValue() {
        return ((float) numerator) / ((float) denominator);
    }

    @Override
    public double doubleValue() {
        return ((double) numerator) / ((double) denominator);

    }
}
