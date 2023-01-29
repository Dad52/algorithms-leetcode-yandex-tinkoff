id = 817232378 
lang = kotlin 
runtime  = 812 ms 
memory = 70.1 MB
title_slug = kth-largest-element-in-a-stream
code =

 class KthLargest(val k: Int, nums: IntArray) {

    val q = PriorityQueue<Int>()
    
    init {
        nums.forEach() {
            add(it)
        }
    }
    
    fun add(`val`: Int): Int {
        q.offer(`val`)
        if (q.size > k)
            q.poll()
            
        return q.peek()
    }

}

/**
 * Your KthLargest object will be instantiated and called as such:
 * var obj = KthLargest(k, nums)
 * var param_1 = obj.add(`val`)
 */