// public Identical Trees
// Solved
// Difficulty: EasyAccuracy: 50.01%Submissions: 321K+Points: 2Average Time: 15m
// Given two binary trees with their root nodes r1 and r2, return true if both of them are identical, otherwise return false.
// Note: Two trees are identical when they have the same data and the arrangement of the data is also same.

// Examples:

// Input: r1 = [1, 2, 3, 4], r2 = [1, 2, 3, 4]

// Output: true
// Explanation: Trees are identical.
// Input: r1 = [1, 2, 3, 4], r2 = [1, 2, 3, N, N, 4]
 
// Output: false
// Explanation: Trees are not identical.
// Constraints:

// 1 ≤ size of binary trees ≤ 105
// 1 ≤ Node.data ≤ 109
//  {
    
// }
/*
class Node {
	int data;
	Node left, right;
	Node(int d) {
		data = d;
		left = right = null;
	}
}
*/

class Solution {
	public boolean isIdentical(Node r1, Node r2) {
		if (r1 == null && r2 == null)
			return true;
		if (r1 != null && r2 == null)
			return false;
		if (r1 == null && r2 != null)
			return false;
		if (r1.data != r2.data)
			return false;
		if (!isIdentical(r1.left, r2.left))
			return false;
		if (!isIdentical(r1.right, r2.right))return false;
		return true;
	}
}
