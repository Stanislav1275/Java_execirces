package ru.sstu.cocktail.Polymormizm;

public class Polymorfizm {
    public static void main(String[] args) {
        D d = new D("ds");
        System.out.println(d.txt);
        d.displaySuper();
    }
}
class A{
    String txt="qq";
    public A(){}
    public A(String txt) {
        this.txt = txt;
    }
}
class B extends A{
    String txt;
    public B(){}
    public B(String txt) {
        this.txt = txt;
    }
}
class D extends B{
    String txt;
    public D(String txt){
        this.txt = txt;

    }
    public void displaySuper(){
        System.out.println(((A)(this)).txt);
    }
}