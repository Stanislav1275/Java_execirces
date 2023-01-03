public class Z_1_1_2_human{
    public static void main(String[] args){
        Human h1 = new Human("Леся Ноги", 180);
        Human h2 = new Human("Леся Гоги", 180);
        Human h3 = new Human("Леся боги", 180);
        System.out.println(h1.outputHuman());
    }
}
class Human{
    String name;
    int height;
    Human(String name, int height){
        this.name = name;
        this.height = height;
    }
    public String outputHuman(){
        // return "d";
        return String.format("{%d;%d}\n", this.name ,this.height);

    }
}
