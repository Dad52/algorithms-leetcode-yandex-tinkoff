id = 815557698 
lang = kotlin 
runtime  = 343 ms 
memory = 37.5 MB
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
                max = max(max, count)
                count = 1
                prev = ch
            }
            
        }
        
        return max(max, count)
    }
}