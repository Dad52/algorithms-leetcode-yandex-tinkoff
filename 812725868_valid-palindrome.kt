id = 812725868 
lang = kotlin 
runtime  = 312 ms 
memory = 39.3 MB
title_slug = valid-palindrome
code =

 class Solution {
    fun isPalindrome(s: String): Boolean {

        var left = 0
        var right = s.length - 1
        
        while (left < right) {
            
            if (left < right && !s[left].isLetterOrDigit()) {
                left++
                continue
            }
                   
            if (left < right && !s[right].isLetterOrDigit()) {
                right--
                continue
            }
            
            if (s[left].toLowerCase() != s[right].toLowerCase()) 
                return false
            
            left++
            right--
        }

        return true
    }
}