class Node{
    int data;
    Node left,right;
    Node(int val){
        data=val;
        left=right=null;
    }
}
public class inorder{
    public static void inordertraversal(Node root){
        if(root==null){
            return;
        }
        inordertraversal(root.left);
        System.out.println(root.data);
        inordertraversal(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        System.out.print("Inorder");
        inordertraversal(root);
    }
}