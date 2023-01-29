id = 691661132 
lang = kotlin 
runtime  = 554 ms 
memory = 55 MB
title_slug = sort-array-by-parity
code =

 class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        
        val evenSet = mutableListOf<Int>()
        val oddSet = mutableListOf<Int>()

        nums.forEach { num ->
            if (num % 2 == 0) {
                evenSet.add(num)
            } else {
                oddSet.add(num)
            }
        }

        println(evenSet)
        println(oddSet)
        println(evenSet + oddSet)

        return (evenSet + oddSet).toIntArray()
        
    }
}