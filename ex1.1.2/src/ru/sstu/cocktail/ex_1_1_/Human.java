package ru.sstu.cocktail.ex_1_1_;

public class Human {
    private int height;
    private Name name;
    //    private  nameS;
    final Human father;

    public Human(String name, int height) {
        this(name, height, null);
    }

    public Human(Name name, int height) {
        this(name, height, null);
    }

    public Human(String name, int height, Human father) {
        this(new Name(name), height, father);
    }

    public Human(Name name, int height, Human father) {

        this.name = name;
        this.father = father;
        this.height = height;
        synhronise();

    }

    @Override
    public String toString() {
        return (this.father != null) ? String.format("Персона - %s, рост - %d, отец - %s\n", this.getName(), this.height, this.father.getName()) :
                String.format("Персона - %s, рост - %d\n", this.getName(), this.height);
    }

    public Name getName() {
        return this.name;
    }

    private void synhronise() {
        if (this.father != null) {
            if (this.father.getName().getSurname() != this.getName().getSurname())
                if (this.getName().getSurname() != "") {
                    this.getName().setSurname(this.father.getName().getSurname());
                }
            if (this.father.getName().getName() != "")
                this.getName().setPatronymic(this.father.getName().getName() + "Ович");
        }


    }


    public String getInfo() {

        return String.format("Name:%s, Height:%d\n", this.name, this.height);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height <= 0 || height > 500) throw new IllegalArgumentException("невалидный рост");
        this.height = height;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Human getFather() {
        return father;
    }


}
