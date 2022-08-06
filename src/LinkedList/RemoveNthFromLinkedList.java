package LinkedList;

public class RemoveNthFromLinkedList {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode head = first;
        first.next = new ListNode(2);

        int n = 2;

        ListNode temp = removeNodeFromEnd(head,n);
        ListNode ans = temp;
        while(ans!=null){
            System.out.print(ans.data+"->");
            ans = ans.next;
        }

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r = head;
        ListNode l = head;
        // because sz >= 1:
        // assert r != null
        // assert l != null
        //
        // the removal node will be the next of `l` node
        // ! Edge case: n = sz
        // ! Edge case: n = sz = 1

        for (int i = 0; i < n; i++) {
            r = r.next;
        }

        if (r == null /* n == sz */) {
            return l.next;
        }

        // assert r != null
        while (r.next != null) {
            l = l.next;
            r = r.next;
        }

        // x -> y -> z -> u -> null |  n == 2
        // l
        // l         r
        //      l         r

        // assert l != null
        l.next = l.next.next;
        return head;
    }

    public static ListNode removeNodeFromEnd(ListNode head,int n){
        int countNodes = 1;
        ListNode temp = head;
        while(temp.next!=null) {
            countNodes++;
            temp = temp.next;
        }
        int rest = Math.abs(n-countNodes);
        ListNode slow = new ListNode();
        slow = head;
        int i = 1;
        while(i<=rest){
            slow = slow.next;
            i++;
        }
        slow.next = slow.next.next;
        return head;
    }

    private static ListNode removeNthNodeFromLinkedList(ListNode head, int n) {

        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        for (int i = 1;i<=n;i++){
            fast = fast.next;
        }

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return start.next;

    }
}
