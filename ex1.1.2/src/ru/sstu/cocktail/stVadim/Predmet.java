
package ru.sstu.cocktail.stVadim;

public class Predmet {
    private String name;
    private String prepod;
    private Integer mark;

    public Predmet(String name, String prepod, Integer mark) {
        this.name = name;
        this.prepod = prepod;
        setMark(mark);
    }

    public String getName() {
        return name;
    }

    public String getPrepod() {
        return prepod;
    }

    public Integer getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrepod(String prepod) {
        this.prepod = prepod;
    }


    public void setMark(Integer mark) {
        if((mark>1)&&(mark<6))this.mark = mark;
        else throw new Error("Иди нахуй");
    }

    @Override
    public String toString() {
        //return "Predmet{" + "name=" + name + ", prepod=" + prepod + ", mark=" + mark + '}';
        return name +" "+ prepod +" "+ mark;
    }
    
    
}
