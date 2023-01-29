id = 844062666 
lang = kotlin 
runtime  = 352 ms 
memory = 63.1 MB
title_slug = coin-change
code =

 class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        
        val dp = Array(amount + 1) {amount + 1}
        
        dp[0] = 0
            
        for (i in 1 until amount + 1) {
            coins.forEach() { c ->
                if (i - c >= 0)
                    dp[i] = Math.min(dp[i], 1 + dp[i - c])
            }
        }
        
        if (dp[amount] == amount + 1)
            return -1
        
        return dp[amount]
    }
}