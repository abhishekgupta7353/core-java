package Linkedlist;

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
public class Doubly {
    Node2 head;
    Node2 tail;
    
    // adding node in begining of list

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
     // adding node in list at any position

    public void addAnyPosition(int data, int index){
        Node2 newnode = new Node2(data);

        if(index <0){
            System.out.println("invalid index");
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }

        Node2 temp = head;

        for(int i=0; temp!=null && i<index-1; i++){
              temp = temp.next;
        }
        if(temp == null){
            System.out.println("index out of bond");
            addlast(data);
            return;
        }
        newnode.next = temp.next;
        newnode.prev = temp;

        if(temp.next != null){
            temp.next.prev = newnode;
        }
        temp.next =newnode;

        if(newnode.next == null){
            tail = newnode;
        }
    }

       // adding node in last position of node

    public void addlast(int data){
        Node2 newnode = new Node2(data);

        if(head == null){
            head = tail = newnode;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }
    // deleting mathod
    // delete first node of list

    public void deleteFirsrt(){
        
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(head == tail){
            head = tail = null;
        }
        else{
            head = head.next;
            head.prev = null;
        }
    }

    // delete last node of list
    
    public void deletelast(){
        if(tail == null){
            System.out.println("list is empty");
            return;
        }

        if(head == tail){
            head = tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    // delete node at any position of list

    public void deleteAtposition(int index){
        if(head == null || index<0){
            System.out.println("invalid or list is empty");
            return;
        }
        Node2 temp = head;
        if(index == 0){
            deleteFirsrt();
            return;
        }

        for(int i=0; temp!=null && i<index; i++){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("position out of bounds");
            return;
        }
        if(temp == tail){
            deletelast();
        }
        else{
            temp.prev.next = temp.next;
            if(temp.next != null){
                temp.next.prev = temp.prev;
            }
        }
    }

    // print list from forward

    public void printforward(){
        Node2 temp = head;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
     
    // print list from backward

    public void printBackward(){
        Node2 temp = tail;

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }


    public static void main(String[] args) {
        Doubly list = new Doubly();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
       // list.printforward();
       // list.printBackward();
       list.addAnyPosition(56, 0);
       list.addlast(87);
       list.printBackward();
        System.out.println();
       //list.deleteFirsrt();
       //list.deletelast();
       list.deleteAtposition(2);
       list.printBackward();
    }
}
