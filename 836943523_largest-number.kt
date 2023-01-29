id = 836943523 
lang = kotlin 
runtime  = 448 ms 
memory = 39.1 MB
title_slug = largest-number
code =

 class Solution {
    fun largestNumber(nums: IntArray): String {
        
        val list = nums.map { it.toString() }.toMutableList()
        
        list.sortWith(Comparator{ a, b ->
            (b + a).compareTo(a + b)
        })
        
        if (list.first()[0] == '0')
            return "0"
        
        return list.joinToString(separator = "")
    }
}