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
    
    int maxDia = 0;

    public int heightOfBt(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = heightOfBt(root.left);
        int right = heightOfBt(root.right);

        int dia = left + right + 1;

        maxDia = Math.max(maxDia, dia);

        return Math.max(left,right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int height = heightOfBt(root);

        return maxDia - 1;
    }
}
