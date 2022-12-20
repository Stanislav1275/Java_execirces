package ru.sstu.cocktail.fifth_head;

public class Storage<T> {
    private final T object;
    private final T alternative;
    private final Defaultable<T> rule;
    private static boolean containsNull;

    Storage(T object, T alternative, Defaultable<T> rule) {
        this.object = object;
        if (alternative == null) {
            throw new IllegalArgumentException("alternative must be not null");
        }
        this.alternative = alternative;
        this.rule = (rule == null) ? (Defaultable<T>) (o, a) -> (o == null) ? a : o : rule;
    }

    Storage(T object, T alternative) {
        this(object, alternative, null);
    }
    public static<I> Storage<I> create(I object, I alternative, Defaultable<I> rule) throws NullPointerException {
        if (!containsNull) {
            if (object == null) containsNull = true;

        } else if (object == null)
            throw new NullPointerException("Storage can not include NULL more than in one object");

        return (rule != null)?new Storage<I>(object, alternative, rule):new Storage<I>(object, alternative);
    }



    public T getObject() {
        return rule.getDefault(object, alternative);
    }

}
