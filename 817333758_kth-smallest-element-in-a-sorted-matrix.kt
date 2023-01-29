id = 817333758 
lang = kotlin 
runtime  = 849 ms 
memory = 73.1 MB
title_slug = kth-smallest-element-in-a-sorted-matrix
code =

 class Solution {
    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {
        
        val q = PriorityQueue<Int>(k) { a, b -> b - a }
        
        matrix.forEach() {
            it.forEach() { num ->
                q.offer(num)
                if (q.size > k)
                    q.poll()
            }
        }
        
        print(q)
        
        return q.poll()
    }
}