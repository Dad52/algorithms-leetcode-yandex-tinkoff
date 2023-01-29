id = 688981426 
lang = kotlin 
runtime  = 206 ms 
memory = 34.4 MB
title_slug = arranging-coins
code =

 class Solution {
    fun arrangeCoins(n: Int): Int {
        
        var low = 0
        var high = n
        
        while(low <= high) {
            
            var mid = (low + high) / 2
            var max = mid.toLong() * (mid.toLong() + 1) / 2
            
            if (max.toInt() == n) return mid
            else if (max < n) low = mid + 1
            else high = mid - 1
            
        }
        
        return high
        
    }
}