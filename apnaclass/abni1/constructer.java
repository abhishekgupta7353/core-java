class employee{
    String name;
    String work;
    float salary;

    void display(){
        System.out.println("the name of employee is:-" +name);
        System.out.println("the work of employee:-" +work);
        System.out.println("the salary is:-" +salary);
    }
}
   // poly + morphishm = many + forms;

class book {
    String author;
    String title;
    double price;

    void books(String title){
        System.out.println("the title  of this book is:-" +title);
    }
    void books(String author,double price ){
        System.out.println("author:-"+author);
        System.out.println("price:-"+price);
    }
    void books(String author,String title,double price){
        System.out.println("author:-"+author);
        System.out.println("title:-"+title);
        System.out.println("price:-"+price);
    }
}
    // construction
class flat{
    String name;
    int flatno;
    flat(){
        System.out.println("called construction");
    }
    flat(String name,int flatno){
        this.name = name;
        this.flatno = flatno;
    }
    void Show(){
        System.out.println(this.name+" "+this.flatno);
    }
}

public class constructer {

    public static void main(String[] args) {
    employee e1 = new employee();
    e1.name = "nikh";
    e1.salary = 12.5f;
    e1.work = "timepass";
    employee e2 = new employee();
    e2.name="abhi";
    e2.work="jobless";
    e2.salary= 574869f;
    e1.display();
    e2.display(); 
    
    book ab = new book();
    ab.author = "abhishek";
    ab.title ="radhe";
    ab.price= 15;
    ab.books("radhe radhe");
    ab.books("abhishek",54.54);
    ab.books("abhishek","radhe radhe",54.54);
    
    flat sk = new flat();
    flat pk = new flat("amar",114);
    pk.Show();
    }}