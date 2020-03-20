package com.leetcode;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 *
 * Given linked list -- head = [4,5,1,9], which looks like following:
 *
 * Example 1:
 *
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 */
public class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        DeleteNodeInLinkedList sol = new DeleteNodeInLinkedList();
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(5);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(9);
        sol.deleteNode(listNode.next.next);
        System.out.println(listNode);
    }
}
