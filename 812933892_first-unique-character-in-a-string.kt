id = 812933892 
lang = kotlin 
runtime  = 592 ms 
memory = 63.6 MB
title_slug = first-unique-character-in-a-string
code =

 class Solution {
    fun firstUniqChar(s: String): Int {
        
        val hashMap = HashMap<Char, Int>()
        
        s.forEach() { ch ->
            hashMap[ch] = hashMap.getOrDefault(ch, 0) + 1
        }
        
        s.forEachIndexed() { index, ch ->
            if (hashMap.getOrDefault(ch, 0) == 1)
                return index
        }
        
        return -1
        
    }
}