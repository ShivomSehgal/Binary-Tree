
# Print the right view of binary Tree covering all the edge cases.

# give approach for the left view and dry run any. -- 
# production level code. -- 
# time and space complexity. -- 

# Binary Tree class
class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

# method to call the right view
def rightViewOfBinaryTree(root):

   maxLevel = [0]

   return rightViewOfBinaryTreeUtil(root, 1, maxLevel)

# utility method to call the right view 
def rightViewOfBinaryTreeUtil(root, level, maxLevel):

    if root is None :
        return
#   if level is greater than level, then we can print the value of the tree
    if (maxLevel[0] < level):
        print(root.value),
        maxLevel[0] = level  

#   recursive calls to traverse the entire tree
    rightViewOfBinaryTreeUtil(root.right, level+1, maxLevel)    
    rightViewOfBinaryTreeUtil(root.left, level + 1, maxLevel)


# BinaryTree 
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
root.right.left.right = Node(8)
 
rightViewOfBinaryTree(root)
 



#  Time - O(n) because of traversing all the elements in the node.
#  Space - O(n) because of stack space during the worst case.