package ru.sstu.cocktail.sixHead;
public class Default <T>{
    private final Command<T> command;
    Default(Command<T> command) {this.command = command;}
    public T getCorrect(T def){return (command != null && command.execute()!=null)?def:command.execute();}
}
