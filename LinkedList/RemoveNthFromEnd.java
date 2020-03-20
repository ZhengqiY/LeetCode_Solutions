package com.leetcode;

/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if (head==null||head.next==null) return null;

        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode prev = sol.reverseList(head);
        ListNode curr = prev;

        while (n-1!=0){
            curr = curr.next;
            n--;
        }
        if (curr!=null && curr.next!=null){
            curr.val=curr.next.val;
            curr.next=curr.next.next;
            ListNode ans = sol.reverseList(prev);
            return ans;
        }else{
            ListNode ans = sol.reverseList(prev);
            return ans.next;
        }
    }

    public static void main(String[] args){
        RemoveNthFromEnd sol = new RemoveNthFromEnd();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);

        int n = 2;
        ListNode ans = sol.removeNthFromEnd(l1,n);
        while (ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

}
