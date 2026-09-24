Missing in Array
Solved
Difficulty: EasyAccuracy: 29.59%Submissions: 1.8MPoints: 2Average Time: 15m
You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.

Examples:

Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.
Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ arr.size() + 1

class Solution {
    int missingNum(int arr[]) {
        int n = 1+arr.length;
        int i = 0;
        while (i<arr.length){
            if (i+1 == arr[i] || arr[i] == n) i++;
            else {
                int idx = arr[i]-1;
                swap(arr, idx, i);
            }
        }
        for (int j=0; j<arr.length; j++){
            if (j+1 != arr[j]) return j+1;
        }
        
      return n;  
    }
    public static void swap(int arr[], int idx, int i ){
        int temp = arr[idx];
        arr[idx] = arr[i];
        arr[i] = temp;
    }
}