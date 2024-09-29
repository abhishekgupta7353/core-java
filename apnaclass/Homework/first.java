package Homework;

import java.util.Scanner;

public class first {

    // (Q.1)enter three numbers from users and
    // make a function to  there average.
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a+b+c)/3;
        System.out.println("the average of three number is:-" +average);
    }
}
