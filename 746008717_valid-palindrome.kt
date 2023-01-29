id = 746008717 
lang = kotlin 
runtime  = 274 ms 
memory = 38.8 MB
title_slug = valid-palindrome
code =

 class Solution {
    fun isPalindrome(s: String): Boolean {

        var right = s.length - 1
        var left = 0

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