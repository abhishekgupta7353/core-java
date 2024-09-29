package Try;

public class Ob {
    String name;
    int rolln;

    public Ob(){
        name = "abhi";
        rolln = 24;

    }

  /*  public Ob(String name, int rolln){
        this.name = name;
        this.rolln = rolln;
    }
    public Ob(){}

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
    }*/
    public static void main(String[] args) {
        Ob obj1 = new Ob();
        System.out.println(obj1.name+" "+obj1.rolln);
       /*  System.out.println("name is:-" +obj1.getName());
        System.out.println("roll number is:-" +obj1.getRolln());

        obj1.setName("abhi");
        obj1.setRolln(123);
        System.out.println("name is:-" +obj1.getName());
        System.out.println("roll number is:-" +obj1.getRolln());

        Ob obj3 = new Ob();
        obj3.setName("abhi8");
        obj3.setRolln(1237);
        System.out.println("name is:-" +obj3.getName());
        System.out.println("roll number is:-" +obj3.getRolln());


        Ob obj2 = new Ob("amar", 235);
        System.out.println(obj2.getName());
        System.out.println(obj2.getRolln());*/

    }
}


