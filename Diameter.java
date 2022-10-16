The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two end nodes. The diagram below shows two trees each with diameter nine, the leaves that form the ends of the longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes). 



Example 1:

Input:
       1
     /  \
    2    3
Output: 3
Example 2:

Input:
         10
        /   \
      20    30
    /   \ 
   40   60
Output: 4
  
  
  
  
  class Solution {
    
    class TreeInfo{
        int diameter, height;
        
        public TreeInfo(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }
    
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        
        return getTreeInfo(root).diameter + 1;
        
    }
    
    TreeInfo getTreeInfo(Node node){
        
        if(node == null){ 
            return new TreeInfo(0,0);
        }
        
        TreeInfo leftSubtree = getTreeInfo(node.left);
        TreeInfo rightSubtree = getTreeInfo(node.right);
        
        int longestPath = leftSubtree.height + rightSubtree.height;
        int maxDiameter = Math.max(leftSubtree.diameter, rightSubtree.diameter);
        int currentDiameter = Math.max(longestPath, maxDiameter);
        int currentHeight = 1 + Math.max(leftSubtree.height, rightSubtree.height);
        
        return new TreeInfo(currentDiameter, currentHeight);
    }
    
    
    
}


// class Solution {
//     class TreeInfo{
//         int Diameter;
//         int Height;
        
//          TreeInfo(int Diameter, int Height){
//             this.Diameter = Diameter;
//             this.Height = Height;
//         }
//     }
//     // Function to return the diameter of a Binary Tree.
//     int diameter(Node root) {
//         return diameterUtil(root).Diameter + 1;
//     }
    
    
//     TreeInfo diameterUtil(Node node){
//         if(node == null){
//             return new TreeInfo(0,0);
//         }
//         TreeInfo leftSubTree = diameterUtil(node.left);
//         TreeInfo rightSubTree = diameterUtil(node.right);
        
//         int longestPath = leftSubTree.Height + rightSubTree.Height;
//         int maxDiameter = Math.max(leftSubTree.Diameter, rightSubTree.Diameter);
//         int currentDiameter = Math.max(maxDiameter, longestPath);
//         int currentHeight = 1 + Math.max(leftSubTree.Height, rightSubTree.Height);
        
//         return new TreeInfo(currentDiameter, currentHeight);
//     }
