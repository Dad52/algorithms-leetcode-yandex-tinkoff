id = 894880977 
lang = kotlin 
runtime  = 152 ms 
memory = 33.8 MB
title_slug = minimum-recolors-to-get-k-consecutive-black-blocks
code =

 class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var (l, r) = 0 to k
        var curr = 0
        var ans = 0

        if (blocks.length < k) return 0

        for (i in 0 until r) {
            if (blocks[i] == 'W') curr++
        }

        ans = curr

        while (r < blocks.length) {
            if (blocks[l++] == 'W')
                curr--
            if (blocks[r++] == 'W')
                curr++

            ans = Math.min(curr, ans)
        }

        return ans
    }
}