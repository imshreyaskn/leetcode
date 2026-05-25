// Last updated: 5/25/2026, 4:27:58 PM
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

    int count = 0;
    public int minCameraCover(TreeNode root) {
        if(check(root)==0) count++;
        return count;
    }

    int check(TreeNode root) {
        if(root==null){
            return 1;
        }

        int left = check(root.left);
        int right = check(root.right);

        if(left == 0 || right == 0){
            count++;
            return 2;
        }

        if(left==2 || right == 2){
            return 1;
        }

        return 0;

    }
}