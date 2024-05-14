class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }

}
public class CycleDetection{
    public static boolean hasCycle(Node head) {
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        // head.next.next.next.next=head.next;

        System.out.println(hasCycle(head));
    }
}
