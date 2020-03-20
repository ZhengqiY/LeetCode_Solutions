package com.leetcode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode target = curr.next;
            curr.next = prev;
            prev = curr;
            curr = target;
        }
        return prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        System.out.println(sol.reverseList(l1));
    }
}
