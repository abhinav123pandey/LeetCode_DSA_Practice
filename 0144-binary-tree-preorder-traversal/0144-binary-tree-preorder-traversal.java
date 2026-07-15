/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void pre(TreeNode root, List<Integer>ans){
        ans.add(root.val);
        if(root.left!=null) pre(root.left, ans);
        if(root.right!=null) pre(root.right, ans);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        if(root==null) return ans;
        pre(root, ans);
        return ans;
    }
}