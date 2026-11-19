// public Convert to Mirror Tree
// Solved
// Difficulty: EasyAccuracy: 72.67%Submissions: 254K+Points: 2Average Time: 20m
// Given a binary tree, modify it so that it becomes its mirror. Mirror of a Binary Tree is obtained by interchanging left and right children of all non-leaf nodes.

// Note : Changes should be done in-place and need not to return anything.

// Examples:

// Input: root = [1, 2, 3, N, N, 4]
// Output: [1, 3, 2, N, 4]
// Explanation: 

// In the inverted tree, every non-leaf node has its left and right child interchanged.
// Input: root = [1, 2, 3, 4, 5]
// Output: [1, 3, 2, N, N, 5, 4]
// Explanation:

// In the inverted tree, every non-leaf node has its left and right child interchanged.
// Constraints:

// 1 ≤ size of binary tree ≤ 104
// 1 ≤ Node.data ≤ 105
//  {
    
// }
/* Structure of Binary Tree Node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    void mirror(Node root) {
        if(root == null) return;
       mirror(root.left);
       mirror(root.right);
       
       Node t = root.left;
       root.left = root.right;
       root.right = t;
        
    }
}