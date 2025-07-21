class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class PostOrder {
 public static void postorderT(Node root){
    if(root==null){
        return;
    }
    postorderT(root.left);
    postorderT(root.right);
    System.out.println(root.data);
 }   
 public static void main(String[] args) {
    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    System.out.println("PostOrder");
    postorderT(root);
 }
}
