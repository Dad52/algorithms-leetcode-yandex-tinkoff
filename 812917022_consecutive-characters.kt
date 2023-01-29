id = 812917022 
lang = kotlin 
runtime  = 351 ms 
memory = 36.1 MB
title_slug = consecutive-characters
code =

 import java.lang.Math.max
class Solution {
    fun maxPower(s: String): Int {
        
        var max = 1
        var count = 1
        var prev = s[0]
        
        for (index in 1 until s.length) {
            val ch = s[index]
            if (ch == prev) {
                count++
            } else {
                count = 1
                prev = ch
            }
            max = max(max, count)
        }
        
        return max
    }
}