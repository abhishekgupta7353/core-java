package Function;

import java.util.*;

public class Add {
    public static int addNumber(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

       // System.out.println("the sum of a and b is:-" +sum);
       //System.out.println(addNumber(a, b));
    }
}
