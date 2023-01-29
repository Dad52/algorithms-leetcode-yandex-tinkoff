id = 745839909 
lang = kotlin 
runtime  = 1097 ms 
memory = 74.4 MB
title_slug = fruit-into-baskets
code =

 import kotlin.math.max
class Solution {
    fun totalFruit(fruits: IntArray): Int {

    var startWindow = 0
    val hashMap = HashMap<Int, Int>()
    var largest = Int.MIN_VALUE
    
    for (windowsEnd in fruits.indices) {
        if (hashMap.containsKey(fruits[windowsEnd])) {
            val freq = hashMap.getValue(fruits[windowsEnd])
            hashMap[fruits[windowsEnd]] = freq + 1
        } else {
            hashMap[fruits[windowsEnd]] = 0
        }

        //Shrink window
        while (hashMap.size > 2) {
            val freq = hashMap.getValue(fruits[startWindow])
            hashMap[fruits[startWindow]] = freq - 1

            if (freq == 0) {
                hashMap.remove(fruits[startWindow])
            }

            startWindow++
        }
        largest = max(windowsEnd - startWindow + 1, largest)
    }

    return largest

}
}