package daily._20220824

class Solution {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        var map = mutableMapOf<Int, Int>()
        for (i in target) {
            var c = map[i]
            if (c == null) map[i] = 1
            else {
                map[i] = c + 1
            }
        }
        for (i in arr) {
            var c = map[i]
            if (c == null) {
                return false
            } else if (c == 1) {
                map.remove(i)
            } else {
                map[i] = c - 1
            }
        }
        return map.isEmpty()
    }
}
