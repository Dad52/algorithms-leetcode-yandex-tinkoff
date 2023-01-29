id = 841869445 
lang = kotlin 
runtime  = 1183 ms 
memory = 90.1 MB
title_slug = find-median-from-data-stream
code =

 class MedianFinder() {

    val half1 = PriorityQueue<Int>()
    val half2 = PriorityQueue<Int>(Collections.reverseOrder())
    var even = true
    
    fun addNum(num: Int) {
        
        if (even) {
            half1.offer(num)
            half2.offer(half1.poll())
        } else {
            half2.offer(num)
            half1.offer(half2.poll())
        }
        
        even = !even
    }

    fun findMedian(): Double {
        if (even)
            return (half1.peek() + half2.peek()) / 2.0
        else 
            return half2.peek().toDouble()
    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * var obj = MedianFinder()
 * obj.addNum(num)
 * var param_2 = obj.findMedian()
 */