package LinkedList;

public class CheckLinkedListIsPalindrome {
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode head = first;
//        first.next = new ListNode(2);
//        first.next.next = new ListNode(2);
//        first.next.next.next = new ListNode(3);
//        first.next.next.next.next = new ListNode(1);

        boolean ans = checkIfLinkedListIsPalindrome(head);
        System.out.println(ans);

    }


    public static boolean checkIfLinkedListIsPalindrome(ListNode head){
        if(head.next==null) return true;
        int numberOfListNode = countNOOfListNodeInLinkedList(head);
        // find the middle of the linkedlist
        int iterateTill = numberOfListNode / 2;
        ListNode temp = head;
        while(iterateTill!=1){
            temp = temp.next;
            iterateTill--;
        }

        ListNode rest = reverse(temp.next);
        ListNode start = head;
        ListNode start2 = rest;
        while(start2!=null){
            if(start.data!=start2.data) return false;
            else {
                start = start.next;
                start2 = start2.next;
            }
        }

        return true;
    }

    public static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;

    }

    public static int countNOOfListNodeInLinkedList(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    // IT
    public static ListNode middleLinkedList(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

//count = 4;
//iterateTill = 2;
//
//t
//1 - 3 - 1 - 3

