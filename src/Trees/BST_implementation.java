package Trees;

import java.util.Scanner;

public class BST_implementation 
{
    
    TreeNode root;
    public BST_implementation()
    {
        root=null;
    }
    
    public TreeNode add(TreeNode root,int data)
    {
        
        if(root==null)
        {
            root=new TreeNode(data);
            return root;
        }
        else if(data<this.root.data)
        {
            root.left=add(root.left, data);
        }
        else if(data>this.root.data)
        {   
           root.right= add(root.right, data);
        }
        
        return root;
    }
    
     public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BST_implementation bst=new BST_implementation();
        System.out.println(" how many nodes");
        int n=sc.nextInt();
        System.out.println("enter nodes");
        int data;
        for(int i=0;i<n;i++) 
        {  
            data=sc.nextInt();
            bst.root=bst.add(bst.root, data);
        }
        System.out.println("tree is ");
        bst.inOrder(bst.root);
    }
    
    
}
