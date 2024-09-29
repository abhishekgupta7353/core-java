package Linkedlist;

 class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Singly {
    Node head;
    // first me data dalne ke liye

    public void addDatast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }else{
        newnode.next = head;
        head = newnode;
        }
    }
    // middle me data dalne ke liye 
    public void addDatamid(int data, int index){
        Node temp = head;
        Node newnode = new Node(data);
        int count = 1;
        while(temp != null){
            count++;
            temp = temp.next;
            if(count == index){
               Node nextTemp = temp.next;
               temp.next =newnode;
               newnode.next = nextTemp;
            }
         }
     }
     // last me data dalne ke liye

     public void addDataend(int data){
        Node temp = head;
        Node endnode = new Node(data);
        if(head == null){
           head = endnode;
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = endnode;
        }
     }
     // print karane ke liye 

    public void printlist(){
       Node temp = head;
       while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
       }
    }

    public static void main(String[] args) {
        Singly start = new Singly();
        start.addDatast(10);
        start.addDatast(20);
        start.addDatast(30);
        start.addDatast(40);
        start.addDatamid(25,4);
        start.addDataend(500);
        start.printlist();
    }
}
