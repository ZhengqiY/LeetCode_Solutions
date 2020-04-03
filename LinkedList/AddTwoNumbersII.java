package com.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Follow up:
 * What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
 *
 * Example:
 *
 * Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 8 -> 0 -> 7
 */
import java.util.List;
import java.util.Stack;

public class AddTwoNumbersII {
    public ListNode addTwoNumbersII(ListNode l1, ListNode l2){
        ReverseLinkedList sol = new ReverseLinkedList();
        ListNode l1r = sol.reverseList(l1);
        ListNode l2r = sol.reverseList(l2);
        int store = 0;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        ListNode curr1 = l1r;
        ListNode curr2 = l2r;
        while (curr1!=null || curr2!=null){
            int x = curr1!=null ? curr1.val : 0;
            int y = curr2!=null ? curr2.val : 0;
            int sum = x+y+store;
            if (sum>9){
                head.next = new ListNode(sum%10);
                head = head.next;
                store = 1;
            }else{
                head.next = new ListNode(sum);
                head = head.next;
                store = 0;
            }

            if (curr1!=null) curr1 = curr1.next;
            if (curr2!=null) curr2 = curr2.next;
        }
        if (store==1) head.next = new ListNode(store);
        ListNode resr = dummy.next;
        ListNode res = sol.reverseList(resr);
        return res;
    }

    public ListNode addTwoNumbersStack(ListNode l1, ListNode l2){
        int store = 0;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack_res = new Stack<>();
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while (curr1!=null){
            stack1.push(curr1.val);
            curr1 = curr1.next;
        }
        while (curr2!=null){
            stack2.push(curr2.val);
            curr2 = curr2.next;
        }
        while(stack1.size()>0||stack2.size()>0){
            int x = stack1.size()>0 ? stack1.peek() : 0;
            int y = stack2.size()>0 ? stack2.peek() : 0;
            int sum = x+y+store;
            if (sum>9){
                stack_res.push(sum%10);
                if (stack1.size()>0) stack1.pop();
                if (stack2.size()>0) stack2.pop();
                store = 1;
            }else{
                stack_res.push(sum);
                if (stack1.size()>0) stack1.pop();
                if (stack2.size()>0) stack2.pop();
                store = 0;
            }
        }
        if (store==1) stack_res.push(store);
        while (stack_res.size()>0){
            head.next = new ListNode(stack_res.peek());
            stack_res.pop();
            head = head.next;
        }
        return dummy.next;
    }


    public static void main(String[] args){
        AddTwoNumbersII sol = new AddTwoNumbersII();
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(sol.addTwoNumbersStack(l1,l2));
    }
}

// 注意%的用法，求余，可以用在找9+4 = 13 的个位数。
