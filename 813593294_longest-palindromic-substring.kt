id = 813593294 
lang = kotlin 
runtime  = 286 ms 
memory = 53.6 MB
title_slug = longest-palindromic-substring
code =

 class Solution {
    fun longestPalindrome(s: String): String {
        
        var result = ""
        
        
        var left = 0
        var right = 0
        
        for (index in 0 until s.length) {

            left = index
            right = index

            while (left <= right && left >= 0 && right < s.length) {

                if (s[left] != s[right]) 
                    break
                
                if (right - left + 1 > result.length) 
                    result = s.substring(left, right + 1)
                
                left--
                right++
                
            }
            
            left = index
            right = index + 1

            while (left <= right && left >= 0 && right < s.length) {

                if (s[left] != s[right]) 
                    break
                
                if (right - left + 1 > result.length) 
                    result = s.substring(left, right + 1)
                
                left--
                right++
                
            }
        }
        return result
    }
}