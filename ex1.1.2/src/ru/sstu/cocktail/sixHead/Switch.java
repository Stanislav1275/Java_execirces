package ru.sstu.cocktail.sixHead;


public class Switch<Up, Down> {
    public Up flipUpCommand;
    public Down flipDownCommand;

    public Switch(Up flipUpCommand, Down flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

//    public void flipUp() {
//        flipUpCommand.execute();
//    }
//
//    public void flipDown() {
//        flipDownCommand.execute();
//    }
}
