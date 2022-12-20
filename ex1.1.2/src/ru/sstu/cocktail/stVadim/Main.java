package ru.sstu.cocktail.stVadim;

//1.1(Класс)//Point,Human,Name,Time,House
//1.2(Блоки)//Line,Human(name),Human(father),(Work,Worker)
//1.3(Массивы)//Student,MultiLine,City,(Work,Worker)
//1.4(Конструкторы)//Point,Line,House,Time,Name,Human,Student,City,MultiLine
//1.5(Методы)//Gun,Cat,Line,Time,Fraction,Student,MultiLine,Square
//1.6(Инкапсуляция)//House,Time,Square,Fraction,Gunreload,Line,Name,Human,Student,(Road,City)---1.6.11

public class Main {
    public static void main(String[] args) {
        Karatist k = new Karatist("SASHA");
        k.doCombinate(new HeadHit(),new HeadHit(), new FeetHit(), new JumpHit());
        System.out.println(k);
    }
}
