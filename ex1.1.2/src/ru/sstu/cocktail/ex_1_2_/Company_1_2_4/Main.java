package ru.sstu.cocktail.ex_1_2_.Company_1_2_4;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Department IT = new Department("IT");
        Department MARKETING = new Department("MARKETING");
        Employee em1 = new Employee("I1 KAK PROSTO",IT);
        Employee em2 = new Employee("I2 KAK PROSTO",IT
            );
        Employee em3 = new Employee("I3 KAK PROSTO",MARKETING);
        IT.setBoss(em1);
        em1.setDepartment(MARKETING);
        System.out.println(IT);
        System.out.println(MARKETING);

        System.out.println(em1);
//
        System.out.println(em2);
        System.out.println(em3);
    }
}
