id = 817310758 
lang = kotlin 
runtime  = 837 ms 
memory = 71 MB
title_slug = kth-largest-element-in-an-array
code =

 class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        
        val q = PriorityQueue<Int>(k + 1)
        
        nums.forEach() {
            q.offer(it)
            if (q.size > k)
                q.poll()
        }
        
        return q.poll()
    }
}