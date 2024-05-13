class Node{
    Node next;
    int val;
    public Node(int val){
        this.val=val;
    }
}

public class RemoveNthNode {
    public static Node removeNthFromEnd(Node head, int n){
        if(head==null){
            return head;
        }
        Node dummy=new Node(0);
        dummy.next=head;
        Node slow=dummy;
        Node fast=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node ans=removeNthFromEnd(head, 2);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
