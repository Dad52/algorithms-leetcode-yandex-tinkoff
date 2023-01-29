id = 817351970 
lang = kotlin 
runtime  = 367 ms 
memory = 42.9 MB
title_slug = subtree-of-another-tree
code =

 /**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSubtree(s: TreeNode?, t: TreeNode?): Boolean {
        if(s == null) return false
        if(s?.`val` == t?.`val` && helper(s, t)) {
            return true
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t)
    }
    
    private fun helper(s: TreeNode?, t: TreeNode?): Boolean {
        if(s == null && t == null) return true
        if(s == null || t == null) return false
        return s.`val` == t.`val` && helper(s.left, t.left) && helper(s.right, t.right)
    }
}