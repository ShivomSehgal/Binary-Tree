Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /     \    /    \
  4     5   6    7
   \
     8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

Example 2:

Input:

Output: 10 20 40
  
  
  class Tree
{
    int maxLevel = 0;
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        // Optimal approach --> Time - O(h), Space - O(h) ~ h - height of binary Tree
        ArrayList<Integer> res = new ArrayList<>();
        leftViewUtil(root, 1,res);
        
        return res;
    }
    
    void leftViewUtil(Node node, int level, ArrayList<Integer> list){
        
        if(node == null) return;
        
        if(maxLevel < level){
            list.add(node.data);
            maxLevel = level;
        }
        
        leftViewUtil(node.left, level+1, list);
        leftViewUtil(node.right, level+1, list);
    }
}
