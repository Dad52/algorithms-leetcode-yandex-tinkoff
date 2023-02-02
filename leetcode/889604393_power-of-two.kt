id = 889604393 
lang = kotlin 
runtime  = 152 ms 
memory = 33.2 MB
title_slug = power-of-two
code =

 class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && 1073741824 % n == 0
    }
}