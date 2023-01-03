package ru.sstu.cocktail;

import ru.sstu.cocktail.Birds.IBird;
import ru.sstu.cocktail.Birds.Popuguy;
import ru.sstu.cocktail.Birds.Qqushka;
import ru.sstu.cocktail.Birds.Vorobey;
import ru.sstu.cocktail.Cat.Cat;
import ru.sstu.cocktail.Geometry.Fraction.Figure.Circle;
import ru.sstu.cocktail.Geometry.Fraction.Figure.Figure;
import ru.sstu.cocktail.Geometry.Fraction.Figure.Square;
import ru.sstu.cocktail.Geometry.Fraction.Fraction;
import ru.sstu.cocktail.Interfaces.IcanGetPolyline;
import ru.sstu.cocktail.Interfaces.Longable;
import ru.sstu.cocktail.Pistol.Machine;
import ru.sstu.cocktail.Geometry.Fraction.*;
import ru.sstu.cocktail.Temporary.ActualTmp;
import ru.sstu.cocktail.ex_1_1_.*;
import ru.sstu.cocktail.ex_1_2_.Company_1_2_4.Department;
import ru.sstu.cocktail.ex_1_2_.Company_1_2_4.Employee;
import ru.sstu.cocktail.ex_1_3_.Broken;
import ru.sstu.cocktail.ex_1_3_.ClosedBroken;
import ru.sstu.cocktail.sixHead.Parent;
import ru.sstu.cocktail.sixHead.Student;
//import ru.sstu.cocktail.sixHead.Watcher.*;
//import ru.sstu.cocktail.sixHead.Watcher.Human;
import java.util.*;


public class Tasks {
    public static void main(String[] args) {
//        EX_1_5.ex_1_5_1();
//        EX_1_5.ex_1_5_2();
//        EX_1_5.ex_1_5_4();
//        EX_1_5.ex_1_5_5();
//        EX_1_5.ex_1_5_6();
//            ex_1_1_4();
//            ex_1_4_7();
//        EX_1_5.ex_1_5_8();
//        EX_1_5.ex_1_5_7();
//        star();
//        EX_3.ex_2_4();
//        EX_3.ex_2_5();
//        EX_3.ex_3_1(1, 2, 3, new Fraction(1, 3));
//        EX_3.ex_3_4(new MyString("dsds"), new Square(2));
//        EX_3.ex_3_2(new Vorobey(), new Qqushka(), new Popuguy("aboba"));
//        EX_3.ex_3_3(new Circle(5), new Rectangle(2,5), new Square(5), new Triangle(new Point2D(0,0), new Point2D(1,0), new Point2D(0,9)));
//        Ex_5.ex_5_1_1();

//        ActualTmp tmp = new ActualTmp(50);
//        System.out.println(tmp);
//        ch_6.block_3.ex_11();
//        Student<Integer> st = new Student<>("ds");
//        Parent<Integer> p = new Parent<>(x -> x > 3);
//        p.addChild(st);
//        st.addMark(2);
        Name.NameGenerator nameGenerator = Name.NameGenerator.create().addSurname("Иванов").addPatron("Криллович").addPatron("Иванович").addName("Иван");
        System.out.println(nameGenerator.build());
    }

    public static Object m(Object o) {
        return o;
    }

    //1.1.3
    static class EX_3 {
        public static void ex_4_1() {

        }

        public static void ex_2_1() {
            Vorobey v = new Vorobey();
            v.song();
            Qqushka q = new Qqushka();
            q.song();
            Popuguy p = new Popuguy("а");
            p.song();
        }

        public static void ex_2_4() {
            Figure circle = new Circle(2);
            System.out.println(circle.area());
            Figure square = new Square(2);
        }

        public static void ex_2_6() {
            Figure circle = new Circle(2);
            System.out.println(circle.area());
            Figure square = new Square(2);
        }


        public static void ex_2_5() {
            Map<String, Object> attrs = new LinkedHashMap<>();
            attrs.put("x", 3);
            attrs.put("y", 1);
            attrs.put("z", 2);
            attrs.put("цвет", "красный");
            CleverPoint cleverPoint = new CleverPoint(attrs);
            System.out.println(cleverPoint);
        }

        public static void ex_3_2(IBird... birds) {
            for (IBird bird : birds) {
                bird.song();
            }
        }

        public static void ex_3_3(Figure... figures) {
            for (Figure figure : figures) {
                System.out.println(figure.area());
            }
        }

