id = 888746910 
lang = kotlin 
runtime  = 195 ms 
memory = 35.2 MB
title_slug = merge-two-sorted-lists
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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var list1t = list1
        var list2t = list2
        var curr: ListNode? = ListNode(0)
        var result = curr

        while (list1t != null && list2t != null) {
            if (list1t?.`val` < list2t?.`val`) {
                curr?.next = ListNode(list1t.`val`)
                list1t = list1t?.next 
            } else {
                curr?.next = ListNode(list2t.`val`)
                list2t = list2t?.next
            }
            curr = curr?.next
        }

        println(list1t)

        while (list1t != null) {
            curr?.next = ListNode(list1t?.`val`)
            list1t = list1t?.next
            curr = curr?.next
        }

        while (list2t != null) {
            curr?.next = ListNode(list2t?.`val`)
            list2t = list2t?.next
            curr = curr?.next
        }

        return result?.next
    }
}

