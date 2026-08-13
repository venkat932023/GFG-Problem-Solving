// First and Last in Sorted
// Solved
// Difficulty: MediumAccuracy: 37.36%Submissions: 365K+Points: 4Average Time: 15m
// Given a sorted array arr[] with possibly some duplicates, find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.

// Examples:

// Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
// Output: [2, 5]
// Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
// Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
// Output: [6, 6]
// Explanation: First and last occurrence of 7 is at index 6
// Input: arr[] = [1, 2, 3], x = 4
// Output: [-1, -1]
// Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
// Constraints:
// 1 ≤ arr.size() ≤ 106
// 1 ≤ arr[i], x ≤ 109


class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> al=new ArrayList<>();
        int l=0, h=arr.length-1, idx = -1;
        while (l<=h){
            int m = (l+h)/2;
            if (arr[m] > x) h = m-1;
            else if(arr[m] < x) l = m+1;
            else{
                idx = m;
                h = m-1;
            }
        }
        al.add(idx);
        
        int l1=0,h1=arr.length-1,idx1=-1;
        while(l1<=h1){
            int m = (l1+h1)/2;
            if (arr[m] > x) h1 = m-1;
            else if(arr[m] < x) l1 = m+1;
            else{
                idx1 = m;
                l1 = m+1;
            }
        }
        al.add(idx1);
        return al;
    }
}
