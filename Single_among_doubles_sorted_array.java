// Single Among Doubles in a Sorted
// Solved
// Difficulty: MediumAccuracy: 55.54%Submissions: 118K+Points: 4
// Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice. 

// Examples:

// Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
// Output: 4
// Explanation: 4 is the only element that appears exactly once.
// Input: arr[] = [5]
// Output: 5
// Input: arr[] = [1, 2, 2, 3, 3]
// Output: 1
// Constraints:
// 1 ≤ arr.size() ≤ 2 * 106
// 1 ≤ arr[i] ≤ 106



class Solution {
	int single(int[] arr) {
		int n = arr.length;
		if (arr.length == 1)
			return arr[0];
		if (arr[0] != arr[1])
			return arr[0];
		if (arr[n - 1] != arr[n - 2])
			return arr[n - 1];
		int l = 0, h = n - 1;
		while (l <= h) {
			int m = l + (h - l)/2;
			if (arr[m] != arr[m - 1] && arr[m] != arr[m + 1])
				return arr[m];
			int f = m, s = m;
			if (arr[m] == arr[m - 1])
				f = m - 1;
			else
				s = m + 1;
			int left = f - l;
			int right = h - s;
			if (left % 2 == 0)
				l = s + 1;
			else
				h = f - 1;
		}
		return 999999;
		
	}
}

