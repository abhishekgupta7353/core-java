package bookjava.Linklist;
class Nodes{
    int data;
    Nodes next;

    Nodes(int data){
        this.data = data;
        this.next = null;
    }
}
public class Stacklinklist {
     Nodes  head;

        /*  push function */

    public void push(int data){
        Nodes newnode = new Nodes(data);
        if(head == null){
            head = newnode;
            return;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    /*  pop function  */

    public int pop(){
        if(head == null){
            System.out.println("list is empty");
        }
        int top = head.data;
        head = head.next;
        return top;
        }
         /* peek function  */

         public int peek(){
            if(head ==  null){
                return -1;
            }
            return head.data;
         }
          /*  print the list  */
    public void print(){
        Nodes temp = head;
        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Stacklinklist list = new Stacklinklist();
         list.push(10);
         list.push(20);
         list.push(30);
         list.print();
         System.out.println();
         list.pop();
         list.print();
         System.out.println();
         list.peek();
         list.print();
    }
}
