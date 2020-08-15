package easy.string.uniqueemailaddresses;

import java.util.HashSet;
import java.util.Set;

/**
 * UniqueEmailAddresses
 * 
 * @author john 2020/8/15
 */
public class UniqueEmailAddresses {
    class Solution {
        private StringBuilder builder = new StringBuilder();

        public int numUniqueEmails(String[] emails) {
            Set<String> emailSet = new HashSet<>();
            for (String email : emails) {
                emailSet.add(simplify(email));
            }
            return emailSet.size();
        }

        private String simplify(String email) {
            int atIdx = email.indexOf('@');
            for (int i = 0; i < atIdx; i++) {
                char ch = email.charAt(i);
                if (ch == '+') {
                    break;
                } else if (ch != '.') {
                    builder.append(ch);
                }
            }
            for (int i = atIdx; i < email.length(); i++) {
                builder.append(email.charAt(i));
            }
            String simplifiedEmail = builder.toString();
            builder.delete(0, builder.length());
            return simplifiedEmail;
        }
    }
}