id = 842552960 
lang = kotlin 
runtime  = 364 ms 
memory = 39.5 MB
title_slug = reverse-words-in-a-string
code =

 class Solution {
    fun reverseWords(s: String): String {
        val list = mutableListOf<String>()
        
        var sb = StringBuilder()
        var p = 0
        
        s.trim()
        
        while (p <= s.length) {
            if (p < s.length && s[p] != ' ' ) {
                sb.append(s[p])
            } else {
                if(!sb.isEmpty()) {
                    list.add(sb.toString())
                    sb.clear()
                }
            }
            p++
        } 
        
        return list.reversed().joinToString(separator = " ") 
    }
}