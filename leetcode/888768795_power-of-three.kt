id = 888768795 
lang = kotlin 
runtime  = 286 ms 
memory = 35.4 MB
title_slug = power-of-three
code =

 class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        return n > 0 && 1162261467 % n == 0
    }
}