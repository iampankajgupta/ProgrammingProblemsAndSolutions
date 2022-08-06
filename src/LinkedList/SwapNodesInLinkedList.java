package LinkedList;

public class SwapNodesInLinkedList {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode head = first;
        first.next = new ListNode(2);

        int n = 1;

        ListNode ans = swapNodes(head,n);
        while(ans!=null){
            System.out.print(ans.data+"->");
            ans = ans.next;
        }
    }

    private static ListNode swapNodesInLinkedList(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        ListNode a = new ListNode();


        for(int i = 1;i<=n;i++){

            fast = fast.next;
            if(i==n){
                a = fast;
            }
        }

        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        int temp = a.data;
        a.data = slow.next.data;
        slow.next.data= temp;

        return start.next;
    }
// Optimise Solutopn

    public static ListNode swapNodes(ListNode head, int k) {
        ListNode A = head, B = head, nodeK;
        for (int i = 1; i < k; i++) A = A.next;
        nodeK = A;
        A = A.next;
        while (A != null) {
            A = A.next;
            B = B.next;
        }
        int temp = nodeK.data;
        nodeK.data = B.data;
        B.data = temp;
        return head;
    }
}
