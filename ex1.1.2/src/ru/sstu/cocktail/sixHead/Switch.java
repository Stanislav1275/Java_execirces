package ru.sstu.cocktail.sixHead;

import ru.sstu.cocktail.sixHead.Commands.Action;

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
