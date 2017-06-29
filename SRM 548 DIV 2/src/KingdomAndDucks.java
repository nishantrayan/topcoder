import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class KingdomAndDucks {

  public int minDucks(int[] duckTypes) {
    int[] seen = new int[51];
    int seenCount = 0;
    int max = 0;
    for (int i = 0; i < duckTypes.length; i++) {
      seen[duckTypes[i]]++;
      max = Math.max(seen[duckTypes[i]], max);
      if (seen[duckTypes[i]] == 1) {
        seenCount++;
      }
    }
    return max * seenCount;
  }
}
