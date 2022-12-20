
package ru.sstu.cocktail.stVadim;



import ru.sstu.cocktail.ex_1_3_.City_1_3_3.Way;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Skolnik {
    private String Name;
    private List<Predmet> marks = new ArrayList<Predmet>();

    public Skolnik(String Name) {
        this.Name = Name;

    }
    public Skolnik(Skolnik sk){

    }
    
    
    public void SetName(String name)
    {
        this.Name=name;
    }

    @Override
    public String toString() {
        return "Skolnik{" + "Name=" + Name + ", marks=" + marks + '}';
    }

    public void setMarks(List<Predmet> marks) {
        List<Predmet> newMarks = new ArrayList<>();
        for(Predmet predmet:marks){
            predmet = new Predmet(predmet.getName(), predmet.getPrepod(), predmet.getMark());
            newMarks.add(predmet);
        }
        this.marks = newMarks;
    }


    
    
}



//    public void setMarks(List<Integer> marks) {
//        if(marks==null)return;
//        this.marks = marks;
//    }



//    public void setMarks(int...ozenki) {
//
//        for(int i=0;i<ozenki.length;i++)
//        {
//            //if((ozenki[i]>5)||(ozenki[i]<1)) throw new Error("Неверная оценка");
//            if((ozenki[i]>5)||(ozenki[i]<1)) continue;
//                marks.add(ozenki[i]);
//        }