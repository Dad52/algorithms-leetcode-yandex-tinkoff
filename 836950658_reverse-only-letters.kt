id = 836950658 
lang = kotlin 
runtime  = 175 ms 
memory = 33.7 MB
title_slug = reverse-only-letters
code =

 class Solution {
    fun reverseOnlyLetters(s: String): String {
        val sb = StringBuilder(s)
        
        var left = 0
        var right = s.length - 1
        
        while (left < right) {
            while (left < right && !sb[left].isLetter()) {
                left++
            }
            while (left < right && !sb[right].isLetter()) {
                right--
            }
            
            sb[left] = sb[right].also { sb[right--] = sb[left++] }
        }
        
        return sb.toString()
    }
}