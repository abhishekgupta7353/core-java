package Oops;
class Shape{
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
public class Singleinh {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(5, 10);
        
    }
}
