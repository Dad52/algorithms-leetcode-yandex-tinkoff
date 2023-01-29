id = 745934363 
lang = kotlin 
runtime  = 298 ms 
memory = 38.7 MB
title_slug = longest-substring-without-repeating-characters
code =

 import kotlin.math.max
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val hashMap = HashMap<Char, Int>()
        var windowStart = 0
        var longest = 0

        for (windowEnd in s.indices) {

            val ch = s[windowEnd]

            if (hashMap.contains(ch)) {
                windowStart = max(windowStart, hashMap[ch]?.plus(1) ?: 0)
            }
            hashMap[ch] = windowEnd
            longest = max(longest, windowEnd - windowStart + 1)
        }

        return longest
    }
}