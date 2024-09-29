package String;

import java.util.Scanner;

public class Declaration {
    // declaration of string in java.
    public static void main(String[] args) {
        String name = "abhishek don ";
        System.out.println(name);
    
    // taking string input from the user.
     Scanner sc = new Scanner(System.in);
     String sb = sc.next(); 
    // concatenation (joining 2 string)
    String fname = "abhishek";
    String lname = "kumar";
    String fullname = fname+ " " +lname;
    System.out.println(fullname);
        
}
}
