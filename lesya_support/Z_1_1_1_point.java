public class Z_1_1_1_point{
    public static void main(String[] args){
        Time1 time = new Time1(10000);
        System.out.println(time);   
    }
}

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String outputPoint(){
        return String.format("{%d;%d}\n", this.x ,this.y);
    }
}
//String.format("формат", перменные через запятую); - вернуть строку
//String.format("%s не %s", "я", "молодец"); - вывод:я не молодец
