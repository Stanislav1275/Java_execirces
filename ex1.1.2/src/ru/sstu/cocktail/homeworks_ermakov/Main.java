package ru.sstu.cocktail.homeworks_ermakov;


//p
//P
public class Main {
    public static void main(String[] args) {

    }
}

class Person extends Object{
    String name;
    String hone;


    public Person(String name, String hone) {
        this.name = name;
        this.hone = hone;
    }

    public void display() {
        System.out.println(name + "-" + hone + '\n');
    }
}

class Client extends Person {
    String INN;

    public Client(String name, String hone, String INN) {
        super(name, hone);
        this.INN = INN;
    }
    @Override
    public void display() {
        System.out.println(name + "-" + hone + INN + '\n');
    }

}