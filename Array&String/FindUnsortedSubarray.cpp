#include<iostream>
#include<vector>
#include<stack>
#include<algorithm>

using namespace std;

class FindUnsortedSubarray {
public:
	int findUnsortedSubarray(vector<int>& nums)
	{
		stack<int> stack;
		int leftbound = nums.size();
		int rightbound = 0;
		for (int i = 0; i < nums.size(); i++) {
			while (!stack.empty() && nums[i] < nums[stack.top()]) {
				leftbound = min(leftbound, stack.top());
				stack.pop();
			}
			stack.push(i);
		}
		while (stack.size() > 0) {
			stack.pop();
		}

		for (int j = nums.size() - 1; j >= 0; j--) {
			while (!stack.empty() && nums[j] > nums[stack.top()]) {
				rightbound = max(rightbound, stack.top());
				stack.pop();

			}
			stack.push(j);
		}

		int res = rightbound - leftbound + 1;
		return rightbound - leftbound > 0 ? res : 0;
	}
};