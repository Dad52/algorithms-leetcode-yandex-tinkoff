id = 908946972 
lang = kotlin 
runtime  = 198 ms 
memory = 36 MB
title_slug = shortest-distance-to-a-character
code =

 class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val arr = IntArray(s.length) {Int.MAX_VALUE}
        
        for (i in 0 until s.length) {
            if (s[i] == c) {
                arr[i] = 0
                var j = i + 1
                var cnt = 1
                while (j < s.length) { 
                    arr[j] = Math.min(arr[j], cnt++)
                    j++
                }
                j = i - 1
                cnt = 1
                while (j >= 0) {
                    arr[j] = Math.min(arr[j], cnt++)
                    j--
                }
            }
        }
        return arr
    }
}