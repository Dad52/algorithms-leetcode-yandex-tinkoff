id = 817311295 
lang = kotlin 
runtime  = 938 ms 
memory = 71.3 MB
title_slug = kth-largest-element-in-an-array
code =

 class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        
        val q = PriorityQueue<Int>(k)
        
        nums.forEach() {
            q.offer(it)
            if (q.size > k)
                q.poll()
        }
        
        return q.poll()
    }
}