class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}
public class AddList {
    public static Node addTwoNumbers(Node l1, Node l2) {
        int carry=0;
        Node dummy=new Node(0);
        Node temp=dummy;
        while(l1!=null && l2!=null){
            int x=(l1!=null)? l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+carry;
            carry=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }

        }
        if(carry>0){
            temp.next=new Node(carry);
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Node l1=new Node(2);
        l1.next=new Node(4);
        l1.next.next=new Node(3);

        Node l2=new Node(5);
        l2.next=new Node(6);
        l2.next.next=new Node(4);

        Node ans=addTwoNumbers(l1, l2);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
