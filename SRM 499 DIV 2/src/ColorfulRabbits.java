import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class ColorfulRabbits {

  public int getMinimum(int[] replies) {
    Map<Integer, Integer> counts = new HashMap<>();
    int ans = 0;
    for (int i = 0; i < replies.length; i++) {
      Integer c = counts.get(replies[i]);
      if (c == null) {
        c = 0;
      }
      if (replies[i] == 0) {
        ans++;
      } else if ((c + 1) % (replies[i] + 1) == 1) {
        ans += replies[i] + 1;
      }
      counts.put(replies[i], c + 1);
    }
    return ans;
  }
}
