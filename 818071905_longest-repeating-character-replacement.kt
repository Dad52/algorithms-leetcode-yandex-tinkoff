id = 818071905 
lang = kotlin 
runtime  = 356 ms 
memory = 38.6 MB
title_slug = longest-repeating-character-replacement
code =

 class Solution {
    
    fun characterReplacement(s: String, k: Int): Int {
        
        val charCount = IntArray(size = 26)

        var left = 0
        var right = 0

        var replacements = 0
        var maxCharacter = Int.MIN_VALUE
        var max = Int.MIN_VALUE

        while (left <= right && right <= s.lastIndex) {
            val windowSize = right - left + 1

            val leftDigit = s[left] - 'A'
            val rightDigit = s[right] - 'A'

            charCount[rightDigit] += 1
            maxCharacter = maxOf(maxCharacter, charCount[rightDigit])
            replacements = windowSize - maxCharacter

            if (replacements <= k) {
                max = maxOf(max, windowSize)
            } else {
                charCount[leftDigit] -= 1
                left++
            }

            right++
        }
        return max
    }
}