#include"TreeNode.cpp"
#include<iostream>

using namespace std;

class PathSum {
public:
	int pathSUm(int sum, TreeNode *root)
	{
		if (root == NULL) return 0;
		int res = dfs(sum, root);
		int pathLeft = pathSUm(sum, root->left);
		int pathRight = pathSUm(sum, root->right);
		return res + pathLeft + pathRight;
	}

	int dfs(int sum, TreeNode* root)
	{
		if (root == NULL) return 0;
		int num = 0;
		if (root->val == sum) num++;

		num += dfs(sum - root->val, root->left);
		num += dfs(sum - root->val, root->right);
		return num;
	}
};