id = 708553094 
lang = kotlin 
runtime  = 204 ms 
memory = 33.9 MB
title_slug = number-of-steps-to-reduce-a-number-to-zero
code =

 class Solution {
    fun numberOfSteps(num: Int): Int {
        var num2 = num
        var count = 0
        while (num2 != 0) {
            if (num2 % 2 == 0) {
                num2 /= 2
                
            } else {
                num2 -= 1
            }
            count++
        }
        return count
    }
}