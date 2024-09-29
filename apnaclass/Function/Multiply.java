package Function;

import java.util.*;

public class Multiply {
    public static int printProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the multiple of a and b id:-"+printProduct(a, b));
    }
}
