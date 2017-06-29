import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class MultiplyXPlusOne {

  public int minimalSteps(int s, int t) {
    if (s == t) {
      return 0;
    }
    if (s > t) {
      return -1;
    }
    int c1 = minimalSteps(s * 2 + 1, t);
    int c2 = minimalSteps(s * 3 + 1, t);
    if (c1 == -1) {
      if(c2 == -1) return -1;
      return c2 + 1;
    }
    if (c2 == -1) {
      return c1 + 1;
    }
    return 1 + Math.min(c1, c2);
  }
}
