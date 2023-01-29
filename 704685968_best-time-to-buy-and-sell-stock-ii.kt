id = 704685968 
lang = kotlin 
runtime  = 402 ms 
memory = 39.2 MB
title_slug = best-time-to-buy-and-sell-stock-ii
code =

 class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        if (prices.size < 2) return 0
        
        var profit = 0

        for (index in 0 until prices.size - 1 ) {
            if (prices[index] < prices[index + 1]) profit += prices[index + 1] - prices[index]
        }

        return profit
        
    }
}