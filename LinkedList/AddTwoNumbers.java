package com.leetcode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        int store = 0;
        while(curr1!=null||curr2!=null){
            int x = (curr1 != null) ? curr1.val : 0;
            int y = (curr2 !=null) ? curr2.val :0;
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
            if (curr1!=null) curr1=curr1.next;
            if (curr2!=null) curr2=curr2.next;
        }
        if (store==1){
            head.next = new ListNode(store);
            //store = 0;
        }

        //ReverseLinkedList res = new ReverseLinkedList();
        return dummy.next;
    }

    public static void main(String[] args){
        AddTwoNumbers sol = new AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        //l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(5);
        ListNode ans = sol.addTwoNumbers(l1,l2);
        while (ans!=null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }

}

//   head.next = new ListNode(l1.val);
// % , /, boolean statement ? part1 : part2