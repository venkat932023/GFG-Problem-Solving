// Given the head of a linked list and an integer k, return the kth node from the end of the linked list. If k is greater than the number of nodes in the list, return -1.

// Examples :

// Input: k = 2

// Output: 8
// Explanation: 

// The 2nd node from end is 8.
// Input: k = 3

// Output: 40

// The 3rd node from the end is 40.
// Input: k = 5

// Output: -1
// Explanation: The given linked list is 10 -> 5 -> 100 -> 5. Since 'k' is more than the number of nodes, the output is -1.
// Constraints:
// 1 ≤ number of nodes ≤ 106
// 1 ≤ node->data , x ≤ 106
// 1 ≤ k ≤ 106

/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        Node s = head;
        Node f = head;
        for (int i=1; i<=k; i++){
            if (f == null) return -1;
            f = f.next;
        }
        while (f != null){
            s = s.next;
            f = f.next;
        }
        return s.data;
    }
}