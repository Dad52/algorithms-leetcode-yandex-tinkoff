id = 887406710 
lang = kotlin 
runtime  = 200 ms 
memory = 36.7 MB
title_slug = find-common-characters
code =

 class Solution {
    fun commonChars(words: Array<String>): List<String> {
        val list = ArrayList<String>()

        val common = IntArray(26) {Int.MAX_VALUE}

        for (word in words) {
            val occ = IntArray(26)
            word.forEach() {
                occ[it - 'a']++
            }
            for (c in 0..25) {
                common[c] = Math.min(occ[c], common[c])
            }
        }

        for (c in words[0]) {
            if (common[c - 'a'] > 0) {
                common[c - 'a']--
                list.add(c.toString())
            }
        }

        return list
    }
}