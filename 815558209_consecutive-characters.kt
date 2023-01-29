id = 815558209 
lang = kotlin 
runtime  = 567 ms 
memory = 43 MB
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
            
            if (count == 1)
                print("123")
            else 
                print("321")
            
        }
        
        return max(max, count)
    }
}