id = 690097050 
lang = kotlin 
runtime  = 891 ms 
memory = 93 MB
title_slug = best-time-to-buy-and-sell-stock
code =

 class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var minPrice = Int.MAX_VALUE
        var profit = 0 

        prices.forEach { stock ->
            minPrice = minOf(minPrice, stock)
            profit = maxOf(profit, stock - minPrice)
        }

        return profit
        
    }
}