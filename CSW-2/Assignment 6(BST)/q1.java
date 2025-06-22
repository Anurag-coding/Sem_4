class BSTNode {
    int info;
    BSTNode left;
    BSTNode right;
    public BSTNode(int info) {
        this.info = info;                                
    }
}
class BSTtree {
    BSTNode root = null;
    public static BSTNode insert(BSTNode root, int val) {
        if (root == null) {
            root = new BSTNode(val);
            return root;
        }
        if (val < root.info) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(BSTNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.info + " ");
        inorder(root.right);
    }
    public static void preorder(BSTNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.info + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(BSTNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.info + " ");
    }
}
public class q1 {
    public static void main(String[] args) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        BSTtree tree = new BSTtree();
        for (int i : val) {
            tree.root = BSTtree.insert(tree.root, i);
        }
        System.out.println("Inorder : ");
        tree.inorder(tree.root);
        System.out.println("\nPreorder : ");
        tree.preorder(tree.root);
        System.out.println("\nPostorder : ");
        tree.postorder(tree.root);
    }
}
/* output:-
   Inorder : 
   1 2 3 4 5 7 
   Preorder : 
   5 1 3 2 4 7 
   Postorder : 
   2 4 3 1 7 5
*/