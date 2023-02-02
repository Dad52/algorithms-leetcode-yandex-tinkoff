id = 889615534 
lang = kotlin 
runtime  = 142 ms 
memory = 32.6 MB
title_slug = count-numbers-with-unique-digits
code =

 class Solution {
    fun countNumbersWithUniqueDigits(n: Int): Int {
        if (n == 0) 
            return 1

        var temp = 9
        var ans = 10

        for (i in 1 until n) {
            temp *= (10 - i)
            ans += temp
        }

        return ans
    }
}