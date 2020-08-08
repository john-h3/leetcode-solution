package easy.array.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * ValidParentheses
 *
 * @author john 2020/8/8
 */
public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {
            char[] map = new char[0x7f];
            map[')'] = '(';
            map['}'] = '{';
            map[']'] = '[';
            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case '(':
                    case '{':
                    case '[':
                        stack.push(s.charAt(i));
                        break;
                    case ')':
                    case '}':
                    case ']':
                        if (stack.isEmpty() || stack.pop() != map[s.charAt(i)]) {
                            return false;
                        }
                        break;
                    default:
                }
            }
            return stack.isEmpty();
        }
    }
}