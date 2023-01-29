id = 691661682 
lang = kotlin 
runtime  = 479 ms 
memory = 62.2 MB
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