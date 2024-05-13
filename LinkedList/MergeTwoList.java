class Node{
    Node next;
    int val;
    public Node(int val){
        this.val=val;
    }
}
public class MergeTwoList {
    public static Node mergeTwoLists(Node list1, Node list2){
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next, list2);
                System.out.println(list1.val);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1, list2.next);
                System.out.println(list2.val);
                return list2;
            }


        }
        if(list1==null){
            return list2;
        }
        return list1;
    }
    public static void main(String[] args) {
        Node list1=new Node(1);
        list1.next=new Node(2);
        list1.next.next=new Node(3);

        Node list2=new Node(4);
        list2.next=new Node(5);
        list2.next.next=new Node(6);

        Node ans=mergeTwoLists(list1, list2);
        while(ans!=null){
            System.out.print(ans.val+" ");
            ans=ans.next;
        }
    }
}
