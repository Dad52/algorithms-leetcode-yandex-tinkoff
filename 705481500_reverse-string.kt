id = 705481500 
lang = kotlin 
runtime  = 507 ms 
memory = 57.8 MB
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