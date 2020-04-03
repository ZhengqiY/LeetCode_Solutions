#include<iostream>
#include<stack>
#include"ListNode.cpp"

class AddTwoNumberII {
public:
	ListNode* addTwoNumberII(ListNode* l1, ListNode* l2)
	{
		stack<int> stack1;
		stack<int> stack2;
		stack<int> stack_res;
		ListNode* dummy = new ListNode(0);
		ListNode* head = dummy;
		ListNode* curr1 = l1;
		ListNode* curr2 = l2;
		int store = 0;
		while (curr1 != NULL) {
			stack1.push(curr1->val);
			curr1 = curr1->next;
		}
		while (curr2 != NULL) {
			stack2.push(curr2->val);
			curr2 = curr2->next;
		}

		while (stack1.size() > 0 || stack2.size() > 0) {
			int x = stack1.size() > 0 ? stack1.top() : 0;
			int y = stack2.size() > 0 ? stack2.top() : 0;
			int sum = x + y + store;
			if (sum > 9) {
				stack_res.push(sum % 10);
				store = 1;
				if (stack1.size() > 0) stack1.pop();
				if (stack2.size() > 0) stack2.pop();
			}
			else {
				stack_res.push(sum);
				store = 0;
				if (stack1.size() > 0) stack1.pop();
				if (stack2.size() > 0) stack2.pop();
			}

		}
		if (store == 1) stack_res.push(store);
		while (stack_res.size() > 0) {
			head->next = new ListNode(stack_res.top());
			stack_res.pop();
			head = head->next;
		}
		return dummy->next;
	}
};