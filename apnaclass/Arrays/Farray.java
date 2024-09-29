package Arrays;

import java.util.Scanner;

public class Farray {
    public static void main(String[] args) {
        // first type 
        int marks[] = new int[3];
        
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
       /* 
        System.out.println(marks[0]);   is vale method se print karana bahut
        System.out.println(marks[1]);   hard h agr large numbeer ho to 
        System.out.println(marks[2]);   possible nhin h isliye ioop ka use 
                                        ka use karte h jo hamare kaam ko 
                                        easy kr deta h
                                        */
        // this is loop for print
        for(int i=0; i<3; i++){
            System.out.println(marks[i]);
        }

        // second type 
         int number[] = {97,98,99};
         for(int j=0; j<3; j++){
            System.out.println(number[j]);
         }
              
         // user input arrays element 
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
         int element[] = new int[size];

         for(int i=0; i<size; i++){
            element[i] = sc.nextInt();
         }
         for(int i=0; i<size; i++){
            System.out.println(element[i]);
         }

    }
}
