id = 706108798 
lang = kotlin 
runtime  = 372 ms 
memory = 49.1 MB
title_slug = maximize-distance-to-closest-person
code =

 class Solution {
    fun maxDistToClosest(seats: IntArray): Int {

        var max = 0
        var lastPerson = -1

        for (index in 0 until seats.size) {
            if (seats[index] == 1) {
                if (lastPerson == -1) {
                    max = maxOf(max, index)
                } else {
                    max = maxOf(max, (index - lastPerson) / 2)
                }
                lastPerson = index
            }
        }

        max = maxOf(max, (seats.lastIndex - lastPerson))

        return max
    }
}