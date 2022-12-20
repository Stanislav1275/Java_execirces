package ru.sstu.cocktail.Converter;

import java.io.Reader;

public interface ChangeHandler {
    Reader change(Readable readable);
}
