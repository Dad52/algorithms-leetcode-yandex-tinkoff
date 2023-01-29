id = 836830101 
lang = kotlin 
runtime  = 603 ms 
memory = 55.1 MB
title_slug = replace-elements-with-greatest-element-on-right-side
code =

 class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = - 1
        
        for (i in arr.size - 1 downTo 0) {
            arr[i] = max.also { max = Math.max(arr[i], max) }
        }
        
        return arr
    }
}