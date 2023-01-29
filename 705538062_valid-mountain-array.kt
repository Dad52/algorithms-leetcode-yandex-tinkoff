id = 705538062 
lang = kotlin 
runtime  = 258 ms 
memory = 38.4 MB
title_slug = valid-mountain-array
code =

 class Solution {
    fun validMountainArray(arr: IntArray): Boolean {

        var max = 0
        var maxInd = 0

        arr.forEachIndexed { index, num ->
            if (num > max) {
                max = num
                maxInd = index
            }
        }

        if (arr[0] == max || arr.last() == max) return false

        for (i in 0 until maxInd) {
            if (arr[i] >= arr[i + 1]) return false
        }

        for (i in maxInd until arr.lastIndex) {
            if (arr[i] <= arr[i + 1]) return false
        }

        return true
    }
}