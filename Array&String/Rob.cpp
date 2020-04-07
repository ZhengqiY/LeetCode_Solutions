#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

class Rob {
public:
	int rob(vector<int>& wealth)
	{
		if (wealth.size() == 0) return 0;
		int N = wealth.size();
		vector<int> dp(N + 1);
		dp[0] = 0;
		dp[1] = wealth[0];
		for (int i = 2; i < N + 1; i++) {
			dp[i] = max(wealth[i - 1] + dp[i - 2], dp[i - 1]);
		}
		return dp[N];
	}
};