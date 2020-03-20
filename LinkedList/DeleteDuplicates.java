package com.leetcode;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head){
        ListNode curr = head;
        while (curr != null && curr.next != null){
            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args){
        DeleteDuplicates sol = new DeleteDuplicates();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        System.out.println(sol.deleteDuplicates(l1));
    }
}
