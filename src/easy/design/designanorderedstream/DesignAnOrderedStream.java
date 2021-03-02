package easy.design.designanorderedstream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * DesignAnOrderedStream
 *
 * @author john 2021/3/2
 */
public class DesignAnOrderedStream {
  class OrderedStream {
    private String[] arr;
    private int ptr = 1;

    public OrderedStream(int n) {
      arr = new String[n + 1];
    }

    public List<String> insert(int idKey, String value) {
      arr[idKey] = value;
      if (idKey == ptr) {
        var c = 0;
        for (int i = ptr; i < arr.length; i++) {
          if (arr[i] != null) {
            c++;
          }
          else break;
        }
        ptr += c;
        return Arrays.asList(Arrays.copyOfRange(arr, idKey, ptr));
      } else return Collections.emptyList();
    }
  }
}