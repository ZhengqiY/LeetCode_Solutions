#include<iostream>
#include<string>
#include<algorithm>

using namespace std;

class LongestPalindrome {
public:
	string longestPalindrome(string s)
	{
		if (s.size() == 0) return "";
		int start = 0;
		int maxlen = 0;
		int N = s.size();
		for (int i = 0; i < N; i++) {
			int len1 = expandFromMid(s, i, i);
			int len2 = expandFromMid(s, i, i + 1);
			int len = max(len1, len2);
			if (len > maxlen) {
				start = i - (len - 1) / 2;
				maxlen = len;
			}
		}
		return s.substr(start, maxlen);
	}
	int expandFromMid(string s, int left, int right)
	{
		while (left >= 0 && right < s.size() && s[left] == s[right]) {
			left--;
			right++;
		}
		return right - left - 1;
	}
};

// substr(pos,len);