        public static void ex_3_7(IcanGetPolyline... lines) {
            Broken br = new Broken();
            for (IcanGetPolyline line : lines) {
                br.addPoints(line.getBroken().getPoints());
            }
            System.out.println(br);
        }

        public static void ex_3_4(Longable... lines) {
            int sumL = 0;
            for (Longable line : lines) {

                sumL += line.getLength();
            }
            System.out.println(sumL);

        }

        public static void ex_3_1(Number... numbers) {
            double res = 0;
            for (Number number : numbers) {
                res += number.doubleValue();
            }
            System.out.println(res);
        }

    }

    static class EX_4 {
        public static void ex_2_3() {
            Fraction fr = new Fraction(1, 2);
            System.out.println(fr.equals(fr.clone()));

        }

        public static void ex_2_4() throws CloneNotSupportedException {
            Point2D p1 = new Point2D(1, 2);
            Point2D p2 = p1.clone();
        }
    }

    static class EX_1_5 {
        public static void ex_1_5_6() {
//            Student st1 = new Student("Вася", new ArrayList<Integer>(Arrays.asList(3, 5, 5, 5)));
//            Student st2 = new Student("Петя", st1.getMarks());
//            Student st3 = new Student("Коля", null);
//            st1.setMark(0, 5);
//            System.out.println(st1);
//            st2.setMark(0, 3);
//            st3.setMarks(st1.getMarks());
//            st3.addMarks(1, 2, 3);
//            System.out.println(st2);
//            System.out.println(st3);

        }

        public static void ex_1_5_7() {
            Broken p1 = new ClosedBroken(
                    new Point2D(1, 5),
                    new Point2D(2, 8),
                    new Point2D(5, 3)
            );

            p1.addPoints(new Point2D(1, 1));
            System.out.println(p1);
        }

        public static void ex_1_5_1() {
            Machine auto = new Machine();
            auto.reload(5);
            auto.shoot(1);

        }

        public static void ex_1_5_2() {
            Cat cat1 = new Cat("BARSIK");
            cat1.meow(3);
            cat1.meow();
            System.out.println(cat1);

        }

        public static void ex_1_5_4() {
            Time time = new Time(32056);
            System.out.println(time);
        }

        public static void ex_1_5_5() {
            Fraction fr = new Fraction(1, 3);
            System.out.println(fr.doubleValue());
        }

        public static void ex_1_5_8() {
            Square sq = new Square(2);
            System.out.println(sq);
        }
    }


    //
    public static void ex_1_4_7() {
//        Human h1 = new Human(new Name("Иванов", "Альберт"), 180, new Human("Василий", 180));
//        Human h2 = new Human(new Name("Иванов", "Альберт", "Васильевич"), 180, new Human(new Name("Афанасьеф", "Альберт"), 180));
//        Human h3 = new Human(new Name("Иванов1", "Альберт1"), 180, h2);
//        System.out.println(h1);
//        System.out.println(h2);
//        System.out.println(h3);
    }

    public static void star() {
        Point2D point2D = new Point3D(1, 2, 3);
        System.out.println(point2D);
//        MyPoint p1 = MyPoint.create(1, 1);
//        MyPoint p2 = MyPoint.create(1, 1);
//        System.out.println(p1 == p2);
    }

    public static void ex_1_1_4() {
        Department IT = new Department("IT");
        Department MT = new Department("MT");
        Employee em1 = new Employee("Козлов", IT);
        Employee em2 = new Employee("Козлов1", MT);
        Employee em3 = new Employee("Козлов2", IT);
        Employee em4 = new Employee("Козлов3", MT);
        IT.setBoss(em1);
        IT.setBoss(em3);

        System.out.println(em1);
        System.out.println(IT);
    }

    public static class ch_6 {
        public static class block_3 {
            public static void ex_11() {
//                 Human h = new Human();
//                Student st = new Student("Стас", 1);
//                Teacher t = new Teacher("Саша Ермаков", 1, "Попуск");
//                Watcher w = new Watcher();
//                System.out.println(w.visit(h));
//                System.out.println(w.visit(t));
//                System.out.println(w.visit(st));
                Student<Integer> st = new Student<>("name");
                st.setName("43");
                st.setName("Илья");
                st.setName("аБОБА");
                st.undo();
                st.undo();
                st.undo();

                st.redo();
                System.out.println(st.name);

            }
        }
    }
    //
}
