// Symmetric Tree
// Solved
// Difficulty: EasyAccuracy: 44.96%Submissions: 186K+Points: 2Average Time: 20m
// Given  a root of binary tree, check whether it is symmetric, i.e., whether the tree is a mirror image of itself.


// Note: A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.

// Examples:

// Input: root = [10, 5, 5, 2, N, N, 2] 
   
// Output: true
// Explanation: As the left and right half of the above tree is mirror image, the tree is symmetric.
// Input: root = [8, 4, 4, N, 6, N, 6]
   
// Output: false
// Explanation:  As the left and right half of the above tree is not the mirror image, the tree is not symmetric. 
// Constraints:

// 0 ≤ size of binary tree ≤ 2000
// 1 ≤ Node.data ≤ 100
/* Structure of binary tree node
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
*/

class Solution {
	public boolean isSymmetric(Node root) {
		swap(root.left);
		return check(root.left, root.right);
		
	}
	public void swap(Node root) {
		if (root == null)
			return;
		swap(root.left);
		swap(root.right);
		Node t = root.left;
		root.left = root.right;
		root.right = t;
		
	}
	public boolean check(Node p, Node q) {
		if (p == null && q == null)
			return true;
		if (p != null && q == null)
			return false;
		if (p == null && q != null)
			return false;
		if (p != q)
			return false;
		return check(p.left, q.left) && check(p.right, q.right);
		
	}
	
}
