#include<iostream>
#include<unordered_map>
#include<vector>

using namespace std;

class FindDisappearNumber {
public:
	vector<int> findDisappeaerNumber(vector<int>& nums)
	{
		unordered_map<int, int> map;
		int N = nums.size();
		for (int i = 1; i <= N; i++) {
			map[i] = 0;
		}
		for (int i = 0; i < N; i++) {
			if (map.count(nums[i])) {
				map[nums[i]] = 1;
			}
		}
		vector<int> res;
		for (auto item : map) {
			if (item.second == 0) {
				res.push_back(item.first);
			}
		}
		return res;
	}
};