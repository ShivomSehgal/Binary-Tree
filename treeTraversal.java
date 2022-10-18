Generate the inorder/preorder/postorder traversal of a binary Tree.
  
  Examples: 

Input:
        5
       / \
      3   6
     / \
    2   4
Output:
Inorder of tree   : 2 3 4 5 6 
Postorder of tree : 2 4 3 6 5
Preorder of tree  : 5 3 2 4 6
  
  
  
  
  
  
public class Solution{
  
  class Node{
    int data;
    Node left, right;
    
    public Node(int data){
      this.data = data;
    }
  }
  
  public List<Integer> inOrderTraversal(Node node){
  
    List<Integer> res = new ArrayList<>();
    
    inOrderUtil(node, res);
    
    return res;
    )
      
      public void inOrderUtil(Node node, List<Integer> res){
      if(node == null){
        return ;
      }
      
      if(node.left != null){
        inOrderUtil(node.left, res);
      }
      
      res.add(node.data);
      
      if(node.right != null){
        inOrderUtil(node.right, res);
      }
    }
