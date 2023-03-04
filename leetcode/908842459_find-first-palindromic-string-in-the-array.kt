id = 908842459 
lang = kotlin 
runtime  = 267 ms 
memory = 37 MB
title_slug = find-first-palindromic-string-in-the-array
code =

 class Solution {
    fun firstPalindrome(words: Array<String>): String {
        words.forEach() {
            if (isPalindrome(it))
                return it
        }

        return ""
    }

    fun isPalindrome(str: String): Boolean {
        var (l, r) = 0 to str.lastIndex
        while (l <= r) {
            if (str[l] != str[r])
                return false
            l++
            r--
        }
        return true
    }
}