//import javax.lang.model.util.Elements;

// Java program to demonstrate
// insert operation in binary
// search tree
public class BST {

    /* Class containing left
    and right child of current node
    * and key value*/
    class Node {
        int key;
        Node left, right;


        public Node(int item)
        {
            key = item;
            left = null;
            right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BST()
    {
        root = null;
    }


    // This method mainly calls InorderRec()
    void inorder()
    {
        inorderRec(root);
        System.out.println();
    }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    // This method mainly calls PreorderRec()
    void preorder()
    {
        preorderRec(root);
        System.out.println();
    }

    // A utility function to
    // do preorder traversal of BST
    void preorderRec(Node root)
    {
        if (root != null) {
            System.out.println(root.key);
            inorderRec(root.left);
            inorderRec(root.right);
        }

    }


    // This method mainly calls PostorderRec()
    void postorder()
    {
        preorderRec(root);
        System.out.println();
    }

    // A utility function to
    // do postorder traversal of BST
    void postorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.println(root.key);
        }

    }





    // This method mainly calls insertRec()
    void insert(int key)
    {
        root = insertRec(root, key);
    }

    /* A recursive function to
    insert a new key in BST */
    Node insertRec(Node root, int key)
    {

		/* If the tree is empty,
		return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    Node treeSearch(Node root,int key){
        if (root == null || key==root.key) {
            return root;
        }
        if (key < root.key){
            return treeSearch(root.left, key);
        }
        else{
            return treeSearch(root.right, key);
        }
    }

    boolean search(int key){
        Node node = treeSearch(root,key);
        if (node != null && node.key == key) {
            return true;
        }
        return false;
    }

    int absolute_minimum(){
        int result = -1;
        Node node = root;
        result = minimum(node);

        return result;
    }

    int minimum(Node node){
        while (node.left != null){
            node = node.left;
            minimum(node);
        }
        return node.key;
    }

    int absolute_maximum(){
        int result = -1;
        Node node = root;
        result = minimum(node);

        return result;
    }

    int maximum(Node node){
        while (node.right != null){
            node = node.right;
            maximum(node);
        }
        return node.key;
    }


    int child(Node node){
        while (node.left != null){
            node = node.left;
            minimum(node);
        }
        return node.key;
    }


}
// This code is contributed by Ankur Narain Verma
