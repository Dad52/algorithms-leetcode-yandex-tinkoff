id = 836889557 
lang = kotlin 
runtime  = 293 ms 
memory = 36.4 MB
title_slug = word-pattern
code =

 class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        
        val hashMap = HashMap<Char, String>()
        val list = s.split(" ")
        
        if (list.size != pattern.length)
            return false
        
        pattern.forEachIndexed() { i, ch ->
            if (hashMap.contains(ch)) {
                val saved = hashMap.getOrDefault(ch, "")
                if (hashMap[ch] != list[i])
                    return false
            } else {
                if (hashMap.containsValue(list[i])) 
                    return false
                hashMap[ch] = list[i]
            }
        }
        
        return true
        
    }
}