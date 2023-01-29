id = 692972749 
lang = kotlin 
runtime  = 553 ms 
memory = 45 MB
title_slug = palindrome-number
code =

 class Solution {
    fun isPalindrome(x: Int): Boolean {
        
        val mainChars = x.toString().toCharArray().toList()
        val reversedChars = mainChars.reversed()

        return mainChars == reversedChars
        
    }
}