id = 789753091 
lang = kotlin 
runtime  = 363 ms 
memory = 37.5 MB
title_slug = isomorphic-strings
code =

 class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {

        val hashMap = HashMap<Char, Char>()

        for (index in s.indices) {

            val sChar = s[index]
            val tChar = t[index]

            if (hashMap.containsKey(sChar)) {
                val sValue = hashMap.getValue(sChar)
                if (tChar != sValue) return false
            } else {
                if (hashMap.containsValue(tChar)) return false
                hashMap[sChar] = tChar
            }

        }
        return true
    }
}