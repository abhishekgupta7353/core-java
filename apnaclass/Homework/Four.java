package Homework;

import java.util.Scanner;


public class Four {
    // (Q.4)write a function that takes in the redius as input and 
    // return the circumfrence of a circle.

    public static double printCricumfrence(double r){
        return 2*3.14*r;
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(printCricumfrence(r));
    }
    


}
