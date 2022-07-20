 
class Solution {
    public   ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, temp = null;
        while(curr != null) {
            temp = curr.next;//Store the new head of the sub-linkedlist
            curr.next = prev;
            prev = curr;     //Move curr & prev to the next place
            curr = temp;
        }
    return prev;  }
}