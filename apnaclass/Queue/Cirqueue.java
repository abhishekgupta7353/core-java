package Queue;

public class Cirqueue {

    static class Queuecir{
        static int arr[];
        static int size;
        static int front =-1;
        static int rear = -1;

        Queuecir(int size){
            this.size = size;
            arr = new int [size];
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        // Enqueue (add)

        public static void add(int data){
             if(isFull()){
                System.out.println("overflow");
                return;
             }
             // if its the last element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]= data;
        }
           // dequeue (remove)

        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
           // peek 

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queuecir q = new Queuecir(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        q.add(5);
        System.out.println(q.remove());
        q.add(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
