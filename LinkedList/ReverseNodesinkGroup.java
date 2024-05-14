class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}

public class ReverseNodesinkGroup {
    public static Node reverseKGroup(Node head, int k) {
        Node temp=head;
        int count=0;
        while(temp!=null && count<k){
            count++;
            temp=temp.next;
        }
        if(count==k){
            Node reverseHead=reverse(head,k);

            head.next=reverseKGroup(temp, k);
            return reverseHead;
        }
        return head;
    }

    private static Node reverse(Node head, int k) {
        Node prev=null;
        Node temp=head;
        for(int i=0;i<k;i++){
            Node n=temp.next;
            temp.next=prev;
            prev=temp;
            temp=n;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);

        Node ans=reverseKGroup(head, 3);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
