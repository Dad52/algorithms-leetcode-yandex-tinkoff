id = 891151920 
lang = kotlin 
runtime  = 155 ms 
memory = 35.1 MB
title_slug = minimum-sum-of-four-digit-number-after-splitting-digits
code =

 class Solution {
    fun minimumSum(num: Int): Int {
        val str = num.toString().toCharArray()
        
        str.sort()

        val num1 = str[0].toString() + str[2].toString()
        val num2 = str[1].toString() + str[3].toString()
        
        return num1.toInt() + num2.toInt()
    }
}