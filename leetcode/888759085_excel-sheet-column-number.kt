id = 888759085 
lang = kotlin 
runtime  = 170 ms 
memory = 35.1 MB
title_slug = excel-sheet-column-number
code =

 class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var sum = 0

        columnTitle.forEach() {
            sum *= 26
            sum += it - 'A' + 1
        }

        return sum
    }
}