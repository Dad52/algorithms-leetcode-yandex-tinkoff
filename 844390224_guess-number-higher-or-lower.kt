id = 844390224 
lang = kotlin 
runtime  = 237 ms 
memory = 33.6 MB
title_slug = guess-number-higher-or-lower
code =

 /** 
 * The API guess is defined in the parent class.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num:Int):Int {}
 */

class Solution:GuessGame() {
    override fun guessNumber(n:Int):Int {
     
        var low = 1
        var high = n
        
        while (low <= high) {
            
            var myGuess = low + (high - low) / 2
            var pick = guess(myGuess)
            
            if (pick == 0) {
                return myGuess
            } else if (pick == 1) {
                low = myGuess + 1
            } else {
                high = myGuess - 1
            }
            
        }
        return low
    }
}