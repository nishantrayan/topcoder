import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class LexmaxReplace {

  public String get(String s, String t) {
    char[] tchars = t.toCharArray();
    Arrays.sort(tchars);
    int tIndex = tchars.length - 1;
    String ans = "";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (tIndex >= 0 && tchars[tIndex] > c) {
        ans += tchars[tIndex--];
      } else {
        ans += c;
      }
    }
    return ans;
  }
}