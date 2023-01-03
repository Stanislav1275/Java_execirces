

public class Time1{
    private int fullSeconds;
    int s;
    int m;
    int h;
    public Time1(int fullSeconds){
        this.fullSeconds = fullSeconds;
    }
    public int getFullSeconds(){
        return this.fullSeconds;
    }
    public void setSeconds(int newSeconds){
        this.fullSeconds = newSeconds;
    }
    private void getFullTime(){
        h = this.fullSeconds / 3600 % 24;
        m = this.fullSeconds/60%60;
        s = this.fullSeconds%60;

    }
    // private String getFormattedForm(int n){
    //     return n < 10?"0" + n:n+""; 
    // }
    static private String getFormattedStr(int n ){
        return n < 10?"0" + n:n+"";

    }
    @Override
    public  String toString(){
        this.getFullTime();
        return String.format("%s:%s:%s\n",Time1.getFormattedStr(this.h), Time1.getFormattedStr(this.m), Time1.getFormattedStr(this.s));
    }

}