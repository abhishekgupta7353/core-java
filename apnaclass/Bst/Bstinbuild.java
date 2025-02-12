package Bst;
 class Node{
    int data;
    Node left , right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class Bstinbuild {
    static Node root;
    // build tree
    public static Node insertion(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            // left subtree0
            root.left = insertion(root.left, val);
        }
        else{
            root.right = insertion(root.right, val);
        }
        return root;
    }
       // inorder traversal 

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
         // search

    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data > key){ // left subtree
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{
            return search(root.right, key);
        }
    }
         // delete 
         
    public static Node deletNode(Node root, int val){
        if(root.data > val){
            root.left = deletNode(root.left, val);
        }
        else if(root.data < val){
            root.right = deletNode(root.right, val);
        }
        else{
            // root.data == val
            // case 1

            if(root.left == null && root.right == null){
                return null;
            }
            // case 2

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            // case 3
            
            Node IS = inorderSuccessor(root.left);
            root.data = IS.data;
            root.right = deletNode(root.right, IS.data);
        }
        return root;
    }

    public static Node inorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i =0; i<values.length; i++){
           root = insertion(root, values[i]);
        }
         inOrder(root);
         System.out.println();
     
       if(search(root, 10)){
        System.out.println("found");
       }else{
        System.out.println("not found");
       }
      /*  deletNode(root, 3);
       inOrder(root);*/
    }
}
