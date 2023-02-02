id = 889595069 
lang = kotlin 
runtime  = 190 ms 
memory = 35.9 MB
title_slug = greatest-common-divisor-of-strings
code =

 class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if ((str1 + str2) != (str2 + str1))
            return ""

        val gcdL = gcd(str1.length, str2.length)
        return str2.substring(0, gcdL)
    }

    fun gcd(x: Int, y: Int): Int {
        if (y == 0)
            return x
        else
            return gcd(y, x % y)
    }
}

