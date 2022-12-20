package ru.sstu.cocktail.Cat;

public class Cat implements Meowable{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void meow(){
        meow(1);
    }
    public void meow(int n){
        for(int i = 0; i < n; n++)
            System.out.println("я ПЛИИТА");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
