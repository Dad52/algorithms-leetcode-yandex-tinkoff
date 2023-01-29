id = 815613924 
lang = kotlin 
runtime  = 837 ms 
memory = 78.1 MB
title_slug = group-anagrams
code =

 class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val hashMap = HashMap<String, MutableList<String>>()
        
        strs.forEach() { str ->
            val key = str.toCharArray().sorted().joinToString("")
            if (!hashMap.containsKey(key)) 
                hashMap[key] = mutableListOf<String>()
            hashMap[key]?.add(str)
        }
        
        return hashMap.values.toList()
        
    }
}