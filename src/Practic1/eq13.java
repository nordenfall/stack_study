package Practic1;

public class eq13 {
    public static void res(int[] mas){
        int sum = 0;
        for(int i : mas){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        res(a);
    }


}
