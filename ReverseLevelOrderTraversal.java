Given a binary tree of size N, find its reverse level order traversal. ie- the traversal must begin from the last level.

Example 1:

Input :
        1
      /   \
     3     2

Output: 3 2 1
Explanation:
Traversing level 1 : 3 2
Traversing level 0 : 1
Example 2:

Input :
       10
      /  \
     20   30
    / \ 
   40  60

Output: 40 60 20 30 10
Explanation:
Traversing level 2 : 40 60
Traversing level 1 : 20 30
Traversing level 0 : 10
  
  
  
  class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        if(node == null) return res;
        
        Queue<Node> queue = new LinkedList<>();
        
        queue.offer(node);
        
        while(!queue.isEmpty()){
            Node current = queue.poll();
            
            
            if(current.right  != null){
                queue.offer(current.right);
            }
            
            if(current.left != null){
                queue.offer(current.left);
            }
            
            stack.push(current.data);
            // res.add(current.data);
            
        }
        
        while(!stack.isEmpty()){
            res.add(stack.pop());
        }
        
        return res;
    }
}      
