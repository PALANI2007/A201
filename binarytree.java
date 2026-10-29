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
public class binarytree
{
    static Scanner sc=new Scanner(System.in);
    
    static Node create(){

    int value=sc.nextInt();

    if(value==-1) 
        {
            return null;
        }

    Node newnode=new Node(value);
    newnode.left=create();
    newnode.right=create();
    
    return newnode;

    }

    public static void main(String[] args) {
        Node root=create();
    
        if(root!=null)
        {
            System.out.print(root.data);
    }

}
}
