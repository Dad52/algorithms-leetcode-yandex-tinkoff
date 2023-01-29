id = 836947646 
lang = kotlin 
runtime  = 439 ms 
memory = 46.6 MB
title_slug = shuffle-string
code =

 class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        
        val list = CharArray(s.length)
        
        s.forEachIndexed() { i, ch -> 
            list[indices[i]] = s[i]
        }
        
        return list.joinToString(separator = "")
    }
}