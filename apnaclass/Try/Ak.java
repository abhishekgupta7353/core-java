package Try;

class Cond{
    String name;
    int age;

    Cond(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Cond(name:"+this.name+",age"+this.age+")";
    }
}
public class Ak {
    public static void main(String[] args) {
        Cond sp = new Cond("abhi",250);
        System.out.println(sp);

        Cond sp1 = new Cond("abhi2",2502);
        System.out.println(sp1);
    }
}
