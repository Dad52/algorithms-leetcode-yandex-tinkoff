id = 792881651 
lang = kotlin 
runtime  = 729 ms 
memory = 92 MB
title_slug = best-time-to-buy-and-sell-stock
code =

 import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        if (prices.size < 2) return 0
        
        var profit = 0
        var buy = Int.MAX_VALUE
        
        prices.forEach { price ->
            buy = min(buy, price)
            profit = max(profit, price - buy)
        }
        
        return profit
    }
}