id = 689046007 
lang = kotlin 
runtime  = 322 ms 
memory = 38.3 MB
title_slug = valid-anagram
code =

 class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        return s.toCharArray().sorted() == t.toCharArray().sorted()
    }
}