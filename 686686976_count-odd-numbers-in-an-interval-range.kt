id = 686686976 
lang = kotlin 
runtime  = 3090 ms 
memory = 33.8 MB
title_slug = count-odd-numbers-in-an-interval-range
code =

 class Solution {
    fun countOdds(low: Int, high: Int): Int {
        
        var quantity = 0
        
        for (index in low..high) {
            if (index % 2 != 0) quantity++
        }
        return quantity
    }
}