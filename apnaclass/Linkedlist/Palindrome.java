package Linkedlist;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next= null;
    }
}
public class Palindrome {
    static Node head;
    static Node reverse;
    
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

    public void printList(Node temp){
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void Reverse(){

        if(head == null || head.next == null){
            return;
        }
        reverse = head;
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        reverse.next = null;
        reverse = prevNode;
    }
    public static void main(String[] args) {
        Palindrome list = new Palindrome();

        list.addDatalast(10);
        list.addDatalast(20);
        list.addDatalast(30);
        list.addDatalast(40);
        list.addDatalast(50);
        list.addDatalast(60);
        list.addDatalast(70);
    
    }
}
