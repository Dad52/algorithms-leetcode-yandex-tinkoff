id = 686553496 
lang = kotlin 
runtime  = 322 ms 
memory = 33 MB
title_slug = first-bad-version
code =

 /* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        
        if (isBadVersion(1)) return 1
        
        var low = 1
        var high = n
        
        while (low <= high) {
            
            var mid = low + (high - low) / 2
            
            if (isBadVersion(mid)) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
        return low
	}
}