class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}

public class IntersectionofTwoLinkedLists {
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node a=headA;
        Node b=headB;
        while(a!=b){
            a=(a==null)?headB:a.next;
            b=(b==null)?headA:b.next;
        }
        return a;
    }
    public static void main(String[] args) {
        Node headA=new Node(4);
        headA.next=new Node(1);
        headA.next.next=new Node(8);
        headA.next.next.next=new Node(4);
        headA.next.next.next.next=new Node(5);

        Node headB=new Node(5);
        headB.next=new Node(6);
        headB.next.next=new Node(1);
        headB.next.next.next=headA.next.next;

        Node ans=getIntersectionNode(headA, headB);
        System.out.println(ans.val);
    }
}