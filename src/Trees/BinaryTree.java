package Trees;

public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        printPreOrder(root.left);
        System.out.print(root.data + " ");
        printPreOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.root = new TreeNode(7);
        t.root.left = new TreeNode(5);
        t.root.right = new TreeNode(6);
        System.out.println("inorder order traversal is");
        t.printPreOrder(t.root);

    }

}
