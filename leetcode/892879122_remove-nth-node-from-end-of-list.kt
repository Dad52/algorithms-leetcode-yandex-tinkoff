id = 892879122 
lang = kotlin 
runtime  = 159 ms 
memory = 35 MB
title_slug = remove-nth-node-from-end-of-list
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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy = ListNode(-1)
        dummy.next = head

        var p: ListNode? = dummy
        var q: ListNode? = dummy

        for (i in 0..n)
            q = q?.next
        
        while (q != null) {
            p = p?.next
            q = q?.next
        }

        p?.next = p?.next?.next

        return dummy.next
    }
}