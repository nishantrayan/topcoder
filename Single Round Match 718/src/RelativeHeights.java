import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class RelativeHeights {

  public int countWays(int[] h) {
    Set<List<Integer>> signs = new HashSet<>();
    for (int i = 0; i < h.length; i++) {
      List<Integer> sign = new ArrayList<>();
      for (int j = 0; j < h.length; j++) {
        if (j == i) {
          continue;
        }
        int pos = 0;
        for (int k = 0; k < h.length; k++) {
          if (k == i) {
            continue;
          }
          if (h[k] > h[j]) {
            pos++;
          }
        }
        sign.add(pos);
      }
      signs.add(sign);
    }
    return signs.size();
  }
}
