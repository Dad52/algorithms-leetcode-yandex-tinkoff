id = 887526162 
lang = kotlin 
runtime  = 135 ms 
memory = 32.7 MB
title_slug = n-th-tribonacci-number
code =

 class Solution {
    fun tribonacci(n: Int): Int {
        val dp = Array(n + 1) {0}

        if (n == 0) return 0
        if (n == 1 || n == 2) return 1
        if (n == 3) return 2

        dp[0] = 0
        dp[1] = 1
        dp[2] = 1
        dp[3] = 2

        for (i in 4..n) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]
        }

        return dp[n]
    }
}