id = 819536689 
lang = kotlin 
runtime  = 352 ms 
memory = 37.9 MB
title_slug = subsets
code =

 class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        
        val resultList = mutableListOf<List<Int>>()
        
        fun backtrack(
            start: Int,
            tempList: ArrayList<Int>,
            nums: IntArray
        ) {
            resultList.add(tempList.toList())
            
            for (i in start until nums.size) {
                tempList.add(nums[i])
                backtrack(start = i + 1, tempList = tempList, nums = nums)
                tempList.removeAt(tempList.size - 1)
            }
            
        }
        
        backtrack(start = 0, tempList = arrayListOf(), nums = nums)
        
        return resultList
    }
}