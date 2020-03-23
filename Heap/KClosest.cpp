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
//-----------------------------------------------Quick Sort----------------------------
public:
	vector<vector<int>> kClosestQuickSort(int k, vector<vector<int>>& points)
	{
		int low = 0;
		int high = points.size()-1;
		quickSort(points, low, high);
		vector<vector<int>> res = vector<vector<int>> (points.begin(), points.begin() + k);
		return res;
	}

	void quickSort(vector<vector<int>>& points, int low, int high)
	{
		if (low < high) {
			int s = partition(points, low, high);
			quickSort(points,low, s - 1);
			quickSort(points, s + 1, high);
		}
	}
	int partition(vector<vector<int>>& points, int low, int high)
	{
		int left = low, right = high;
		int pivot = dist(points[low]);
		while (true) {
			while (left < high && dist(points[left]) <= pivot) {
				left++;
			}
			while (right > low && dist(points[right]) >= pivot) {
				right--;
			}
			if (left >= right) break;
			swap(points[left], points[right]);
		}
		swap(points[low], points[right]);
		return right;
	}
	int dist(vector<int> &pairs)
	{
		return pow(pairs[0], 2) + pow(pairs[1], 2);
	}

};