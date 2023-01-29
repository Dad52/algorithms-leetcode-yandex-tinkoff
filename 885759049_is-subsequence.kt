id = 885759049 
lang = kotlin 
runtime  = 233 ms 
memory = 34.1 MB
title_slug = is-subsequence
code =

 class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var (l, r) = 0 to 0

        while (r < t.length && l < s.length) {
            if (s[l] == t[r]) {
                l++
            }
            r++
        }

        return l == s.length
    }
}