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
public class Height {
    int index = -1;
    static Node root;

   public Node buildtr(int[] nodes){
    index++;
    if(nodes[index] == -1){
        return null;
    }
    Node newNode = new Node(nodes[index]);
    newNode.left = buildtr(nodes);
    newNode.right = buildtr(nodes);
    return newNode;
   }
   /// height of a tree 

   public int heightofTree(Node temp){
      if(temp == null){
        return 0;
      }
      int leftHeight = heightofTree(temp.left);
      int rightHeight = heightofTree(temp.right);

      int heights = Math.max(leftHeight, rightHeight)+1;
      return heights;
   }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Height tree= new Height();
        root= tree.buildtr(nodes);
        Node temp = root;
        System.out.println(tree.heightofTree(temp));
    }
}
