id = 688676290 
lang = kotlin 
runtime  = 215 ms 
memory = 36.5 MB
title_slug = find-smallest-letter-greater-than-target
code =

 class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        
        var low = 0
        var high = letters.size
        
        if (letters[high - 1] <= target) return letters[low]
        
        while (low < high) {
            
            val mid = low + (high - low) / 2
            
            if (letters[mid] <= target) low = mid + 1
            else high = mid
            
        }
        
        return letters[low % letters.size]
    }
}