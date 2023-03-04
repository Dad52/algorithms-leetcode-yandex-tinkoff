id = 898436940 
lang = kotlin 
runtime  = 319 ms 
memory = 40.2 MB
title_slug = add-to-array-form-of-integer
code =

 class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        var curr = k
        val list = mutableListOf<Int>()

        var i = num.size

        while (--i >= 0 || curr > 0) {
            if (i >= 0)
                curr += num[i]
            list.add(curr % 10)
            curr /= 10
        }

        list.reverse()
        return list.toList()
    }
}