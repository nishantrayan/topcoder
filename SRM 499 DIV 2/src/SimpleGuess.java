import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class SimpleGuess {

  public int getMaximum(int[] hints) {
    Arrays.sort(hints);
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < hints.length; i++) {
      for (int j = i + 1; j < hints.length; j++) {
        int x = (hints[i] + hints[j]) / 2;
        int y = hints[j] - x;
        if (x + y == hints[j] && x - y == hints[i]) {
          max = Math.max(max, x * y);
        }
      }
    }
    return max;
  }
}
