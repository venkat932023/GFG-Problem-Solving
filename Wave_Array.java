// Wave Array
// Solved
// Difficulty: MediumAccuracy: 63.69%Submissions: 301K+Points: 4Average Time: 20m
// Given an sorted array arr[] of integers. Sort the array into a wave-like array (In Place). In other words, arrange the elements into a sequence such that : arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ... and so on. If there are multiple solutions, find the lexicographically smallest one.

// Note: The given array is sorted in ascending order, and modify the given array in-place without returning a new array.

// Examples:

// Input: arr[] = [1, 2, 3, 4, 5]
// Output: [2, 1, 4, 3, 5]
// Explanation: Array elements after sorting it in the waveform are 2, 1, 4, 3, 5.
// Input: arr[] = [2, 4, 7, 8, 9, 10]
// Output: [4, 2, 8, 7, 10, 9]
// Explanation: Array elements after sorting it in the waveform are 4, 2, 8, 7, 10, 9.
// Input: arr[] = [1]
// Output: [1]
// Constraints:
// 1 ≤ arr.size ≤ 106
// 0 ≤ arr[i] ≤109

class Solution {
    public void sortInWave(int arr[]) {
        int n = arr.length;
        for (int i=1; i<n; i+=2){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
        
    }
}
