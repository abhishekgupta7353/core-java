package Hashset;
import java.util.*;
public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // size 
        System.out.println("size of set is:-" +set.size());

        // seearch
        if(set.contains(1)){
            System.out.println("present");
        }

        if(!set.contains(7)){
            System.out.println("not present");
        }
        
        // remove
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("absent");
        }

        // print all elements
        System.out.println(set);

        // itretion hashset does not have 
        set.add(0);
        Iterator it = set.iterator();
         while(it.hasNext()){
            System.out.println(it.next()+ " ");
         }
         System.out.println();
       
         // set is empty

        if(!set.isEmpty()){
            System.out.println("set is empty");
        }
    }
}
