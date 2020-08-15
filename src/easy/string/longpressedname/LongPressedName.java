package easy.string.longpressedname;

import java.util.ArrayList;
import java.util.List;

/**
 * LongPressedName
 *
 * @author john 2020/8/15
 */
public class LongPressedName {
    class Solution {
        public boolean isLongPressedName(String name, String typed) {
            if (name.length() > typed.length()) {
                return false;
            } else if (name.length() == typed.length()) {
                return name.equals(typed);
            }
            char[] nameChars = name.toCharArray();
            char[] typedChars = typed.toCharArray();
            int p = 0;
            char prevChar = ' ';
            for (int i = 0; i < nameChars.length; i++, p++) {
                if (p == typedChars.length) {
                    return false;
                }
                if (nameChars[i] == typedChars[p]) {
                    prevChar = nameChars[i];
                } else {
                    if (typedChars[p] != prevChar) {
                        return false;
                    }
                    while (typedChars[p] == prevChar) {
                        p++;
                        if (p == typedChars.length) {
                            return false;
                        }
                    }
                    if (nameChars[i] == typedChars[p]) {
                        prevChar = nameChars[i];
                    } else {
                        return false;
                    }
                }
            }
            for (int i = p; i < typedChars.length; i++) {
                if (typedChars[i] != prevChar) {
                    return false;
                }
            }
            return true;
        }
    }
}