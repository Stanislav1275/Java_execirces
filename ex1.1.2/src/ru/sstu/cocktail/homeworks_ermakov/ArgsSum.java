package ru.sstu.cocktail.homeworks_ermakov;

public class ArgsSum {
    public static void main(String[] args) {

        double sum = 0.0;
        for (String arg : args) {
            try{
                sum += Double.parseDouble(arg);
            }catch (Exception e){
                continue;
            }
        }
        System.out.printf("sum =%f\n",sum);

        int []a = ClassHelper.concat(new int[] {1,2,3}, new int[]{4,5});
        for(int el:a) System.out.println(el);

    }


}
