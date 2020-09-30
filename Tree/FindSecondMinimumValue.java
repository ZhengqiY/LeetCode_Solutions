package tree;

/**
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property root.val = min(root.left.val, root.right.val) always holds.
 *
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
 *
 * If no such second minimum value exists, output -1 instead.
 *
 * Example 1:
 *
 * Input:
 *     2
 *    / \
 *   2   5
 *      / \
 *     5   7
 *
 * Output: 5
 * Explanation: The smallest value is 2, the second smallest value is 5.
 */
public class FindSecondMinimumValue {
    public int findSecondMinimumVale(TreeNode root){
        if (root==null||root.left==null) return -1;
        return find(root,root.val);
    }

    public int find(TreeNode root,int rootVal) {
        if(root==null) return -1;
        if (root.val!=rootVal) return root.val;
        int left = find(root.left,rootVal);
        int right = find(root.right,rootVal);
        if (left!=-1&&right!=-1) return Math.min(left,right);
        if (left==-1){
            return right;
        }else{
            return left;
        }
    }

    public static void main(String[] args) {
        FindSecondMinimumValue sol = new FindSecondMinimumValue();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2147483647);
        System.out.println(sol.findSecondMinimumVale(root));
    }
}
