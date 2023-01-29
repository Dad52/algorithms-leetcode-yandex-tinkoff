id = 688675426 
lang = kotlin 
runtime  = 401 ms 
memory = 44.5 MB
title_slug = find-smallest-letter-greater-than-target
code =

 class Solution {
    fun nextGreatestLetter(letters: CharArray, target: Char): Char {
        
        var low = 0
        var high = letters.size
        
        while (low < high) {
            
            val mid = low + (high - low) / 2
            
            if (letters[mid] <= target) low = mid + 1
            else high = mid
            
        }
        
        return letters[low % letters.size]
    }
}