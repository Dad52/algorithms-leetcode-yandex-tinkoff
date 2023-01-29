id = 815671743 
lang = kotlin 
runtime  = 358 ms 
memory = 39.2 MB
title_slug = intersection-of-two-arrays
code =

 class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        
        val hashSet = HashSet<Int>()
        
        nums1.forEach { i ->
            hashSet.add(i)
        }
        
        val result = HashSet<Int>()
        
        nums2.forEach() { i ->
            if (hashSet.contains(i))
                result.add(i)
        }
        
        return result.toList().toIntArray()
        
    }
}