package Recursion;

public class Firstc {
    // print number 5 to 1 . 
    public static void printNum(int num) {
        if(num==0){
          return;
        }
        System.out.println(num);
        printNum(num-1);
    }
    public static void main(String[] args) {
        int num = 5;
        printNum(num);
    }
}
