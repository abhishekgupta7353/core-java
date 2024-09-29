package patterns;

public class Nhp {
    public static void main(String[] args) {
        
        /* (Q.6) half pyramid with number.
         1
         12
         123
         1234
         12345

         */

        int n=5;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
