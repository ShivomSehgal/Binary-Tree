Given a binary tree, find its height.


Example 1:

Input:
     1
    /  \
   2    3
Output: 2
Example 2:

Input:
  2
   \
    1
   /
 3
Output: 3   
  
  
  
  class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        if(node == null) return 0;
        
        int leftSubtree = height(node.left);
        int rightSubtree = height(node.right);
        
        return Math.max(leftSubtree, rightSubtree) + 1;
    }
}
