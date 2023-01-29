id = 836833102 
lang = kotlin 
runtime  = 243 ms 
memory = 36.3 MB
title_slug = length-of-last-word
code =

 class Solution {
    fun lengthOfLastWord(s: String): Int {
        
        val str = s.trim()
        var count = 0
        
        if (s.length == 0) {
            return 0
        }
        
        for (i in str.length - 1 downTo 0) {
            if (str[i] == ' ')
                break
            
            count++
        }
        
        return count
    }
}