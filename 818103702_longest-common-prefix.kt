id = 818103702 
lang = kotlin 
runtime  = 302 ms 
memory = 36.8 MB
title_slug = longest-common-prefix
code =

 class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        
        if (strs.size == 0) return ""
        
        var minWordSize = Int.MAX_VALUE
        
        strs.forEach() {
            minWordSize = Math.min(minWordSize, it.length)
        }
        
        for (i in 0 until minWordSize) {
            val char = strs.first()[i]
            
            for (j in 0 until strs.size) {
                if (strs[j][i] != char) 
                    return strs.first().substring(0, i)
            }
        }
        return strs.first().substring(0, minWordSize)
    }
}