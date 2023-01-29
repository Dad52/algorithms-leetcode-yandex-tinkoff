id = 691654936 
lang = kotlin 
runtime  = 198 ms 
memory = 37.3 MB
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
    fun maxDepth(root: TreeNode?): Int = when(root){
        null -> 0
        else -> 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
    }
}