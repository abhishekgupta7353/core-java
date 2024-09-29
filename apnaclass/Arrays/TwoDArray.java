package Arrays;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colm = sc.nextInt();

        int number[][] = new int[rows][colm];

        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                number[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<colm; j++){
                System.out.print(number[i][j] +" ");
            }
            System.out.println();
        }
    }
}
