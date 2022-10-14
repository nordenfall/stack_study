package Practice1;


import java.util.Scanner;

public class eq14 {
    public static void res(){
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Количество чисел");
        int i = scan.nextInt();
        int[] mas = new int[i];
        int min = 100000;
        int max = 0;

        for (int l = 0; l < i; l++){
            if (scan.hasNextInt()){
                int num = scan.nextInt();
                mas[l] = num;
                if(mas[l] > max){
                    max = mas[l];
                }
                if(mas[l] < min){
                    min = mas[l];
                }
            }
        }

        int id = 0;
        while(id != i){
            sum += mas[id];
            id++;
        }
        System.out.println("Сумма " + sum);
        System.out.println("min" + min);
        System.out.println("max" + max);
    }

    public static void main(String[] args){
        res();
    }
}
