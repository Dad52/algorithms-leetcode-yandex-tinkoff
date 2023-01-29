id = 815672630 
lang = kotlin 
runtime  = 336 ms 
memory = 38.8 MB
title_slug = intersection-of-two-arrays
code =

 class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        
        val hashSet1 = HashSet<Int>()
        val hashSet2 = HashSet<Int>()
        
        nums1.forEach { i ->
            hashSet1.add(i)
        }
        
        nums2.forEach { i ->
            hashSet2.add(i)
        }
        
        hashSet1.retainAll(hashSet2)
        
        return hashSet1.toList().toIntArray()
        
    }
}