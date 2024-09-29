package Try;
class Nodes{
    int data;
    Nodes next;

    Nodes(int data){
        this.data = data;
        this.next = null;
    }
}
public class Liinklist {
      Nodes head;

      public void addDatafirst(int data){
        Nodes newnode = new Nodes(data);

        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
      }
      public void addmid(int data, int index){
        
        Nodes newnode = new Nodes(data);
        Nodes temp = head;
        int count = 1;

        while(temp != null){
            count++;
            temp = temp.next;

            if(count == index){
                Nodes nextTemp = temp.next;
                temp.next = newnode;
                newnode.next = nextTemp;
            }
        }
    }
    public void printlist(){
        Nodes temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    

    public static void main(String[] args) {
        Liinklist list = new Liinklist();

        list.addDatafirst(10);
        list.addDatafirst(20);
        list.addDatafirst(30);
        list.addDatafirst(40);
        list.addmid(25, 2);
        list.printlist();
    }
}
