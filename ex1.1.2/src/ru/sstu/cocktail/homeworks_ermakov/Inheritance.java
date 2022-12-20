package ru.sstu.cocktail.homeworks_ermakov;

public class Inheritance {
    public static void main(String[] args) {
        B b = new B("s","s1");
        System.out.println(b.s1);


    }
}

class A{
    String s;

    private String s1;

    public A(String s) {
        this.s = s;
    }

    public void  dislay() {
        System.out.println("A");
    }
}
class B extends  A{
    public String s1;

    public B(String s, String s1) {
        super(s);
        this.s1 = s1;
    }
    public void  dislay(boolean isA) {
        System.out.println((isA)?"A":"B");
    }
    public void  dislay() {
        dislay(false);
    }
}
