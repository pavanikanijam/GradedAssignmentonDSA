class Solution {
    public ListNode reverseKGroup(ListNode head, int num) {
    ListNode current_N = head;
    int c1 = 0;
    while (current_N != null && c1 != num) { 
        current_N = current_N.next;
        c1++;
    }
    if (c1 == num) { 
        current_N = reverseKGroup(current_N, num); 
        while (c1-- > 0) { 
            ListNode tmp = head.next;
            head.next = current_N;  
            current_N = head; 
            head = tmp; 
        }
        head = current_N;
    }
    return head;
    }
}
