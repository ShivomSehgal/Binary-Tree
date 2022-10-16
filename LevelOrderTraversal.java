Given a binary tree, find its level order traversal.
Level order traversal of a tree is breadth-first traversal for the tree.


Example 1:

Input:
    1
  /   \ 
 3     2
Output:1 3 2
Example 2:

Input:
        10
     /      \
    20       30
  /   \
 40   60
Output:10 20 30 40 60
  
  
  
  class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        
        if(node == null) return res;
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.offer(node);
        
        while(!queue.isEmpty()){
            Node current = queue.poll();
            
            if(current.left != null){
                queue.offer(current.left);
            }
            if(current.right  != null){
                queue.offer(current.right);
            }
            
            res.add(current.data);
            
        }
        
        return res;
    }
}



