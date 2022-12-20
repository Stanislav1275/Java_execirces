package ru.sstu.cocktail.stVadim;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Karatist {
    public String name;
    List <Bully> priems = new ArrayList<>();
    public Karatist(String name) {
        this.name = name;
    }
//
//    public void headPunch(){
//        System.out.println("head");
//    }
//    public void feetPunch(){
//        System.out.println("feet");
//    }
//    public void jumpPunch(){
//        System.out.println("jump");
//    }
    public void doCombinate(Bully ...priems){
       this.priems.addAll(List.of(priems));
    }

    @Override
    public String toString() {
        String res = "";
        for(Bully priem:priems) res += priem.hit(name) + " ";
        res += "\n";
        return res;
    }
}
