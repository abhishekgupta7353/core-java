package bookjava.Linklist;

public class RecursiveNth {
    static Node5 head;
    static class Node5{
        int data;
        Node5 next;

        public Node5(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void addFirst(int data){
        Node5 newnode = new Node5(data);

        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    public static Node5 Nthnode(Node5 head, int nth){
           
        int counter = 0;
        if(head != null){
            Nthnode(head.next, nth);
            counter++;

            if(nth == counter){
                return head;
            }
        }
        return null;
    }
    public static void print(){
        Node5 temp = head;

        while(head!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        RecursiveNth list = new RecursiveNth();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(10);
        System.out.println(Nthnode(head, 2));

    }
}
