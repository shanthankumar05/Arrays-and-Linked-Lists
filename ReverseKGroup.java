// Question 12: Reverse Nodes in k-Group

// Skill Mapping: Basic

// Description: Solve the LeetCode Problem given as a link below -

// https://leetcode.com/problems/reverse-nodes-in-k-group/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
      if (head == null || k == 1) {
            return head;
        }
        ListNode startNode = new ListNode(0);
        startNode.next = head;

        ListNode start = startNode;
        ListNode end = head;
        int count = 0;
        while (end != null) {
            count++;
            // group
            if (count % k == 0) {
                // reverse linked list (start, end]
                start = reverse(start, end.next);
                end = start.next;
            } else {
                end = end.next;
            }
        }
        return startNode.next;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode curr = start.next;
        ListNode prev = start;
        ListNode first = curr;
        while (curr != end){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        start.next = prev;
        first.next = curr;
        return first;
    }
}
