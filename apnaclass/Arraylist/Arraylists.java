package Arraylist;
import java.util.*;
public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add element in list

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
       
        // to get an element
        int element = list.get(2);
        System.out.println(element);
        
        // add element in between index
        list.add(1,8);
        System.out.println(list);

        // set element 
        list.set(2,7);
        System.out.println(list);

        // delete element from index
        list.remove(3);
        System.out.println(list);

        // size of listy
        int size = list.size();
        System.out.println(size);

        // loop in list 
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+"");
        }
        System.out.println();

        // sorting the list
        Collections.sort(list);
        System.out.println(list);
    }
}
