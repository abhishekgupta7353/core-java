package Homework;

import java.util.*;

public class Second {
    // (Q.2)write the function to print the sum of all odd number 
    // from 1 to n.
    public static void printSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum = sum+i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);
    }
}
