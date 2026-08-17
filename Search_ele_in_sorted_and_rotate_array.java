// Search in Rotated Sorted Array
// Solved
// Difficulty: MediumAccuracy: 37.64%Submissions: 346K+Points: 4
// Given an array arr[] of distinct elements, which was initially sorted in ascending order but then rotated at some unknown pivot, the task is to find the index of a target key.  If the key is not present in the array, return -1.

// Examples :

// Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 3
// Output: 8
// Explanation: 3 is found at index 8.
// Input: arr[] = [3, 5, 1, 2], key = 6
// Output: -1
// Explanation: There is no element that has value 6.
// Input: arr[] = [33, 42, 72, 99], key = 42
// Output: 1
// Explanation: 42 is found at index 1.
// Constraints:
// 1 ≤ arr.size() ≤ 106
// 0 ≤ arr[i] ≤ 106
// 0 ≤ key ≤ 106



class Solution {
    int search(int[] arr, int key) {
        int l=0,h = arr.length-1;
        while(l<=h){
            int m = l+(h-l)/2;
            if (arr[m] == key) return m;
            else if(arr[l] <= arr[m]){
                if (arr[l] <= key && key < arr[m]) h = m-1;
                else l = m+1;
            }
            else{
                if (arr[m]<key && key<=arr[h]) l = m+1;
                else h = m-1;
            }
        }
        
        return -1;
    }
}