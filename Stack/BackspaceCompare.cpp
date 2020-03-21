#include<string>
#include<iostream>
#include<stack>

using namespace std;

class BackspaceCompare {
public:
	bool backspaceCompare(string& s, string& t)
	{
		stack<char> stack1;
		stack<char> stack2;
		int N1 = s.size();
		int N2 = t.size();
		for (int i = 0; i < N1; i++) {
			if (s[i] == '#' && stack1.size() > 0) {
				stack1.pop();
			}
			else if (s[i] != '#') {
				stack1.push(s[i]);
			}
		}

		for (int i = 0; i < N2; i++) {
			if (t[i] == '#' && stack2.size() > 0) {
				stack2.pop();
			}
			else if (t[i] != '#') {
				stack2.push(t[i]);
			}
		}

		return stack1 == stack2;
	}
};