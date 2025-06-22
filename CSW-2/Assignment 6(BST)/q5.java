class TreeNode {
    int key;
    TreeNode left, right;
    public TreeNode(int key) {
        this.key = key;
        left = right = null;
    }
}
public class q5{
    TreeNode root;
    public void insert(int key) {
        root = insertRec(root, key);
    }
    private TreeNode insertRec(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else {
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    public TreeNode deleteNode(TreeNode root, int x) {
        if (root == null) return null;
        // Search for the node to be deleted
        if (x < root.key) {
            root.left = deleteNode(root.left, x);
        } else if (x > root.key) {
            root.right = deleteNode(root.right, x);
        } else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            else {
                TreeNode successor = findMin(root.right);
                root.key = successor.key;
                root.right = deleteNode(root.right, successor.key);
            }
        }
        return root;
    }
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        q5 bst = new q5();
        // Insert nodes into BST
        int[] nodes = {50, 30, 70, 20, 40, 60, 80};
        for (int node : nodes) {
            bst.insert(node);
        }
        System.out.println("Inorder traversal before deletion:");
        bst.inorder(bst.root);
        System.out.println();
        // Delete a node
        bst.root = bst.deleteNode(bst.root, 50);
        System.out.println("Inorder traversal after deleting 50:");
        bst.inorder(bst.root);
        System.out.println();
    }
}
/* output:-
   Inorder traversal before deletion:
   20 30 40 50 60 70 80 
   Inorder traversal after deleting 50:
   20 30 40 60 70 80
*/
