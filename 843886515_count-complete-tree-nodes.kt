id = 843886515 
lang = kotlin 
runtime  = 419 ms 
memory = 47.4 MB
title_slug = count-complete-tree-nodes
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
    fun countNodes(root: TreeNode?): Int {
        if (root == null)
            return 0
        return 1 + countNodes(root.left) + countNodes(root.right)
    }
}