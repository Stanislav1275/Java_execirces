package ru.sstu.cocktail.fifth_head;

public class Ex_5 {
    public static void main() {
        ex_5_1_1();
    }


    public static void ex_5_1_1() {
        Box<Integer> box = new Box<>();
        box.putObject(3);

        int a = box.takeObject();
        System.out.println(box);
    }

    public static void ex_5_1_2() {
        Defaultable<String> ruleString1 = (obj, alt) -> (alt.equals(obj) ? obj:alt);
        Defaultable<Integer> ruleInteger1 = (obj, alt) -> (obj == 99?alt:obj);

        Storage<Integer> stor1 = new Storage<>(null, 0);
        Storage<String> stor2 = new Storage<>(null, "default");
        Storage<Integer> stor3 = new Storage<>(99, -1, ruleInteger1);
        Storage<Integer> stor5 = new Storage<>(99, -1);
        Storage<String> stor4 = new Storage<>("hello", "hello world", ruleString1);
        System.out.println(stor1.getObject());
        System.out.println(stor2.getObject());
        System.out.println(stor3.getObject());
        System.out.println(stor4.getObject());
        System.out.println(stor5.getObject());

    }
}
