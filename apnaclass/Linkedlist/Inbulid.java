package Linkedlist;

import java.util.LinkedList;

public class Inbulid {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("is");
        list.addLast("a");
        System.out.println(list);
        list.add(2, "good");
        System.out.println(list);
        list.addFirst("abhishek");
        list.addLast("boy");
        System.out.println(list);
        // delete
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.add("abhi");// by default last me add hota h 
        System.out.println(list);
      // list ka size pta karne ke liye

        System.out.println(list.size());

     // list me search karne ke liye
        System.out.println(list.get(2));
    }
}
