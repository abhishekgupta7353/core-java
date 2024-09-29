package bookjava.Linklist;

class Node2{
    int data;
    Node2 prev;
    Node2 next;

    Node2(int data){
        this.data =  data;
        this.next = null;
        this.prev = null;
    }
}
public class Dl {
    Node2 head;
    Node2 tail;

    public void addFirst(int data){
        Node2 newnode = new Node2(data);

        if(head == null){
            head = tail= newnode;
        }
        else{
            newnode.next= head;
            head.prev = newnode;
            head = newnode;
        }
    }
    public void printforward(){
        Node2 temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Dl list = new Dl();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.printforward();
    }
}
