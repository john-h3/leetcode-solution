package easy.stack.crawlerlogfolder;

/**
 * CrawlerLogFolder
 *
 * @author john 2021/3/5
 */
public class CrawlerLogFolder {
  class Solution {
    public int minOperations(String[] logs) {
      var depth = 0;
      for (String log : logs) {
        depth += switch (log) {
          case "../" -> depth > 0 ? -1 : 0;
          case "./" -> 0;
          default -> 1;
        };
      }
      return depth;
    }
  }
}