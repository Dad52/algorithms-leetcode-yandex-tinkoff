id = 812929015 
lang = kotlin 
runtime  = 412 ms 
memory = 48.6 MB
title_slug = missing-number
code =

 class Solution {
    fun missingNumber(nums: IntArray): Int {
        
        var sum = 0
        
        nums.forEach() {
            sum += it
        }
        
        var mustBe = (nums.size * (nums.size + 1)) / 2
        
        return mustBe - sum
        
    }
}