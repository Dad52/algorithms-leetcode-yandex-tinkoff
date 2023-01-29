id = 883116983 
lang = kotlin 
runtime  = 246 ms 
memory = 39.1 MB
title_slug = valid-palindrome
code =

 class Solution {
    fun isPalindrome(s: String): Boolean {
        var (l, r) = 0 to s.lastIndex

        while (l < r) {
            if (!s[r].isLetterOrDigit()) {
                r--
                continue
            }

            if (!s[l].isLetterOrDigit()) {
                l++
                continue
            }

            if (s[l].toLowerCase() != s[r].toLowerCase())
                return false

            r--
            l++
        }
        
        return true
    }
}