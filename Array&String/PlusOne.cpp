#include<iostream>
#include<vector>

using namespace std;

class PlusOne {
public:
	vector<int> plusOne(vector<int>& digits)
	{
		int N = digits.size();
		for (int i = N - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		vector<int> res(N + 1);
		res[0] = 1;
		return res;
	}
};