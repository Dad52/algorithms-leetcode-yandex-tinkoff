id = 819416262 
lang = kotlin 
runtime  = 268 ms 
memory = 35.5 MB
title_slug = plus-one
code =

 class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            digits[i]++
            if (digits[i] <= 9) 
                return digits
            digits[i] = 0
        }
        
        val arr = IntArray(digits.size + 1)
        arr[0] = 1
        
        return arr
    }
}