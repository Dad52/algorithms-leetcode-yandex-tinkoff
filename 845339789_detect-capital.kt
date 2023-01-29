id = 845339789 
lang = kotlin 
runtime  = 335 ms 
memory = 35.2 MB
title_slug = detect-capital
code =

 class Solution {
    fun detectCapitalUse(word: String): Boolean {
        
        if (word.length < 2)
            return true
        
        if (word.toUpperCase() == word)
            return true
        
        if (word.substring(1).toLowerCase() == word.substring(1))
            return true
        
        return false
    }
}
