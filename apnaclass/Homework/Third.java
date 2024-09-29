package Homework;

import java.util.Scanner;

public class Third {
    // (Q.3)write a function which takes 2 number and return
    //  the greater of these two.
    public static int printGreater(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the greater number is:-" +printGreater(a, b));
    }
}
