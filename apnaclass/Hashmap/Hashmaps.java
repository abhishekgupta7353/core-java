package Hashmap;

import java.util.*;

public class Hashmaps {
    public static void main(String[] args) {
        // creation

        HashMap<String, Integer> map = new HashMap<>();

        // insertion 
        System.out.println("add hoke print hua h");

        map.put("india" , 250);
        map.put("us", 540);
        map.put("china", 254);
        map.put("bihar", 524);

        System.out.print(map);
        System.out.println();

        // search
        System.out.println();
        System.out.println("search method result below");

        if(map.containsKey("bihar")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("bihar")); // value print krane 
        System.out.println();

        // iteration(1) 
        System.out.println("pahla iteration below");
        
        for(Map.Entry<String, Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
        System.out.println();
        // iteration(2)    
        System.out.println();
        System.out.println("dusra iteration method result");
        Set<String> keys = map.keySet();
        
        for(String key : keys){
            System.out.println(key+ " " +map.get(key));
        }
        System.out.println();

        // removing 
         System.out.println();
         System.out.println("removing method hum china ko remove kr rhe h");
        map.remove("china");
        System.out.println(map);
    }
}
