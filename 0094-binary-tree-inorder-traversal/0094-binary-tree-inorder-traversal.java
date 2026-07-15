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
    void in(TreeNode root, List<Integer>ans){
        if(root.left!=null) in(root.left, ans);
        ans.add(root.val);
        if(root.right!=null) in(root.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        if(root==null) return ans;
        in(root, ans);
        return ans;
    }
}