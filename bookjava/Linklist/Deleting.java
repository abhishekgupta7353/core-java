package bookjava.Linklist;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Deleting {
    Node head;
    public void addfirstel(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    // deleting method  deleting first element of list
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        else{
            head = head.next;
        }
    }
    // deleting element from any position of list
    public void deleteany(int index){
        Node temp = head;
        int count = 1;
        if(count == index){
            deleteFirst();
        }
        else{
            while(temp != null){
                if(count == index-1){
                   temp.next = temp.next.next;
                }
                count++;
                temp = temp.next;
            }
        }
    }
    // delete last element from the list 

    public void delteLast(){
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    // print element
    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Deleting list = new Deleting();
        list.addfirstel(45);
        list.addfirstel(55);
        list.addfirstel(65);
        list.addfirstel(75);
        list.print();
        //list.deleteFirst();
       // list.deleteany(2);
       list.delteLast();
        list.print();
    }
}
