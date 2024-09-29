package Try;

public class Binary {
    int data;
    Binary left;
    Binary right;

    Binary(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public static void buildTree(int nodes[]) {
        int index = -1;
        index++;
        if(nodes[index] == -1){
           return ;
        }
        Binary newBinary = new Binary(index);
        
    }
    public static void main(String[] args) {
        
    }
}
