id = 806872657 
lang = kotlin 
runtime  = 287 ms 
memory = 34.4 MB
title_slug = is-subsequence
code =

 class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        
        var first = 0
        var second = 0
        
        while (first < s.length && second < t.length) {
            if (s[first] == t[second]) first++
            second++
        }
        
        return first == s.length
        
    }
}