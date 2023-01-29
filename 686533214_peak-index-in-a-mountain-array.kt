id = 686533214 
lang = kotlin 
runtime  = 261 ms 
memory = 37.1 MB
title_slug = peak-index-in-a-mountain-array
code =

 class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        
        var low = 0
        var high = arr.size - 1
        
        while (low <= high) {
            
            var mid = low + (high - low) / 2
            
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1
            } else {
                high = mid - 1
            }
            
        }
        return low
    }
}