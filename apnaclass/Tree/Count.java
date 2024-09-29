package Tree;
class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Count {
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
    // count the index in a given tree

    public int countNode(Node temp){
       if(temp == null){
        return 0;
       }
        int leftNodes = countNode(temp.left);
        int rightNodes = countNode(temp.right);

        return leftNodes + rightNodes + 1;
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2,4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Count tree = new Count();
        root = tree.buildtree(nodes);
        Node temp = root;
        System.out.println(tree.countNode(temp));
    }
}
