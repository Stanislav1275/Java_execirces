package ru.sstu.cocktail.sixHead;

public class Car {
    private String color;
    private String model;
    private String id;

    private Car(String color, String model, String id) {
        this.color = color;
        this.model = model;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
    public static class CarBuilder{
        private static CarBuilder instance;
        private String color;
        private String model;
        private String id;


        private CarBuilder() {

        }
        public static CarBuilder create(){
            if(instance == null)instance = new CarBuilder();
            return instance;
        }
        public CarBuilder addColor(String color){
            this.color = color;
            return this;
        }
        public CarBuilder addId(String id){
            this.id = id;
            return this;
        }
        public CarBuilder addModel(String model){
            this.model = model;
            return this;
        }
        public Car build(){
            if((color.equals("") || color.equals("null")) || (model.equals("") || model.equals("null")) || (id.equals("") || id.equals("null")))throw new IllegalArgumentException("все поля должны быть");
             return new Car(color, id, model);
        }

    }

}
