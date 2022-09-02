package daily._202208._20220820

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun constructMaximumBinaryTree(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) return null
        return recursiveConstruct(nums, 0, nums.size)
    }

    fun recursiveConstruct(nums: IntArray, start: Int, end: Int): TreeNode {
        var max = nums[start]
        var maxIndex = start
        for (i in start until end) {
            if (nums[i] > max) {
                max = nums[i]
                maxIndex = i
            }
        }
        val node = TreeNode(max)
        if (maxIndex > start) {
            node.left = recursiveConstruct(nums, start, maxIndex)
        }
        if (maxIndex < end - 1) {
            node.right = recursiveConstruct(nums, maxIndex + 1, end)
        }
        return node
    }
}
