id = 686692996 
lang = kotlin 
runtime  = 230 ms 
memory = 33.4 MB
title_slug = count-odd-numbers-in-an-interval-range
code =

 class Solution {
    fun countOdds(low: Int, high: Int): Int {
        
        var answer = (high - low) / 2

        if (low % 2 != 0 || high % 2 != 0) return answer + 1

        return answer
    }
}