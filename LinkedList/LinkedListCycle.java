package com.leetcode;

/**
 * Given a linked list, determine if it has a cycle in it.
 */

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                return true;
            }
        }return false;
    }
    
}

