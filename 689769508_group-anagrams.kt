id = 689769508 
lang = kotlin 
runtime  = 355 ms 
memory = 41.4 MB
title_slug = group-anagrams
code =

 class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val groups = mutableListOf<List<String>>()

        val hash = hashMapOf<List<Char>, MutableList<String>>()

        strs.forEach { str ->
            var subGroup: MutableList<String> = mutableListOf()
            val newChar: List<Char> = str.toCharArray().sorted()
            if (!hash.containsKey(newChar)) {
                subGroup.add(str)
                hash.put(newChar, subGroup)
            } else {
                subGroup = hash.getValue(newChar)
                subGroup.add(str)
                hash.put(newChar, subGroup)
            }

        }

        hash.forEach { elem ->
            groups.add(hash.getValue(elem.key))
        }

        return groups
        
    }
}