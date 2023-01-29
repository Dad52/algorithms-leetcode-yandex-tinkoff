id = 703636270 
lang = kotlin 
runtime  = 535 ms 
memory = 45.1 MB
title_slug = trapping-rain-water
code =

 class Solution {
    fun trap(height: IntArray): Int {

        var trappedWater = 0

        var peekIndex = 0

        for (i in height.indices) {
            if (height[peekIndex] < height[i]) peekIndex = i
        }

        var lastMax = -1

        for (index in 0..peekIndex) {

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

            if (index == peekIndex) break

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