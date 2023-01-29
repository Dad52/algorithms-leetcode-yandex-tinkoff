id = 884318145 
lang = kotlin 
runtime  = 332 ms 
memory = 37.7 MB
title_slug = subarray-sum-equals-k
code =

 class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val hashMap = HashMap<Int, Int>()
        var ans = 0
        var sum = 0

        nums.forEach() {
            sum += it

            if (sum == k)
                ++ans

            ans += hashMap.getOrDefault(sum - k, 0)
            hashMap[sum] = hashMap.getOrDefault(sum, 0) + 1
        }
        return ans
    }
}
