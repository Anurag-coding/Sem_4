class Node {
    int data;
    Node left, right;
    Node(int value) {
        data = value;
        left = right = null;
    }
}
public class q2 {
    // CreateTree method to construct BST recursively
    public static Node createTree(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createTree(arr, start, mid - 1);
        root.right = createTree(arr, mid + 1, end);
        return root;
    }
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Node root = createTree(arr, 0, arr.length - 1);
        System.out.print("Inorder Traversal of BST: ");
        inorder(root);
        System.out.println();
    }
}
/* output:-
   Inorder Traversal of BST: 10 20 30 40 50 60 70 80 90 100 
*/
