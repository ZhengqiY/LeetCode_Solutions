package tree;

/**
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 *
 * Example 1:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * Output: true
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode t1, TreeNode t2){
        if (t1==null&&t2==null) return true;
        if (t1==null||t2==null) return false;
        if (t1.val!=t2.val){
            return false;
        }else if (t1.val==t2.val && t1.left==null&& t1.right==null&&t2.left==null&& t2.right==null){
            return true;
        }
        boolean left = isSameTree(t1.left,t2.left);
        boolean right = isSameTree(t1.right,t2.right);

        return (left && right);
    }

    public static void main(String[] args){
        IsSameTree sol = new IsSameTree();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        System.out.println(sol.isSameTree(t1,t2));
    }
}
