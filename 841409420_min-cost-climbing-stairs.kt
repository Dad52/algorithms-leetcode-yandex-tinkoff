id = 841409420 
lang = kotlin 
runtime  = 348 ms 
memory = 39 MB
title_slug = min-cost-climbing-stairs
code =

 class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        
        val n = cost.size
        var first = cost[0]
        var second = cost[1]
        
        if (n < 2)
            return Math.min(first, second)
            
        for (i in 2 until n) {
            val curr = cost[i] + Math.min(first, second)
            first = second
            second = curr
        }
        
        return Math.min(first, second)
    }
}