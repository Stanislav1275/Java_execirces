import  static java.lang.System.*;



public class StaticInitialisator{
    public static void main(String[] args) {

        out.println(1);
        A a = new A();
        A b = new A();
        out.println(a.getId());
    }
    static int fib(int n ){
        if(n == 0 || n == 1) return n;
        else return fib(n-1) + fib(n-2);
    }


}
class A{
    private int id;
    static int counter;
    static{
        counter = 1;
        out.println("initializer");
    }
    A(){
        id = counter++;
    }
    public int getId(){return id;}

}