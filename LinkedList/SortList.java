package com.leetcode;
/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 */

import java.util.List;

public class SortList {
    public ListNode sortList(ListNode head){
        if (head.next==null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        //ListNode head2 = slow.next;
        prev.next = null;
        ListNode list1 = sortList(head);
        ListNode list2 = sortList(slow);
        MergeTwoSortedLists sol = new MergeTwoSortedLists();
        ListNode ans = sol.mergeTwoSortedLists(list1,list2);

        return ans;
    }
    public static void main(String[] args){
        SortList sol = new SortList();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(3);
        ListNode ans = sol.sortList(l1);
        while (ans!=null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}

// MergeSortedList, How to find middle point, while loop condition