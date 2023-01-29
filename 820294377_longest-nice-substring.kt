id = 820294377 
lang = kotlin 
runtime  = 285 ms 
memory = 36.5 MB
title_slug = longest-nice-substring
code =

 class Solution {
    fun longestNiceSubstring(s: String): String {
        
        if (s.length < 2) return ""
        
        val arr = s.toCharArray()
        
        var set = HashSet<Char>()
        
        arr.forEach() {
            set.add(it)
        }
        
        for (i in 0 until arr.size) {
            val ch = arr[i]
            if (set.contains(ch.toUpperCase()) && set.contains(ch.toLowerCase())) continue
            val sub1 = longestNiceSubstring(s.substring(0, i))
            val sub2 = longestNiceSubstring(s.substring(i + 1, s.length))
            return if (sub1.length >= sub2.length) sub1 else sub2
        }
        
        return s
    }
}