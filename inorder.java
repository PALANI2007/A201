import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class inorder {
    static Scanner sc=new Scanner(System.in);

    static Node create()
    {
        int value=sc.nextInt();
        if(value==-1)
        {
            return null;
        }

        Node newnode =new Node(value);

        newnode.left=create();
        newnode.right=create();
        return newnode;

    }
    static void inorder(Node root){
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void main(String[] args) {
        Node root=create();
        inorder(root);
        
    }
}
