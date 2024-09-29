package Homework;

import java.util.Scanner;

public class Five {
    public static boolean printAge(int age){
        if(age>18){
            return true;
        }else{
           return false; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(printAge(age));
    }
}
