class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}
public class q3 {
    // Main method to check if a tree is a BST
    boolean isBST(Node root) {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    // Helper method that checks the BST property within given min/max range
    boolean isBSTUtil(Node node, int min, int max) {
        // An empty tree is a BST
        if (node == null)
            return true;
        if (node.data <= min || node.data >= max)
            return false;
        // Check recursively for left and right subtrees
        return isBSTUtil(node.left, min, node.data) &&
               isBSTUtil(node.right, node.data, max);
    }
    public static void main(String[] args) {
        q3 treeChecker = new q3();
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);
        if (treeChecker.isBST(root))
            System.out.println("The tree is a Binary Search Tree.");
        else
            System.out.println("The tree is NOT a Binary Search Tree.");
    }
}
/* output:-
   The tree is a Binary Search Tree.
 */
