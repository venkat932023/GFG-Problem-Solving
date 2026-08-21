// Most Frequent Character
// Solved
// Difficulty: EasyAccuracy: 53.55%Submissions: 152K+Points: 2Average Time: 30m
// Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.

// Examples:

// Input: s = "testsample"
// Output: 'e'
// Explanation: 'e' is the character which is having the highest frequency.
// Input: s = "output"
// Output: 't'
// Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
// Constraints:
// 1 ≤ |s| ≤ 100



class Solution {
    public static char getMaxOccuringChar(String s) {
        int n = s.length();
        int fre[] = new int[26];
        for (int i=0; i<n; i++){
            char ch = s.charAt(i);
            int idx = ch-'a';
            fre[idx]++;
        }
        int max_idx = 0;
        char ans = s.charAt(0);
        for (int i=0; i<26; i++){
            if (fre[i]>max_idx){
                max_idx = fre[i];
                ans = (char)(i+97);
            }
        }
        return ans;
        
    }
}