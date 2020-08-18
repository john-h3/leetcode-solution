package easy.string.checkifawordoccursasaprefixofanywordinasentence;

/**
 * CheckIfAWordOccursAsAPrefixOfAnyWordInASentence
 * 
 * @author john 2020/8/18
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    class Solution {
        public int isPrefixOfWord(String sentence, String searchWord) {
            String[] words = sentence.split(" ");
            boolean flag = false;
            int idx = 1;
            int length = searchWord.length();
            for (String word : words) {
                if (word.length() >= length) {
                    if (word.substring(0, length).equals(searchWord)) {
                        flag = true;
                        break;
                    }
                }
                idx++;
            }
            return flag ? idx : -1;
        }
    }
}