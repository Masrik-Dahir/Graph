public class Main_BST {
    // Driver Code
    public static void main(String[] args) {
        BST tree = new BST();

		/* Let us create following BST

		  50
		/	 \
	   30	  70
	   / \    / \
	  20 40  60 80

	  */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();

        // print preorder traversal of the BST
        tree.preorder();

        // print postorder traversal of the BST
        tree.postorder();

        System.out.println(tree.search(30));
        System.out.println(tree.absolute_minimum());

    }
}
