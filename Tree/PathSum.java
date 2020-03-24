package tree;

/**
 * You are given a binary tree in which each node contains an integer value.
 *
 * Find the number of paths that sum to a given value.
 *
 * The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).
 *
 * The tree has no more than 1,000 nodes and the values are in the range -1,000,000 to 1,000,000.
 *
 * Example:
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * Return 3. The paths that sum to 8 are:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3. -3 -> 11
 */
public class PathSum {
    public int pathSum(TreeNode root, int sum){
        if (root==null) return 0;
        int res = dfs(root,sum);
        int pl = pathSum(root.left,sum);
        int pr = pathSum(root.right,sum);
        return res+pl+pr;
    }

    public int dfs(TreeNode root, int sum){
        if (root == null) return 0;
        int num = 0;
        if(root.val==sum) num++;
        num += dfs(root.left,sum-root.val);

        num += dfs(root.right,sum-root.val);
        return num;
        }
     public static void main(String[] args){
        PathSum sol = new PathSum();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        int sum = 8;
        System.out.println(sol.pathSum(root,sum));
     }

}

