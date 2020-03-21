#include <cstddef>
using namespace std;

struct ListNode
{
public:
	int val;
	ListNode* next;
	ListNode(int x) : val(x), next(NULL) {}
};