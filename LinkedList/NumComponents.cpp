#include<iostream>
#include<vector>
#include"ListNode.cpp"
#include<unordered_set>


using namespace std;

class NumComponents {
public:
	int numComponents(vector<int>& nums, ListNode* head)
	{
		unordered_set<int> set;
		set.insert(nums.begin(), nums.end());
		ListNode* curr = head;
		int res = 0;
		while (curr != NULL) {
			if (set.count(curr->val)) {
				if (curr->next == NULL || !set.count(curr->next->val)) {
					res++;
				}
			}
			curr = curr->next;
		}
		return res;
	}
};

//curr->next
//set.count
