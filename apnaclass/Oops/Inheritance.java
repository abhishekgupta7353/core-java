package Oops;
class Shape{
    String color;
}
class triangle extends Shape{
     // inherit the property of shape class
}

public class Inheritance {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.color = "red";
        System.out.println("the color is:-" +t1.color);
    }
}
