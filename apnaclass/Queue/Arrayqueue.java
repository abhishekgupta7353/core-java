package Queue;

public class Arrayqueue {
    static class Queue {
           static int arr[];
           static int size;
           static int  rear= -1;
        
           Queue(int n){
            arr = new int[n];
            this.size = n;
           }     
           

    public static boolean isEmpty(){
        boolean isEmpty = false;
        if(rear == -1){
            isEmpty = true;
        }
        return isEmpty;
    }
         // Eenqueue (add)

    public static void add(int data){
        if(rear == size-1){
            System.out.println("full queue");
            return;
        }
        rear++;
        arr[rear] = data;
    }
          //dequeue (remove)
    
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front = arr[0];

        for(int i=0; i<rear; i++){
            arr[i]= arr[i+1];
        }
        rear--;
        return front;
    }

        // peek 

    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is emprty");
            return -1;
        }
        return arr[0];
    }
         
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
        }
    }
}

