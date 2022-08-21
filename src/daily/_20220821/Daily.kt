package daily._20220821

class Daily {
    class Solution {
        fun isPrefixOfWord(sentence: String, searchWord: String): Int {
            var matches = 0
            var c = 1
            var prefix = true
            for (i in sentence.indices) {
                if (sentence[i] == ' ') {
                    matches = 0
                    c ++
                    prefix = true
                    continue
                }
                if (!prefix) {
                    continue
                }
                if (sentence[i] != searchWord[matches++]) {
                    matches = 0
                    prefix = false
                    continue
                }
                if (matches == searchWord.length) {
                    return c
                }
            }
            return -1
        }
    }
}
