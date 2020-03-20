package com.leetcode;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode currA = headA;
        ListNode currB = headB;
        if (headA==null || headB==null) return null;
        while (currA != currB){
            if (currA==null) {
                currA = headB;
            }else{
                currA = currA.next;
            }
            if (currB==null) {
                currB = headA;
            }else{
                currB = currB.next;
            };

        }
        return currA;
    }

}
// switch pointer.  currA.next = headB etc changed linked list structure!!