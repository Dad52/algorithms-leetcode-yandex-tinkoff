id = 907252420 
lang = kotlin 
runtime  = 236 ms 
memory = 39.1 MB
title_slug = can-place-flowers
code =

 class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        val list = mutableListOf<Int>()
        list.add(0)
        list.addAll(flowerbed.toList())
        list.add(0)
        var k = n
        for (i in 0 until list.size) {
            if (i - 1 >= 0 && i + 1 < list.size) {
                if (list[i - 1] == 0 && list[i] == 0 && list[i + 1] == 0) {
                    list[i] = 1
                    k--
                }
            }
        }
        return k <= 0 
    }
}