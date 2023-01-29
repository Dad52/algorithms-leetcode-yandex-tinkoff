id = 705504575 
lang = kotlin 
runtime  = 660 ms 
memory = 71.9 MB
title_slug = boats-to-save-people
code =

 class Solution {

    fun numRescueBoats(people: IntArray, limit: Int): Int {

        if (people.size == 1) return 1

        people.sort()

        var boats = 0

        var l = 0
        var r = people.size - 1

        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                boats++
                l++
                r--
            } else {
                boats++
                r--
            }
        }

        return boats
    }
}