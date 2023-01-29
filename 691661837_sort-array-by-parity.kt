id = 691661837 
lang = kotlin 
runtime  = 678 ms 
memory = 56 MB
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