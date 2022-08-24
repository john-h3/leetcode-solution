package random._20220824

import java.util.*

class KthLargest(k: Int, nums: IntArray) {
    private val queue: PriorityQueue<Int>
    private val k: Int

    init {
        queue = PriorityQueue<Int>(k)
        this.k = k
        for (num in nums) {
            add(num)
        }
    }

    fun add(`val`: Int): Int {
        if (queue.size < k) {
            queue.add(`val`)
            return queue.first()
        } else {
            if (`val` > queue.first()) {
                queue.remove(queue.first())
                queue.add(`val`)
            }
            return queue.first()
        }
    }
}