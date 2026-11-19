// public Inorder Traversal
// Solved
// Difficulty: BasicAccuracy: 67.15%Submissions: 227K+Points: 1Average Time: 15m
// Given a root of a Binary Tree, your task is to return its Inorder Traversal.

// Note: An inorder traversal first visits the left child (including its entire subtree), then visits the node, and finally visits the right child (including its entire subtree).

// Examples:

// Input: root = [1, 2, 3, 4, 5]
            
// Output: [4, 2, 5, 1, 3]
// Explanation: The inorder traversal of the given binary tree is [4, 2, 5, 1, 3].
// Input: root = [8, 1, 5, N, 7, 10, 6, N, 10, 6]
              
// Output: [1, 7, 10, 8, 6, 10, 5, 6]
// Explanation: The inorder traversal of the given binary tree is [1, 7, 10, 8, 6, 10, 5, 6].
// Constraints:

// 1 ≤ size of binary tree ≤ 3*104
// 0 ≤ Node.data ≤ 105

/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans=new ArrayList<>();
        dfs(root, ans);
        return ans;
        
    }
    public void dfs(Node root, ArrayList<Integer> ans){
            if (root == null) return;
            
            dfs(root.left,ans);
            ans.add(root.data);
            dfs(root.right,ans);
    }
}