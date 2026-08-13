// Peak element
// Difficulty: MediumAccuracy: 38.86%Submissions: 648K+Points: 4Average Time: 30m
// You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).

// If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

// Note: Consider the element before the first element and the element after the last element to be negative infinity.

// Examples :

// Input: arr = [1, 2, 4, 5, 7, 8, 3]
// Output: true
// Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
// Input: arr = [10, 20, 15, 2, 23, 90, 80]
// Output: true
// Explanation: Element 20 at index 1 is a peak since 10 < 20 > 15. Index 5 (value 90) is also a peak, but returning any one peak index is valid.
// Constraints:
// 1 ≤ arr.size() ≤ 106
// -231 ≤ arr[i] ≤ 231 - 1

class Solution {
	public int peakElement(int[] arr) {
		int l = 1; h = arr.length - 2;
		while (l <= h) {
			int m = (l + h)/2;
			if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1])
				return m;
			else if (arr[m] > arr[m - 1] && arr[m] < arr[m + 1])
				l = m + 1;
			else
				h = m - 1;
		}
		return 99999;
	}
}
