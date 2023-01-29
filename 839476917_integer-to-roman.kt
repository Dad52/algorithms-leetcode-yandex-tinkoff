id = 839476917 
lang = kotlin 
runtime  = 476 ms 
memory = 42.6 MB
title_slug = integer-to-roman
code =

 class Solution {
    fun intToRoman(num: Int): String {
        var s = StringBuilder()
        var localNum = num
        
        val value = listOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val roman = listOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        
        for (i in 0 until value.size) {
            
            while (localNum >= value[i] && localNum > 0) {
                s.append(roman[i])
                localNum -= value[i]
            }
            
        }
        
        return s.toString()
    }
}