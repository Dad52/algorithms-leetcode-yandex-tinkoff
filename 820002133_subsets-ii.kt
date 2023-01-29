id = 820002133 
lang = kotlin 
runtime  = 665 ms 
memory = 71.5 MB
title_slug = subsets-ii
code =

 class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        
        val resultList = mutableListOf<List<Int>>()
        
        fun backtrack(
            start: Int,
            tempList: ArrayList<Int>,
            nums: IntArray
        ) {
            
            val list = tempList.toList().sorted()
            
            if (!resultList.contains(list))
                resultList.add(list)
            
            for (i in start until nums.size) {
                tempList.add(nums[i])
                backtrack(i + 1, tempList, nums)
                tempList.removeAt(tempList.size - 1)
            }
            
        }
        
        backtrack(start = 0, tempList = arrayListOf(), nums = nums)
        return resultList.toList()
    }
}