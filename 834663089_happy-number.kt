id = 834663089 
lang = kotlin 
runtime  = 231 ms 
memory = 33.7 MB
title_slug = happy-number
code =

 class Solution {
    fun isHappy(n: Int): Boolean {
        
        var curr = n
        
        while (curr != 1 && curr != 4) {
            curr = getNext(curr)
        }
        return curr == 1
    }
    
    fun getNext(n: Int): Int {
        
        var totalSum = 0
        var curr = n
        
        while(curr > 0) {
            val d = curr % 10
            curr = curr / 10
            totalSum += d * d
        }
        
        return totalSum
    }
    
}