id = 689049278 
lang = kotlin 
runtime  = 256 ms 
memory = 36.2 MB
title_slug = valid-anagram
code =

 class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        if (s.length != t.length) return false
        
        return checkAnagram(s) == checkAnagram(t)
    }
    
    fun checkAnagram(str: String) : HashMap<Char, Int> {

    val hash = hashMapOf<Char, Int>()
    
    str.forEach { letter ->
        if (hash.containsKey(letter)) {
            val frequency = hash.getValue(letter)
            hash.put(letter, frequency + 1)
            
        } else {
            hash.put(letter, 1)
        }
    }

    return hash
}
    
}