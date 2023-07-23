// Question 7: Longest Palindromic Substring

// Skill Mapping: Medium

// Description: Solve the LeetCode Problem given as a link below -

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxLength = 1;
        int start = 0;

       
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                start = i;
                maxLength = 2;
            }
        }

      
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;

                
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;

                    
                    if (len > maxLength) {
                        start = i;
                        maxLength = len;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }
}
