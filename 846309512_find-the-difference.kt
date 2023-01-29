id = 846309512 
lang = kotlin 
runtime  = 164 ms 
memory = 34.9 MB
title_slug = find-the-difference
code =

 class Solution {
    fun findTheDifference(s: String, t: String): Char {
        
        var res = 0
        
        s.forEach() {
            res  = res xor it.toInt()
        }
        
        t.forEach() {
            res  = res xor it.toInt()
        }
        
        return res.toChar()
    }
}