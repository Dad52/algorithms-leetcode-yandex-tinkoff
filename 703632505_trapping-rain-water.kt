id = 703632505 
lang = kotlin 
runtime  = 344 ms 
memory = 49.4 MB
title_slug = trapping-rain-water
code =

 class Solution {
    fun trap(height: IntArray): Int {

        var trappedWater = 0

        var mostPeekIndex = 0

        for (i in height.indices) {
            if (height[mostPeekIndex] < height[i]) mostPeekIndex = i
        }

        var lastMax = -1

        for (index in 0..mostPeekIndex) {

            val currentHeight = height[index]

            if (lastMax > currentHeight) {
                trappedWater += lastMax - currentHeight
            }

            if (lastMax < currentHeight) {
                lastMax = currentHeight
            }
        }

        lastMax = -1

        for (index in height.size - 1 downTo 1) {

            val currentHeight = height[index]

            if (index == mostPeekIndex) break

            if (lastMax > currentHeight) {
                trappedWater += lastMax - currentHeight
            }

            if (lastMax < currentHeight) {
                lastMax = currentHeight
            }
        }

        return trappedWater

    }
}