id = 887529305 
lang = kotlin 
runtime  = 145 ms 
memory = 32.8 MB
title_slug = climbing-stairs
code =

 class Solution {
    fun climbStairs(n: Int): Int {
        val dp = Array(n + 1) {0}

        if (n <= 3) return n

        dp[0] = 0
        dp[1] = 1
        dp[2] = 2
        dp[3] = 3

        for (i in 4..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[n]
    }
}