import java.util.*;
public class account {

    private String name;
    private int adharrno;
    private int age;
    private double balance;                  

    public void account_detais(){
        Scanner ak = new Scanner(System.in);
        String name;
        int age,adharno;
        double balance;
        System.out.print("enter your age:-");
        age = ak.nextInt();

        if(age>18){
          System.err.println("you can open your accouunt");
          return;
        }
        System.out.println("enter your name:-");
        name = ak.nextLine();
        System.out.println("enter your adaharno:-");
        adharno = ak.nextInt();
        System.out.println("enter your minimum balance:-");
        balance = ak.nextDouble();
        
        this.name = name;
        this.age = age;
        this.adharrno = adharno;
        this.balance = balance;
        }
    public void dd(){
        System.out.println("the account holdeer name is:-" +name);
        System.out.println("the age of holdeer is:-" +age);
        System.out.println("the adharno of holdeer is:-" +adharrno);
        System.out.println("the minimum balance of holdeer is:-" +balance);
    }
    public static void main(String[] args){
        account dk = new account();
        dk.name = "abhishek";
        dk.age = 24;
        dk.adharrno = 1001;
        dk.balance = 8379;
        dk.dd();
    }
    }

