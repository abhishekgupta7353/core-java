package Arrays;

import java.util.Scanner;

public class Qone {
    public static void main(String[] args) {
        /* take an array as a input from the user search for a given number
           x and print the index at which it occurs.
         */
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int number[] = new int[size];
        
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=0; i<number.length; i++){
        if(number[i]==x){
            System.out.println("x is found at index:-" +i);
        }
    }
    }
}
