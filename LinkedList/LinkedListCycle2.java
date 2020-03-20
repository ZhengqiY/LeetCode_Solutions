package com.leetcode;

/**
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 *
 * Note: Do not modify the linked list.
 *
 * Example 1:
 *
 * Input: head = [3,2,0,-4], pos = 1
 * Output: tail connects to node index 1
 * Explanation: There is a cycle in the linked list, where tail connects to the second node.
 *
 *
 */

public class LinkedListCycle2 {
    public ListNode linkedListCycle2(ListNode head){
        LinkedListCycle cycle = new LinkedListCycle();
        boolean res = cycle.hasCycle(head);
        if(res) {
            ListNode fast = head;
            ListNode slow = head;
            ListNode start = head;
            while (fast!=null&&fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if (slow==fast){
                    break;
                    }
                    //ListNode ans = start;
                }
            while (fast!=start){
                fast = fast.next;
                start = start.next;
            }
            return start;
        }else {
            return null;
        }
    }
}

// break, 解方程方法, 相遇问题