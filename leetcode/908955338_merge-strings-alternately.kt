id = 908955338 
lang = kotlin 
runtime  = 139 ms 
memory = 34.2 MB
title_slug = merge-strings-alternately
code =

 class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var (i, j) = 0 to 0
        val sb = StringBuilder()

        while (i < word1.length || j < word2.length) {
            if (i < word1.length)
                sb.append(word1[i++])

            if (j < word2.length)
                sb.append(word2[j++])
            
        }

        return sb.toString()
    }
}