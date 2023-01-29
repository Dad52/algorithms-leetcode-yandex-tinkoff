id = 817236694 
lang = kotlin 
runtime  = 176 ms 
memory = 36.3 MB
title_slug = last-stone-weight
code =

 class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        
        if (stones.size == 1)
            return stones.first()
            
        val q = PriorityQueue<Int>() { a, b -> b - a }
        
        for (stone in stones) {
            q.offer(stone)
        }
        
        while (q.size > 1) {
            val first = q.poll()
            val second = q.poll()
            q.offer(first - second)
        }
        
        return q.poll()
        
    }
}