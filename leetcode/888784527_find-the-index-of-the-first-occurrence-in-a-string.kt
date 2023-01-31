id = 888784527 
lang = kotlin 
runtime  = 166 ms 
memory = 33.8 MB
title_slug = find-the-index-of-the-first-occurrence-in-a-string
code =

 class Solution {
    fun strStr(haystack: String, needle: String): Int {
        val nl = needle.length

        if (needle.length > haystack.length)
            return -1

        if (haystack.substring(0, nl) == needle)
            return 0

        var r = 1

        while (r < haystack.length - nl + 1) {
            if (haystack.substring(r, r + nl) == needle)
                return r
            r++
        }

        return -1
    }
}
// sad
// d
// nl = 1
// while (1 < 3 - 1) 1 < 2