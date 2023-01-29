id = 846310005 
lang = kotlin 
runtime  = 183 ms 
memory = 36 MB
title_slug = find-the-difference
code =

 class Solution {
    fun findTheDifference(s: String, t: String): Char {
        
        var res = t[t.lastIndex].toInt()
        
        s.forEachIndexed() { i, ch ->
            res = res xor s[i].toInt()
            res = res xor t[i].toInt()
        }
        
        return res.toChar()
    }
}