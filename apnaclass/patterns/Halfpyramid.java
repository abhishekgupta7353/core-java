package patterns;

public class Halfpyramid {
    public static void main(String[] args) {

        /* (Q.3) Half pyramid
         * 
         **
         ***
         ****
         */
        
        int n =4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
