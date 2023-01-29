id = 703913671 
lang = kotlin 
runtime  = 250 ms 
memory = 49.3 MB
title_slug = reverse-string
code =

 class Solution {
    fun reverseString(s: CharArray): Unit {
        var start = 0
        var end = s.size - 1
        
        while(start < end) {
            s[start] = s[end].also {s[end] = s[start]}
            start++
            end--
        }
        
    }
}