import java.util.Stack;

class Node{
    Node next;
    int val;
    public Node(int val){
        this.val=val;
    }
}
public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        // Node temp=head;
        // Node prev=null;
        // while(temp!=null){
        //     Node n=temp.next;
        //     temp.next=prev;
        //     prev=temp;
        //     temp=n;
        // }
        // return prev;

        Stack<Node> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Pop nodes from the stack to reverse the list
        Node newHead = stack.pop();
        current = newHead;
        while (!stack.isEmpty()) {
            current.next = stack.pop();
            current = current.next;
        }
        current.next = null; // Set the next of the last node to null

        return newHead;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        Node ans=reverseList(head);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
    
}