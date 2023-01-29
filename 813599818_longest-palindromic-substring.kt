id = 813599818 
lang = kotlin 
runtime  = 775 ms 
memory = 453.9 MB
title_slug = longest-palindromic-substring
code =

 class Solution {
    fun longestPalindrome(s: String): String {
        
        var result = ""
        
        for (index in 0 until s.length) {
            var result1 = searchMaxSubstring(index, index, s)
            var result2 = searchMaxSubstring(index, index + 1, s)
            
            if (result1.length > result.length)
                result = result1
            
            if (result2.length > result.length)
                result = result2
        }
        return result
    }
    
    fun searchMaxSubstring(start: Int, end: Int, s: String): String {
        var result = ""
        var left = start
        var right = end
        while (left <= right && left >= 0 && right < s.length) {

            if (s[left] != s[right]) 
                break
                
            if (right - left + 1 > result.length) 
                result = s.substring(left, right + 1)
                
            left--
            right++  
        }
        return result
    }
}