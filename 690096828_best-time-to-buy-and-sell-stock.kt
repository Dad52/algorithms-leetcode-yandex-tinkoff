id = 690096828 
lang = kotlin 
runtime  = 1072 ms 
memory = 96.5 MB
title_slug = best-time-to-buy-and-sell-stock
code =

 class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        val hash = hashMapOf<Int, Int>()
        var minPrice = Int.MAX_VALUE
        var profit = 0 

        prices.forEachIndexed { index, stock ->
            hash.put(index, stock )
        }

        hash.forEach { stock ->
            minPrice = minOf(minPrice, stock.value)
            profit = maxOf(profit, stock.value - minPrice)
        }

        return profit
        
    }
}