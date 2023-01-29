id = 845152265 
lang = kotlin 
runtime  = 535 ms 
memory = 56.6 MB
title_slug = count-the-number-of-consistent-strings
code =

 class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        
        val set = HashSet<Char>()
        var res = 0
        
        allowed.forEach() {
            set.add(it)
        }
        
        words.forEach() {
            for (i in 0 until it.length) {
                if (!set.contains(it[i]))
                    break
                if (i == it.lastIndex)
                    res++
            }
        }
        
        return res
        
    }
}