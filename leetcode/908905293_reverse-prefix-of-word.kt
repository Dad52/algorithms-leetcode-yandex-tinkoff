id = 908905293 
lang = kotlin 
runtime  = 124 ms 
memory = 33.6 MB
title_slug = reverse-prefix-of-word
code =

 class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        val sb = StringBuilder()
        var index = -1

        for (i in 0 until word.length) {
            sb.append(word[i])
            if (word[i] == ch) {
                index = i + 1
                sb.reverse()
                break
            }
        }

        if (index != -1) sb.append(word.substring(index, word.length))
        
        return sb.toString()
    }
}