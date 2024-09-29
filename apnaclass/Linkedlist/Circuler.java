package Linkedlist;

class Node3{
    int data;
    Node3 next;

    Node3(int data){
        this.data = data;
        this.next = null;
    }
}
public class Circuler {
    private Node3 head = null;
    private Node3 tail = null;

    // insert a node at the begining of list

    public void addBegin(int data){
        Node3 newnnode = new Node3(data);

        if(head == null){
            head = newnnode;
            tail = newnnode;
            tail.next = head;
        }
        else{
            newnnode.next = head;
            head = newnnode;
            tail.next = head;
        }
    }

    // insert a node at specific position

    public void addAnyIndex(int data, int index){
        Node3 newnode = new Node3(data);

        /****  insert at begining */
    if(index == 1){
        if(head == null){
            head = newnode;
            tail = newnode;
            newnode.next = head;
        }
        else{
            newnode.next = head;
            head = newnode;
            tail.next = head;
        }
        return;
    }
      Node3 current = head;
      int count = 1;
      while(count < index-1){
        current = current.next;
        count++;
      }
      newnode.next = current.next;
      current.next = newnode;

      if(current == tail){
        tail = newnode;
      }
    }

    // insert a node to the end of list

    public void addlast(int data){

        Node3 newnode = new Node3(data);

        if(head == null){
            head = newnode;
            tail = newnode;
            newnode.next = head;
        }
        else{
            tail.next = newnode;
            tail = newnode;
            tail.next = head;
        }
    }

    // method to display the node 
    
    public void display(){
       /*  Node3 current = head;

        if(head != null){
            do{
                System.out.print(current.data+" ");
                current = current.next;
            }while(current != head);
            System.out.println();
        }
        else{
            System.out.println("the list is empty");
        }*/

        Node3 temp = head;

        while(temp != tail){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        if(temp == tail){
            System.out.print(temp.data+" ");
        }
    }

    public static void main(String[] args) {
        Circuler list = new Circuler();

        list.addBegin(10);
        list.addBegin(20);
        list.addBegin(30);
        list.display();
       /*  list.addAnyIndex(35, 1);
        list.display();
        list.addlast(67);
        list.display();*/
        
    }
}
