package Linkedlist;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Total {
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
       Node newnNode = new Node(data);
       Node temp = head;
       int count = 1;
       while(temp!=null){
          count++;
          temp = temp.next;

          if(count == index){
            Node nextTemp = temp.next;
             temp.next = newnNode;
             newnNode.next = nextTemp;
          }
       }
    }
    public void addlast(int data){
       Node newnNode = new Node(data);
       Node temp = head;
       if(head==null){
        head = newnNode;
       }else{
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnNode;
       }
    }
    // delete method
    // delete first element from the list.
    public void deleteFirsrt(){
        if(head!=null){
            head = head.next;
        }
    }
    
    // delete element in any position from list

    public void deleteIndex(int index){
        Node temp = head;
        int count = 1;
        if(index == 1){
            deleteFirsrt();
        }else{
        while(temp!=null){
            if(count == index-1){
                temp.next = temp.next.next;
            }
            count++;
            temp = temp.next;
        }
        }
    }
    //delte last position of a list

    public void deleteLast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
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
        Total list = new Total();

        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addFirst(60);
        list.printlist();
       /*  list.addFirst(3542);
        list.printlist();
        list.addmid(212,3);
        list.printlist();
        list.addlast(7014);
        list.printlist();
        list.deleteFirsrt();
        list.deleteIndex(8);*/
        list.printlist();
        list.deleteLast();
        list.printlist();

    }
}
