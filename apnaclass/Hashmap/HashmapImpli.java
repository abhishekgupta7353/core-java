package Hashmap;
import java.util.*;
public class HashmapImpli {
    static class hashMap<k,v>{

        private class Node{
            k key;
            v value;

            public Node(k key, v value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;  // n-nodes
        private int N;  // N-buckets
        private LinkedList<Node> buckets[]; // N = bucket.length

        @SuppressWarnings("unchecked")

        public hashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];

            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key){
            int bi = key.hashCode();  // bi = bucket index
            return Math.abs(bi)%N;
        }

        private int searchInll(k key, int bi){
            LinkedList<Node> ll = buckets[bi];

            for(int i =0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;  // di
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")

        private void rehash(){
            LinkedList<Node> oldbucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<n*2; i++){
                buckets[i]= new LinkedList<>();
            }
            for(int i=0; i<oldbucket.length; i++){
                LinkedList<Node> ll = oldbucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(k key, v value){

            int bi = hashFunction(key);
            int di = searchInll(key, bi);

            if(di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda >2.0){
                rehash();
            }
        }

        public boolean containsKey(k key){
            int bi = hashFunction(key);
            int di = searchInll(key, bi);

            if(di == -1){
                return false;
            }
            else{
               return true;
            }
        }

        public V remove(k key){
            int bi = hashFunction(key);
            int di = searchInll(key, bi);

            if(di == -1){
                return null;
            }
            else{
               Node node = buckets[bi].remove(di);
               n--;
               return node.value;
            }
        }

        public v get(k key){
            int bi = hashFunction(key);
            int di = searchInll(key, bi);

            if(di == -1){
                return null;
            }
            else{
               Node node =buckets[bi].get(di);
               return node.value;
            }
        }

        public ArrayList<k> keySet(){
            ArrayList<k> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node= ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("india" , 300);
        map.put("china", 200);
        map.put("us", 150);

      /*   ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }*/

        map.remove("china");
        System.out.println(map.get("china"));
    }
}
