id = 691661908 
lang = kotlin 
runtime  = 418 ms 
memory = 54 MB
title_slug = sort-array-by-parity
code =

 class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        
        val evenSet = mutableListOf<Int>()
        val oddSet = mutableListOf<Int>()

        nums.forEach { num ->
            if (num % 2 == 0) {
                evenSet += num
            } else {
                oddSet += num
            }
        }

        println(evenSet)
        println(oddSet)
        println(evenSet + oddSet)

        return (evenSet + oddSet).toIntArray()
        
    }
}