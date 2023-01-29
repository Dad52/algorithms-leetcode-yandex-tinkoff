id = 887043868 
lang = kotlin 
runtime  = 402 ms 
memory = 39.8 MB
title_slug = find-k-closest-elements
code =

 class Solution {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        
        val list = mutableListOf<Int>()

        if (arr.size <= k)
            return arr.toList()

        var (l, r) = 0 to arr.lastIndex

        while (r - l + 1 > k) {
            if (Math.abs(arr[l] - x) > Math.abs(arr[r] - x))
                l++
            else
                r--
        }

        for (i in l..r) {
            list.add(arr[i])
        }

        return list.toList()
    }
}
