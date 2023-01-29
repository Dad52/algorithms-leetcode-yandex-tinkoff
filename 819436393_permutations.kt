id = 819436393 
lang = kotlin 
runtime  = 367 ms 
memory = 41.7 MB
title_slug = permutations
code =

 class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val resultList = mutableListOf<List<Int>>()
        return generate(
            resultList = resultList,
            tempList = mutableListOf(),
            nums = nums
        ).toList()
    }
    
    fun generate(
        resultList: MutableList<List<Int>>,
        tempList: MutableList<Int>,
        nums: IntArray
    ): List<List<Int>> {
        if (tempList.size == nums.size) {
            resultList.add(tempList)
        } else {
            for (i in 0 until nums.size) {
                if (tempList.contains(nums[i])) continue
                tempList.add(nums[i])
                generate(resultList, tempList.toMutableList(), nums)
                tempList.remove(nums[i])
            }
        }
        return resultList
    }
    
}