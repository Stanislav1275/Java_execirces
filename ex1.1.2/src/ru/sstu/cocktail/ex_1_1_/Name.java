package ru.sstu.cocktail.ex_1_1_;

public class Name {
    final  String name;
    private String surname;
    private String patronymic;
    public Name(String name){
        this("",name,"");
    }
    public Name(String surname, String name){
        this(surname, name, "");
    }
    private void fixNames(){
        if(isEmpty(name) && isEmpty(patronymic) && isEmpty(surname))throw new IllegalArgumentException("пустого ФИО быть не может");
    }
    public Name(String surname, String name, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        fixNames();
    }
    @Override
    public String toString(){

        String fullName = "";
//        fullName += (!isEmpty(this.name))?name+" ":(!isEmpty(this.surname))?surname+" ":(!isEmpty(patronymic))?patronymic:"";
        if(!isEmpty(this.surname))fullName += this.surname + " ";
        if(!isEmpty(this.name))fullName += this.name + " ";
        if(!isEmpty(this.patronymic))fullName += this.patronymic;
        return fullName;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getPatronymic(){
        return this.patronymic;
    }
    private static  boolean isEmpty(String string){
        return string == null || string == "";
    }

//    public void setName(String newS){
//        this.name = newS;
//    }
    public void setSurname(String newS){
        this.surname = newS;
    }
    public void setPatronymic(String newS){
        this.patronymic = newS;
    }
}
