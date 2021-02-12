package easy.depthfirstsearch.subdomainvisitcount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * SubdomainVisitCount
 *
 * @author john 2021/2/12
 */
public class SubdomainVisitCount {
  class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
      var map = new HashMap<String, Integer>();
      for (String cpdomain : cpdomains) {
        var strings = cpdomain.split(" ");
        var c = Integer.valueOf(strings[0]);
        var domain = strings[1];
        for (String s : splitDomain(domain)) {
          map.merge(s, c, Integer::sum);
        }
      }
      return map.keySet().stream().map(e -> map.get(e) + " " + e).collect(Collectors.toList());
    }

    private String[] splitDomain(String domain) {
      var splits = domain.split("\\.");
      var result = new String[splits.length];
      for (int i = splits.length - 1; i >= 0; i--) {
        if (i == splits.length - 1) result[i] = splits[i];
        else result[i] = splits[i] + "." + result[i + 1];
      }
      return result;
    }
  }

  public static void main(String[] args) {
    new SubdomainVisitCount().new Solution()
        .subdomainVisits(new String[] {"9001 discuss.leetcode.com"});
  }
}
