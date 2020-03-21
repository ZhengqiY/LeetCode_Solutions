#include<iostream>
#include"TreeNode.cpp"

using namespace std;

class IsSameTree {
public:
	bool isSameTree(TreeNode* t1, TreeNode* t2)
	{
		if (t1 == NULL && t2 == NULL) return true;
		if (t1 == NULL || t2 == NULL) return false;
		if (t1->val != t2->val) {
			return false;
		}
		bool left = isSameTree(t1->left, t2->left);
		bool right = isSameTree(t1->right, t2->right);
		return left && right;
	}
};