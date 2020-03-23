#include<iostream>
#include<queue>
using namespace std;

class RecentCalls {
public:
	priority_queue<int, vector<int>, greater<int>> pq;
	RecentCalls()
	{

	}

	int ping(int t) 
	{
		pq.push(t);
		while (!pq.empty() && pq.top() < t - 3000) {
			pq.pop();
		}
		return pq.size();
	}
};

//	priority_queue<int, vector<int>, greater<int>> pq;
