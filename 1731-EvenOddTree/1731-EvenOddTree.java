// Last updated: 5/25/2026, 4:27:31 PM
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
    public boolean isEvenOddTree(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(root);
        boolean isOdd = true;
        while(!Q.isEmpty()){
            int len = Q.size();
            int prev = isOdd? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for(int i =0; i<len; i++){
                TreeNode curr = Q.poll();
                int val = curr.val;

                if(isOdd && val%2==0) return false;
                if(!isOdd && val%2!=0) return false;

                if (isOdd && val <= prev) return false;
                if (!isOdd && val >= prev) return false;
                
                prev = val;
                
                if (curr.left != null) Q.offer(curr.left);
                if (curr.right != null) Q.offer(curr.right);
                

            }

            isOdd = !isOdd;

        }

        return true;

    }
}