// Palindrome String
// Solved
// Difficulty: EasyAccuracy: 51.21%Submissions: 518K+Points: 2
// Given a string s, return true if the string is a palindrome. Otherwise, return false.

// A string is considered a palindrome if it reads the same forwards and backwards.

// Examples :

// Input: s = "abba"
// Output: true
// Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
// Input: s = "abc" 
// Output: false
// Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
// Constraints:
// 1 ≤ s.size() ≤ 106

class Solution {
    boolean isPalindrome(String s) {
       int  i = 0, j = s.length()-1;
        while (i<=j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}