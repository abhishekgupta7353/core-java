package Tree;
import Tree.Height;;
class Node{
    int data ;
    Node left,right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Diameter {
    int index = -1;
    static Node root;

    public Node buildtree(int[] nnodes){
        index++;
        if(nnodes[index]== -1){
            return null;
        }
        Node newnNode = new Node(nnodes[index]);
        newnNode.left = buildtree(nnodes);
        newnNode.right = buildtree(nnodes);
        return newnNode;
    }
    public int diameter(Node temp){
        if(temp == null){
            return 0;
        }
        int diam1 = diameter(temp.left);
        int diam2 = diameter(temp.right);
        int diam3 = heightofTree(temp.left)+heightofTree(temp.right)+1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }
    public static void main(String[] args) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Diameter tree= new Diameter();
        root= tree.buildtree(nodes);
        Node temp = root;
        

    }
}
