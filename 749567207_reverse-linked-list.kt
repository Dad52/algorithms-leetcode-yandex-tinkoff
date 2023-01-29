id = 749567207 
lang = kotlin 
runtime  = 355 ms 
memory = 36.5 MB
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
        var curr: ListNode? = head //first node
        
        while (curr != null) {
            val tempNext = curr.next
            curr.next = prev
            prev = curr
            curr = tempNext
        }
        return prev
    }
}