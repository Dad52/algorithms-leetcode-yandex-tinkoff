id = 887524758 
lang = kotlin 
runtime  = 137 ms 
memory = 32.9 MB
title_slug = fibonacci-number
code =

 class Solution {
    fun fib(n: Int): Int {
        val dp = Array(n + 1) {0}

        if (n == 0)
            return 0

        if (n == 1 || n == 2)
            return 1

        dp[0] = 0
        dp[1] = 1

        for (i in 2..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[n]
    }
}