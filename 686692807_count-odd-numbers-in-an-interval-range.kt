id = 686692807 
lang = kotlin 
runtime  = 181 ms 
memory = 33.6 MB
title_slug = count-odd-numbers-in-an-interval-range
code =

 class Solution {
    fun countOdds(low: Int, high: Int): Int {

        if (low % 2 != 0 || high % 2 != 0) return (high - low) / 2 + 1

        return (high - low) / 2
    }
}