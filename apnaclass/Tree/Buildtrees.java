package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Buildtrees {
    int index=-1;
    static Node root;
   // build tree method 
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
    // preorder traversing.

    public void preOrder(Node tmp){
        if(tmp == null){
            return;
        }
        System.out.print(tmp.data+" ");
        preOrder(tmp.left);
        preOrder(tmp.right);
    }
    // inorder traversing.

    public void inOrder(Node temp){
        if(temp == null){
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
    }
     // postorder traversing 

       public void postOrder(Node temp){
        if(temp == null){
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data+" ");
       }
       // level-order traversing

       public void levelOrder(Node temp){
        Queue<Node> q = new LinkedList<>();
         q.add(temp);
         while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.data+" ");

            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
         }
       }
     
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Buildtrees tree= new Buildtrees();
        root= tree.buildTree(nodes);
        Node temp = root;
        tree.preOrder(temp);
        System.out.println();
        tree.inOrder(temp);
        System.out.println();
        tree.postOrder(temp);

        System.out.println();
        tree.levelOrder(temp);
    }
}
