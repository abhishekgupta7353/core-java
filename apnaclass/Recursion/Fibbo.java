package Recursion;

public class Fibbo {
    public static int printFibo(int n) {
        if(n==0){
           return 0;
        }
        if(n== 1 || n== 2){
            return 1;
        }
        return printFibo(n-1)+printFibo(n-2);
    }
    public static void main(String[] args) {
        for(int n=0; n<=10; n++){
         System.out.println(printFibo(n));
        }
    }
}
