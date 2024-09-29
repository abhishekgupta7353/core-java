package Linkedlist;
class Node4{
    int data;
    Node4 next;

    Node4(int data){
        this.data = data;
        this.next = null;
    }
}
public class Circleddelete {
    private Node4 head = null;
    private Node4 tail = null;
     
    public void addBegin(int data){
        Node4 newnode = new Node4(data);
        
        if(head == null){
            head = newnode;
            tail = newnode;
            tail.next = head;
        }else{
        newnode.next = head ;
        head = newnode;
        tail.next = head;
        }
    }

    public void display(){
        Node4 temp = head;
        while(temp != tail){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        if(temp == tail){
            System.out.print(temp.data+" ");
        }
    }
     // delete first node of the list

     public void deletefirst(){

        if(head == null){
            System.out.println("list is emmpty");
        }else{
            tail.next = head.next;
            head = head.next;
        }
     }
      public void deleteLastNode(){
        Node4 temp = head;
        
        while(temp.next.next != tail.next){
            temp = temp.next;
        }
        temp.next = tail.next;
        tail = temp;
    }
       // delte a node at the any index in the list

       public void deleteAtIndex(int index){
        Node4 temp = head;
        int count = 1;

        if(index == 1){
            deletefirst();
        }else{
        while(temp != tail){ 
            if(count == index-1){
                temp.next = temp.next.next; 
            }
            count++;
            temp = temp.next;
        }
        }
       }
    public static void main(String[] args) {
        Circleddelete li = new Circleddelete();
        li.addBegin(10);
        li.addBegin(15);
        li.addBegin(25);
        li.addBegin(29);
        li.display();
        System.out.println();
      //  li.deletefirst();
      //li.deleteLastNode();
      li.deleteAtIndex(3);
        li.display();
    }    
}
