// Middle of Linked List
// Solved
// Difficulty: EasyAccuracy: 57.93%Submissions: 424K+Points: 2Average Time: 20m
// Given a linked list, You have to return the value of the middle node of the linked list.

// If the number of nodes is odd, return the middle node value.
// If the number of nodes is even, there are two middle nodes, so return the second middle node value.
// Examples:

// Input: 
   
// Output: 3
// Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
   
// Input:
   
// Output: 7 
// Explanation: The given linked list is 2->4->6->7->5->1 so, there are two middle node 6 and 7, return the second middle node as 7.
   
// Constraints:

// 1 ≤ size of linked list, node.data ≤ 105

/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        int len = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            len++;
        }
        temp = head;
        for (int i=1; i<=len/2; i++){
            temp = temp.next;
        }
        return temp.data;
    }
}