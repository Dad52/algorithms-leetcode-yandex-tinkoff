id = 913819899 
lang = kotlin 
runtime  = 127 ms 
memory = 33.3 MB
title_slug = split-a-string-in-balanced-strings
code =

 class Solution {
    fun balancedStringSplit(s: String): Int {
        var res = 0
        var curr = 0

        s.forEach() {
            if (it == 'R')
                curr++
            else
                curr--
            if (curr == 0)
                res++
        }

        return res
    }
}