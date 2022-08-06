package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode head = first;
        first.next = new ListNode(2);
        first.next.next = new ListNode(3);
        first.next.next.next = new ListNode(4);

//        ListNode temp = reverseLinkedList(head);
        reverse(head);
        ListNode temp = headListNode;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

    }

    // Using Iterative Method
    public static ListNode reverseLinkedList(ListNode head){
       ListNode curr = head;
       ListNode prev = null;
       while (curr!=null){
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;
       }
       return prev;
    }

    // Using recursion
    public static ListNode headListNode = null;
    public static ListNode reverse(ListNode root){
        if(root.next==null){
            headListNode = root;
            return root;
        }

        ListNode temp = reverse(root.next);
        temp.next = root;
        root.next = null;
        return root;

    }
}

