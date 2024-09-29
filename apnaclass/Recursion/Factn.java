package Recursion;

public class Factn {
    public static int Fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*Fact(n-1);
       /*  int fact_mn1 = printFact(n-1);
        int fact_n = n*fact_mn1;
        return fact_n;*/
    }
    public static void main(String[] args) {
        int  n = 5;
        int ans = Fact(n);
        System.out.println(ans);    
    }
}
