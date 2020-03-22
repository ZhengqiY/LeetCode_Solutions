#include<iostream>
#include<string>
#include<vector>

using namespace std;

class GenerateParentheses {
public:
	vector<string> generateParentheses(int n)
	{
		vector<string> res;
		backtrack(res, "", 0, 0, n);
		return res;
	}

	void backtrack(vector<string> res, string curr_s, int open, int close, int max)
	{
		if (curr_s.size() == max * 2) res.push_back(curr_s);

		if (open < max) backtrack(res, curr_s + "(", open + 1, close, max);
		if (close < open) backtrack(res, curr_s + ")", open, close + 1, max);
	}
};