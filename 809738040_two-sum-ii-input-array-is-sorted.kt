id = 809738040 
lang = kotlin 
runtime  = 514 ms 
memory = 49.4 MB
title_slug = two-sum-ii-input-array-is-sorted
code =

 class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        var left = 0
        var right = numbers.lastIndex
        
        while (left < right) {
            if (numbers[left] + numbers[right] == target) return intArrayOf(left + 1, right + 1)
            if (numbers[left] + numbers[right] > target) right--
            if (numbers[left] + numbers[right] < target) left++
        }

        return intArrayOf(-1, -1)
    }
}