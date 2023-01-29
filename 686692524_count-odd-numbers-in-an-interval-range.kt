id = 686692524 
lang = kotlin 
runtime  = 178 ms 
memory = 33.5 MB
title_slug = count-odd-numbers-in-an-interval-range
code =

 class Solution {
    fun countOdds(low: Int, high: Int): Int {
        
        var answer = (high - low) / 2

        if (low % 2 != 0 || high % 2 != 0) return answer + 1

        return answer
    }
}