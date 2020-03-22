#include<iostream>
#include<vector>
#include<unordered_map>
//#include<unordered_set>
#include<queue>

using namespace std;

class KClosest {
public:
	vector<vector<int>> kClosest(int k, vector<vector<int>>& points)
	{
		unordered_map<int, double> map;
		priority_queue<pair<double,int>, vector<pair<double,int>>, greater<pair<double,int>> > pq;
		int i = 0;
		for (vector<int> pairs : points) {
			map[i] = pow(pairs[0], 2) + pow(pairs[1], 2);
			pq.push(make_pair(map[i], i));
			i++;
		}
		vector<vector<int>> res;
		while (k--) {
			res.push_back(points[pq.top().second]);
			pq.pop();
		}
		return res;
	}
};