id = 706245121 
lang = kotlin 
runtime  = 313 ms 
memory = 44.5 MB
title_slug = find-first-and-last-position-of-element-in-sorted-array
code =

 class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
         
        var low = 0
        var high = nums.lastIndex
        
        var firstId = -111 
        var secondId = -111
        
        if (nums.isEmpty()) return intArrayOf(-1, -1)
        
        for (index in nums.indices) {
            if (nums[index] == target && firstId == -111) firstId = index
            if (nums[index] == target && firstId != -111) secondId = index
        }
        
        if (firstId == -111 && secondId == -111) return IntArray(2){-1}
        else return intArrayOf(firstId, secondId)
        
        
//         while (low <= high) {
            
//             var mid = low + (high - low) / 2
            
//             if (firstNum == -111) {
//                 if (nums[mid] == target) {
//                     if (mid != 0 && nums[mid - 1] == target) return intArrayOf(mid - 1, mid)
//                     if (mid != nums.lastIndex && nums[mid + 1] == target) return intArrayOf(mid, mid + 1)
//                     else return intArrayOf(mid, mid)
//                     firstNum = mid
//                     break
//                 } else if (nums[mid] > target) high = mid - 1
//                 else low = mid + 1
//             }
//         }
        
        return intArrayOf(-1, -1)
    }
}