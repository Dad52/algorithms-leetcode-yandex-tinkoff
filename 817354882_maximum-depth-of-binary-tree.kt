id = 817354882 
lang = kotlin 
runtime  = 185 ms 
memory = 36.6 MB
title_slug = maximum-depth-of-binary-tree
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
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right))
    }
}