public class Z_1_1_2_name{
    public static void main(String[] args){
        Name name1 = new Name("Станислав","","Викторович");
    }
}
class Name{
    String name;
    String surname;
    String patron;

    Name(String surname, String name, String patron){
        this.name = name;
        this.surname = surname;
        this.patron = patron;
    }
    public String outputHuman(){
        return "";

    }
}
