package Oops;

public class Student {
    String name;
    int rolln;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setRolln(int rolln){
        this.rolln = rolln;
    }
    public int getRolln(){
        return this.rolln;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        
        System.out.println("name is:-" +s1.getName());
        System.out.println("rolln is :- "+ s1.getRolln());
        s1.setName("abhi");
        s1.setRolln(123);
        System.out.println("name is:-" +s1.getName());
        System.out.println("rolln is :- "+ s1.getRolln());
    }
}
