id = 746048587 
lang = kotlin 
runtime  = 365 ms 
memory = 38.8 MB
title_slug = permutation-in-string
code =

 class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s2.isEmpty() || s1.length > s2.length)  return false

        val window1 = IntArray(26){0}
        val window2 = IntArray(26){0}

        for (i in s1.indices) {
            window1[s1[i] - 'a']++
            window2[s2[i] - 'a']++
        }

        if (window1.contentEquals(window2)) return true

        var start = 0

        for (i in s1.length until s2.length) {

            val count = window2[s2[start] - 'a'] - 1

            if (count >= 0) {
                window2[s2[start] - 'a'] = count
            }
            window2[s2[i]- 'a']++

            if (window1.contentEquals(window2))	return true
            start++
        }
        return false
    }
}