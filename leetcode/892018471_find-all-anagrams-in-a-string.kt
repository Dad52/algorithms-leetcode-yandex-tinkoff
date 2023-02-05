id = 892018471 
lang = kotlin 
runtime  = 271 ms 
memory = 37.3 MB
title_slug = find-all-anagrams-in-a-string
code =

 class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        val list = mutableListOf<Int>()

        val window = p.length
        val n = s.length

        if (window > n) return list

        val count = freq(p)
        val currCount = freq(s.substring(0, window))

        if (areSame(count, currCount))
            list.add(0)
        
        for (i in window until n) {
            currCount[s[i - window] - 'a']--
            currCount[s[i] - 'a']++
            if (areSame(count, currCount))
                list.add(i - window + 1)
        }

        return list.toList()

    }
    
    fun areSame(x: Array<Int>, y: Array<Int>): Boolean {
        for (i in 0 until 26) {
            if (x[i] != y[i])
                return false
        }
        return true
    }

    fun freq(s: String): Array<Int> {
        val count = Array(26) {0}
        for (i in 0 until s.length) {
            count[s[i] - 'a']++
        }
        return count
    }
}