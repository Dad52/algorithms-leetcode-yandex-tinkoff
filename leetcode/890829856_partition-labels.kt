id = 890829856 
lang = kotlin 
runtime  = 266 ms 
memory = 38.2 MB
title_slug = partition-labels
code =

 class Solution {
    fun partitionLabels(s: String): List<Int> {
        val list = mutableListOf<Int>()
        var j = 0
        var curr = 0

        for (i in 0 until s.length) {
            curr++
            if (s.substring(j..i).none { s.substring(i + 1).contains(it) }) {
                list.add(curr)
                curr = 0
                j = i
            }
        }

        return list.toList()
    }
}

//         9       16
// ababcbaca defegde hijhklij