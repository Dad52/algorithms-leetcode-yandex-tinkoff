id = 871859203 
lang = kotlin 
runtime  = 1206 ms 
memory = 172.5 MB
title_slug = palindrome-partitioning
code =

 class Solution {
    fun partition(s: String): List<List<String>> {

        val res = mutableListOf<List<String>>()
        val part = mutableListOf<String>()

        fun isPalindrome(l: Int, r: Int): Boolean {
            if (l >= r) return true
            return s[l] == s[r] && isPalindrome(l + 1, r - 1)
        }

        fun dfs(i: Int) {
            if (i >= s.length) {
                res += part.toList()
                return
            }

            for (j in i until s.length) {
                if (!isPalindrome(i, j)) continue
                part += s.substring(i, j + 1)
                dfs(j + 1)
                part.removeAt(part.size - 1)
            }

        }

        dfs(0)
        return res.toList()
    }
}