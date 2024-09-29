package bookjava.Linklist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Addingel {
    Node head;
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }
    public void addmid(int data, int index){
        Node newnode = new Node(data);
        Node temp = head;
        int count = 1;
        while(temp != null){
            count++;
            temp = temp.next;

            if(count == index){
                Node nextTemp = temp.next;
                temp.next = newnode;
                newnode.next = nextTemp;
            }
        }
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        Node temp = head;
        if(head == null){
            head = newnode;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newnode;
        }    
    }

    public void printlist(){
        Node temp = head;
        while(temp!=null){
         System.out.print(temp.data+ "->");
         temp = temp.next;
        }
         System.out.println("null");
     }
     public static void main(String[] args) {
        Addingel li = new Addingel();
        li.addFirst(10);
        li.addFirst(20);
        li.addFirst(30);
        li.addFirst(40);
        li.printlist();
        li.addLast(25);
        li.printlist();
        li.addmid(356, 2);
        li.printlist();
     }
}
