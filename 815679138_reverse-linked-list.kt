id = 815679138 
lang = kotlin 
runtime  = 277 ms 
memory = 35.8 MB
title_slug = reverse-linked-list
code =

 /**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        
        var prev: ListNode? = null
        var curr: ListNode? = head
        
        while (curr != null) {
            val temp = curr.next
            curr.next = prev
            prev = curr
            curr = temp
        }
        
        return prev
    }
}