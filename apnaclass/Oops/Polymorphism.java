package Oops;

public class Polymorphism {
    String name;
    int age;
    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name , int age){
        System.out.println(name+" "+age);
    }
    public static void main(String[] args) {
        Polymorphism a1 = new Polymorphism();
        a1.printinfo("abhi", 10);
    }
}
