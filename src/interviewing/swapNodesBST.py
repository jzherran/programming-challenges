class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key


def getInorder(root):
    if root:
        getInorder(root.left)
        print(root.val)
        getInorder(root.right)


def swapNodesBST(root: Node):
    getInorder(root)


r = Node(1)
r.left = Node(3)
r.left.right = Node(2)

swapNodesBST(r)

"""
Input

  1
 /
3
 \
  2

Output

  3
 /
1
 \
  2
"""
