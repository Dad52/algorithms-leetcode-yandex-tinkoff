id = 847958612 
lang = kotlin 
runtime  = 417 ms 
memory = 43.9 MB
title_slug = perfect-squares
code =

 class Solution {
    fun numSquares(n: Int): Int {
        
        val dp = Array<Int>(n + 1) {Int.MAX_VALUE}
        
        dp[0] = 0
        
        for (i in 1 until n + 1) {
            var j = 1
            
            while (j * j <= i) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1)
                j++
            }
            
        }
        
        return dp[n]
    }
}