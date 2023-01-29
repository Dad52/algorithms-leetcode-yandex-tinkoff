id = 813600886 
lang = kotlin 
runtime  = 478 ms 
memory = 55.2 MB
title_slug = longest-palindromic-substring
code =

 class Solution {
    fun longestPalindrome(s: String): String {

        var result = ""
        var left: Int
        var right: Int

        for (index in s.indices) {
            left = index
            right = index

            while (left in 0..right && right < s.length) {
                if (s[left] != s[right])
                    break
                
                if (right - left + 1 > result.length)
                    result = s.substring(left, right + 1)

                left--
                right++
            }

            left = index
            right = index + 1

            while (left in 0..right && right < s.length) {
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