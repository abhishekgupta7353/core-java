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

public class New {
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

    public void preOrder(Node tmp){
        if(tmp == null){
            return;
        }
        System.out.print(tmp.data+" ");
        preOrder(tmp.left);
        preOrder(tmp.right);
    }
    public void inOrder(Node tmp){
        if(tmp == null){
            return;
        }
        inOrder(tmp.left);
        System.out.print(tmp.data+" ");
        inOrder(tmp.right);
    }
    public void postOrder(Node tmp){
        if(tmp == null){
            return;
        }
        postOrder(tmp.left);
        postOrder(tmp.right);
        System.out.print(tmp.data+" ");
    }
    public void levelOrder(Node tmp1){
        Queue<Node> q = new LinkedList<>();
         q.add(tmp1);
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
    public int height(Node root){
        if(root == null){
            return 0;
        }
        return (height(root.left) + height(root.right))+1; 
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        New tree= new New();
        root= tree.buildTree(nodes);

        Node tmp1=root;
        tree.preOrder(tmp1);
        System.out.println();
        tree.inOrder(tmp1);
        System.out.println();
        tree.postOrder(tmp1);
        System.out.println();
        tree.levelOrder(tmp1);
        System.out.println();
        System.out.println(tree.height(tmp1));
        
    }

}
