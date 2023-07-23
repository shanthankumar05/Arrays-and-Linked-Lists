// Question 11: Swap Nodes in Pairs

// Skill Mapping: Basic

// Description: Solve the LeetCode Problem given as a link below -

// https://leetcode.com/problems/swap-nodes-in-pairs/

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
    public ListNode swapPairs(ListNode head) {
           if (head == null || head.next == null) {
            return head;
        }

       
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;
        ListNode prev = tempHead;

        
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

           
            prev.next = second;
            first.next = second.next;
            second.next = first;

           
            prev = first;
            head = first.next;
        }
        return tempHead.next;
    }
}
