package Hashmap;

import java.util.HashMap;

public class Itinerary {
    public static String getStart(HashMap<String, String> tick){

        HashMap<String, String> revMap = new HashMap<>();

        for(String Key: tick.keySet()){
            revMap.put(tick.get(Key), Key);
        }

        for(String Key: tick.keySet()){
            if(!revMap.containsKey(Key)){
                return Key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
