id = 843169946 
lang = kotlin 
runtime  = 274 ms 
memory = 43.7 MB
title_slug = word-break
code =

 class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        
        val dp = Array(s.length + 1) { false }
        
        dp[0] = true
        
        for (i in 1 until s.length + 1) {
            wordDict.forEach() { str ->
                if (str.length <= i) {
                    if (dp[i - str.length]) {
                        if (s.substring(i - str.length, i) == str) {
                            dp[i] = true
                            return@forEach
                        }
                    }
                }
            }
        }
        
        for (i in 1 until s.length + 1) {
            for (j in 0 until i) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true
                    break
                }
            }
        }
        
        return dp[s.length]
    }
}