
# Print the right view of binary Tree covering all the edge cases.

# give approach for the left view and dry run any. -- 
# production level code. -- 
# time and space complexity. -- 


# Binary Tree class
class Node:
    def __init__(self, value):
        self.value = value
        self.right = None
        self.left = None

# Method to call the height of binary Tree
def heightOfBinaryTree(root):

    return heightOfBinaryTreeUtil(root)

# Utility method to call the height of binary tree
def heightOfBinaryTreeUtil(root):

    if root is None : 
        return 0

#   recursively call the left and right subtrees
    leftSubtreeHeight = heightOfBinaryTreeUtil(root.left)
    rightSubtreeHeight = heightOfBinaryTreeUtil(root.right)

#   return the max of the subtrees and add 1 for the current node's height
    return max(leftSubtreeHeight, rightSubtreeHeight) + 1

    


# BinaryTree 
root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)
root.right.left = Node(6)
root.right.right = Node(7)
root.right.left.right = Node(8)


print(heightOfBinaryTree(root))


# Time - O(n) ~ traversing the entire nodes of the tree
# Space - O(n) ~ stack space required



