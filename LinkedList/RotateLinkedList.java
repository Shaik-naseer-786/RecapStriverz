class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}
public class RotateLinkedList {
    public static Node rotateRight(Node head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length=1;
        Node tail=head;
        while(tail.next!=null){
            length++;
            tail=tail.next;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        tail.next=head;
        Node newTail=head;
        for(int i=0;i<length-k-1;i++){
            newTail=newTail.next;
        }
        Node newHead=newTail.next;
        newTail.next=null;
        return newHead;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node ans=rotateRight(head, 5);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        } 
    }
}
