public class school {
    private String name;
    private int rollno, age;
    private double percentage;

    // setter 
    public void setname(String name){
       this.name = name;
    }
    public void setrollno(int rollno){
        this.rollno = rollno;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setpercentage(double percentage){
        this.percentage = percentage;
    }
     /// geteer 

    public void getname(){
        System.out.println("the name of student is:-" +this.name);
    }
    public void getrollno(){
        System.out.println("your rollno is:-" +this.rollno);
    }
    public void getage(){
        System.out.println("the age of student is:-" +this.age);
    }
    public void getpercentage(){
        System.out.println("your percentage is :-" +this.percentage);
    }
    public void display(){
        System.out.println("the name of student is:-" +this.name);
        System.out.println("your rollno is:-" +this.rollno);
        System.out.println("the age of student is:-" +this.age);
        System.out.println("your percentage is :-" +this.percentage);
    } 
    public static void main(String[] args){
        school da = new school();
        da.name = "abhi";
        da.rollno = 223003;
        da.age = 24;
        da.percentage = 78;
        da.display();
    }   
    }
    

