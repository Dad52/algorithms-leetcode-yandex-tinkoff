id = 792887363 
lang = kotlin 
runtime  = 283 ms 
memory = 35.3 MB
title_slug = longest-palindrome
code =

 class Solution {
    fun longestPalindrome(s: String): Int {
        val hashMap = HashMap<Char, Int>()

        s.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }

        var count = 0

        hashMap.forEach {
            if (it.value % 2 != 0) count++
        }

        return if (count > 1) {
            s.length - count + 1
        } else {
            s.length
        }

    }
}