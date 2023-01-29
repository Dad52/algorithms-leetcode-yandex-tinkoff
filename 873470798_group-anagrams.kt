id = 873470798 
lang = kotlin 
runtime  = 398 ms 
memory = 42.2 MB
title_slug = group-anagrams
code =

 class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val hashMap = HashMap<String, MutableList<String>>()

        strs.forEach() { str ->
            val sortedStr = str.toCharArray().sorted().joinToString("")
            if (hashMap.containsKey(sortedStr)) {
                hashMap[sortedStr]?.add(str)
            } else {
                hashMap[sortedStr] = mutableListOf(str)
            }
        }
        
        return hashMap.values.toList()
    }
}