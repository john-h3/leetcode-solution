package easy.binarysearch.firstbadversion;

/**
 * FirstBadVersion
 *
 * @author john 2021/2/22
 */
public class FirstBadVersion {
  class VersionControl {
    boolean isBadVersion(int version) {
      return true;
    }
  }

  public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
      return binaryCheck(1, n);
    }

    private int binaryCheck(int start, int end) {
      if (start < end) {
        var mid = start + (end - start) / 2;
        if (isBadVersion(mid)) return binaryCheck(start, mid);
        else return binaryCheck(mid + 1, end);
      }
      return start;
    }
  }
}
