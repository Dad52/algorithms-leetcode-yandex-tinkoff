id = 706032760 
lang = kotlin 
runtime  = 196 ms 
memory = 33.2 MB
title_slug = climbing-stairs
code =

 class Solution {
    fun climbStairs(n: Int): Int {

        if (n == 1) return 1
        if (n == 2) return 2

        var currentStep = 1
        var nextStep = 2

        for (index in 3..n) {
            val sum = currentStep + nextStep
            currentStep = nextStep
            nextStep = sum
        }
        return nextStep
    }
}