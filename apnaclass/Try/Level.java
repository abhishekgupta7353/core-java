package Try;

import java.util.LinkedList;
import java.util.Queue;
class Node{

    int data;
    Node left, right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Level {
    int index=-1;
    static Node root;

    public Node buildTree(int[] nodes){
        index++;
        if(nodes[index] == -1){
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
    public void levelOrder(Node root){
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.data+" ");

            if(curr.left!= null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
         }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2,4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Level tree= new Level();
        root= tree.buildTree(nodes); 
        tree.levelOrder(root);
        
    }
}
