package daily._202208._20220826

/**
 * @author John.h3
 * created on 2022/8/26
 */

class Solution {
    fun maxProduct(nums: IntArray): Int {
        var m1 = nums[0]
        var m2: Int
        if (nums[1] > m1) {
            m1 = nums[1]
            m2 = nums[0]
        } else {
            m2 = nums[1]
        }
        for (i in 2 until nums.size) {
            if (nums[i] > m2) {
                if (nums[i] > m1) {
                    m2 = m1
                    m1 = nums[i]
                } else {
                    m2 = nums[i]
                }
            }
        }
        return (m1 - 1) * (m2 - 1)
    }
}