id = 689045598 
lang = kotlin 
runtime  = 306 ms 
memory = 38.2 MB
title_slug = valid-anagram
code =

 class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return s.toCharArray().sorted() == t.toCharArray().sorted()
    }
}