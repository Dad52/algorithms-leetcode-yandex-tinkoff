id = 686551373 
lang = kotlin 
runtime  = 467 ms 
memory = 33.2 MB
title_slug = first-bad-version
code =

 /* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        
        var low = 1
        var high = n
        
        while (low <= high) {
            
            var mid = low + (high - low) / 2
            
            if (isBadVersion(mid)) {
                high = mid - 1
            } else if(!isBadVersion(mid)) {
                low = mid + 1
            } else {
                break
            }
        }
        return low
	}
}