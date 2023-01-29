id = 842836629 
lang = kotlin 
runtime  = 351 ms 
memory = 37.7 MB
title_slug = edit-distance
code =

 class Solution {
    fun minDistance(word1: String, word2: String): Int {
        
        val m = word1.length
        val n = word2.length
        
        val dp = Array(m + 1) { IntArray(n + 1) }
        
        for (i in 0 until m + 1) {
            dp[i][0] = i
        }
        
        for (i in 0 until n + 1) {
            dp[0][i] = i
        }
        
        for (i in 1 until m + 1) {
            for (j in 1 until n + 1) {
                if (word1[i - 1] == word2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1]
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1],dp[i - 1][j - 1]));
                }
            }
        }
        
        return dp[m][n]
    }
}