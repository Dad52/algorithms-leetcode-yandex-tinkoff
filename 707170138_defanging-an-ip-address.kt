id = 707170138 
lang = kotlin 
runtime  = 185 ms 
memory = 36.6 MB
title_slug = defanging-an-ip-address
code =

 class Solution {
    fun defangIPaddr(address: String): String {
        return address.replace(".", "[.]")
    }
}