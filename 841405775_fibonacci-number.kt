id = 841405775 
lang = kotlin 
runtime  = 191 ms 
memory = 33.2 MB
title_slug = fibonacci-number
code =

 class Solution {
    fun fib(n: Int): Int {
        if (n < 2) return n
        
        var a = 0
        var b = 1
        for (i in 2 until n + 1) {
            a = b.also { b = a + b }
        }
        
        return b
    }
}
