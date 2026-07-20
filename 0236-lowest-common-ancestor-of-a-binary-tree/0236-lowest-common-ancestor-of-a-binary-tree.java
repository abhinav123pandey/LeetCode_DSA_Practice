/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static TreeNode find(TreeNode node, TreeNode p, TreeNode q){
        if(node == p || node == q) return node;
        TreeNode left = null, right = null;
        if(node.left!=null) left = find(node.left, p, q);
        if(node.right!=null) right = find(node.right, p, q);

        if(left!=null && right!=null) return node;

        if(left!=null || right!=null){
            if(left!=null) return left;
            else return right;
        }else{
            return null;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root, p, q);
    }
}