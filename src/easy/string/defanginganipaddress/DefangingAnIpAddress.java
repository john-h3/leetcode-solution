package easy.string.defanginganipaddress;

/**
 * DefangingAnIpAddress
 * 
 * @author john 2020/8/16
 */
public class DefangingAnIpAddress {
    class Solution {
        public String defangIPaddr(String address) {
            char[] chars = address.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char aChar : chars) {
                if (aChar == '.') {
                    builder.append("[.]");
                } else {
                    builder.append(aChar);
                }
            }
            return builder.toString();
        }
    }
}