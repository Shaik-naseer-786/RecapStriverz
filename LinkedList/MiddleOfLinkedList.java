class Node{
    Node next;
    int val;
    public Node(int val){
        this.val=val;
    }
}
public class MiddleOfLinkedList {
    public static Node middleNode(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node ans=middleNode(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }

}
