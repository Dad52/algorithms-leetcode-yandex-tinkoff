id = 705581570 
lang = kotlin 
runtime  = 204 ms 
memory = 33.1 MB
title_slug = fibonacci-number
code =

 class Solution {
    fun fib(n: Int): Int {
        
        when(n) {
            0 -> return 0
            1, 2 -> return 1
            else -> return fib(n - 1) + fib(n - 2)
        }
        
    }
}