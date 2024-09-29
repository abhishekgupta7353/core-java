package Linkedlist;
class Node{
     int data;
     Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Reverse {  
    Node head;

    public void addDatalast(int data){
        Node temp = head;
        Node newnNode = new Node(data);
        if(head == null){
            head = newnNode;
        }else{
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnNode;
        }
    }

    public void ReverseList(){
    if(head == null || head.next == null){
        return;
    }
    Node prevNode = head;
    Node currNode = head.next;
    while(currNode!=null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;
        // update 
        prevNode = currNode;
        currNode = nextNode;
    }
     head.next = null;
     head = prevNode;
    }

    public void printlist(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.addDatalast(10);
        list.addDatalast(20);
        list.addDatalast(30);
        list.addDatalast(40);
        list.addDatalast(50);
        list.addDatalast(60);
        list.addDatalast(70);
        list.printlist();
        list.ReverseList();
        list.printlist();
    }
}
