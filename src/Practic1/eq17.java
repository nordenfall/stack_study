package Practic1;
import java.util.Scanner;

public class eq17 {
    public static int func(int a){
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = 0;
        if (sc.hasNextInt()){
            input = sc.nextInt();
        }
        System.out.println(func(input));
    }
}
