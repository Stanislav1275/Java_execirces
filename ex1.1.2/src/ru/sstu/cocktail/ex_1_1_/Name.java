package ru.sstu.cocktail.ex_1_1_;

public class Name {
    private String name;
    private String surname;
    private String patronymic;

    public Name(String name) {
        this("", name, "");
    }

    public Name(String surname, String name) {
        this(surname, name, "");
    }

    private static void fixNames(String name, String patronymic, String surname) {
        if (isEmpty(name) && isEmpty(patronymic) && isEmpty(surname))
            throw new IllegalArgumentException("пустого ФИО быть не может");
    }

    public Name(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        fixNames(name, surname, patronymic);
    }

    public Name(Name nameEmpty) {
        this(nameEmpty.name, nameEmpty.surname, nameEmpty.patronymic);
    }

    public Name(NameGenerator nameEmpty) {
        this(nameEmpty.name, nameEmpty.surname, nameEmpty.patronymic);
    }

    @Override
    public String toString() {

        String fullName = "";
//        fullName += (!isEmpty(this.name))?name+" ":(!isEmpty(this.surname))?surname+" ":(!isEmpty(patronymic))?patronymic:"";
        if (!isEmpty(this.surname)) fullName += this.surname + " ";
        if (!isEmpty(this.name)) fullName += this.name + " ";
        if (!isEmpty(this.patronymic)) fullName += this.patronymic;
        return fullName;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    private static boolean isEmpty(String string) {
        return string == null || string == "";
    }

    //    public void setName(String newS){
//        this.name = newS;
//    }
    public void setSurname(String newS) {
        this.surname = newS;
    }

    public void setPatronymic(String newS) {
        this.patronymic = newS;
    }


    public static class NameGenerator {
        private static NameGenerator instance;
        private String name;
        private String surname;
        private String patronymic;

        public static NameGenerator create() {
            if (instance == null) {
                instance = new NameGenerator();
            }
            return instance;
        }

        private NameGenerator() {
        }
        public NameGenerator(NameGenerator nameGenerator) {
            this.name = nameGenerator.name;
            this.surname = nameGenerator.surname;
            this.patronymic = nameGenerator.patronymic;
        }

        public Name build() {
            Name clone = new Name(this);
            name = null;
            surname = null;
            patronymic = null;
            return clone;
        }

        public NameGenerator addName(String name) {
            this.name = name;
            return this;
        }

        public NameGenerator addSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public NameGenerator addPatron(String patron) {
            this.patronymic = patron;
            return this;
        }

    }
}
