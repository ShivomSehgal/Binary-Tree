Given the root of a complete binary tree, return the number of the nodes in the tree.

According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.

Design an algorithm that runs in less than O(n) time complexity.

 

Example 1:


Input: root = [1,2,3,4,5,6]
Output: 6
Example 2:

Input: root = []
Output: 0
Example 3:

Input: root = [1]
Output: 1
  
  
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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        int lh = heightLeft(root);
        int rh = heightRight(root);
        
        if(lh == rh ){
            return (2<<(lh))-1;
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
        
    }
    public int heightLeft(TreeNode node){
        int count = 0;
        while(node.left != null){
            count++;
            node = node.left;
        }
        return count;
    }
    public int heightRight(TreeNode node){
        int count = 0;
        while(node.right != null){
            count++;
            node = node.right;
        }
        return count;
    }
}
