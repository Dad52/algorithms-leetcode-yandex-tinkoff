id = 907232478 
lang = kotlin 
runtime  = 200 ms 
memory = 36.4 MB
title_slug = ransom-note
code =

 class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val strArr = IntArray(26)
        val letArr = IntArray(26)

        ransomNote.forEach() {
            strArr[it - 'a']++
        }

        magazine.forEach() {
            letArr[it - 'a']++
        }

        ransomNote.forEach() {
            val char = it - 'a'
            if (strArr[char] > letArr[char])
                return false
        }

        return true
    }
}