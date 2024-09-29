package Tree;
class Node{
    int data ;
    Node left, right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Sumnode {
    int index = -1;
    static Node root;
    
    public Node buildtree(int[] nodes){
        index++;
        if(nodes[index]== -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildtree(nodes);
        newNode.right = buildtree(nodes);
        return newNode;
    }
    // sum of nodes in a given tree.

    public int sumofNodes(Node temp){
        if(temp == null){
            return 0;
        }
        
        int leftSum = sumofNodes(temp.left);
        int rightSum = sumofNodes(temp.right);

        return leftSum + rightSum + temp.data;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Sumnode tree= new Sumnode();
        root= tree.buildtree(nodes);
        Node temp = root;
        System.out.println(tree.sumofNodes(temp));
    }
}
