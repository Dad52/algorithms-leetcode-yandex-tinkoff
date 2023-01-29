id = 845702221 
lang = kotlin 
runtime  = 276 ms 
memory = 33.8 MB
title_slug = ugly-number
code =

 class Solution {
    fun isUgly(n: Int): Boolean {
        if (n == 0)
            return false
        
        if (n == 1)
            return true
        
        if (n % 2 == 0)
            return isUgly(n / 2)
            
        if (n % 3 == 0)
            return isUgly(n / 3)
            
        if (n % 5 == 0)
            return isUgly(n / 5)
            
        return false
    }
}