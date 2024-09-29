package Hashmap;
import java.security.Key;
import java.util.*;
public class Majorityelement {
     public static void majorityEl(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

       // map.entrySet().stream().filter(x -> x.getValue()>n/3).forEach(x -> System.out.println(x.getKey()));
       
        for(int key : map.keySet()){
            System.out.println(key+" "+map.get(key));
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
     }
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1 , 3, 1, 5, 1};
        majorityEl(nums);
    } 
}
