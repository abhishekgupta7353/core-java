package Homework;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int positive = 0;
        int negitive = 0;
        int zero = 0 ;

        System.out.println("press 1 to continue & 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input==1) {
            System.out.println("enter your number:-");
            int number = sc.nextInt();
            if(number>0){
                positive++;
            }else if(number<0){
                negitive++;
            }else{
                zero++;
            }
            System.out.println("press 1 to continue & 0 to stop");
             input = sc.nextInt();
        }
        System.out.println("positives:-" +positive);
        System.out.println("negatives:-" +negitive);
        System.out.println("zeros:-" +zero);
    }
}
