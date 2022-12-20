package ru.sstu.cocktail.sixHead.Commands;

import ru.sstu.cocktail.sixHead.Command;
import ru.sstu.cocktail.sixHead.Student;

public class removeMark implements Command{


    public Student<?> st;

    public void execute(int index) {
        st.delMark(index);
    }

    public removeMark(Student<?> st) {
        this.st = st;
    }

    @Override
    public void execute() {

    }
}
