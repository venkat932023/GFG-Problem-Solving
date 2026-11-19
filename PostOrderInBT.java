// public Postorder Traversal
// Solved
// Difficulty: BasicAccuracy: 74.96%Submissions: 161K+Points: 1Average Time: 15m
// Given the root of a Binary Tree, return its Postorder Traversal.

// Note: A postorder traversal first visits the left child (including its entire subtree), then visits the right child (including its entire subtree), and finally visits the node itself.

// Examples:

// Input: root = [19, 10, 8, 11, 13]

// Output: [11, 13, 10, 8, 19]
// Explanation: The postorder traversal of the given binary tree is [11, 13, 10, 8, 19].
// Input: root = [11, 15, N, 7]
 
// Output: [7, 15, 11]
// Explanation: The postorder traversal of the given binary tree is [7, 15, 11].
// Constraints:

// 1 ≤ size of binary tree ≤ 3*104
// 0 ≤ Node.data ≤ 105
//  {
    
// }
/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
       ArrayList<Integer> ans=new ArrayList<>();
       dfs(root, ans);
       return ans;
    }
   
        public void dfs(Node root, ArrayList<Integer> ans){
                if (root == null) return;

                dfs(root.left,ans);
                dfs(root.right,ans);
                ans.add(root.data);
        }
    
}