import java.util.*;
public class Demo{
    public static void main(String[] args) {
       class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
       }
       Node head=new Node(1);
       Node second=new Node(2);
       Node third=new Node(3);
       Node fourth =new Node(4);

     head.next=second;
     second.next=third;
     third.next=fourth;
     fourth.next=null;
     Node slow=head;
     Node fast=head;
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            System.out.println("Cycle detedcted");
            return;
        }
     }
     System.out.println("No cycle detected");

    }
}