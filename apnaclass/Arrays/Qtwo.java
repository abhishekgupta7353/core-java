package Arrays;

import java.util.Scanner;

public class Qtwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colm = sc.nextInt();
        int number[][] = new int[rows][colm];

        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                number[i][j]= sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                if(number[i][j]==x){
                    System.out.println("x is found at index:-" +i+ " " +j);
                }
            }
        }
    }
}
