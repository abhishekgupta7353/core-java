package Linkedlist;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next= null;
    }
}

public class Questionf {
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

    public void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void work(int index){
        Node temp = head;
        Node temp1 = head;
        int  count = 1;

        while(temp.next != null){
            if(count<= index){
                temp = temp.next;
                count++;
            }else{
                temp = temp.next;
                temp1 = temp1.next;
            }
        }
        temp1.next= temp1.next.next;
    }

  public static void main(String[] args) {
    Questionf list = new Questionf();
    list.addDatalast(10);
    list.addDatalast(20);
    list.addDatalast(30);
    list.addDatalast(40);
    list.addDatalast(50);
    list.printList();
    list.work(2);
    list.printList();
  }  
}
