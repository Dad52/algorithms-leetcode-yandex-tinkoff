id = 689746070 
lang = kotlin 
runtime  = 181 ms 
memory = 38.4 MB
title_slug = richest-customer-wealth
code =

 class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        
        
        var maxWealth = 0

        accounts.forEach{ acc ->
            var currWealth = 0
            acc.forEach { money -> 
                currWealth += money
            }
            if (currWealth > maxWealth) maxWealth = currWealth
        } 

        return maxWealth
        
    }
}