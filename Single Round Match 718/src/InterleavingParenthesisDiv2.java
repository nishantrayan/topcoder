import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class InterleavingParenthesisDiv2 {

  int[][] openSoFar = new int[51][51];
  int[][] memo = new int[51][51];
  int POW = (int) (Math.pow(10, 9) + 7);

  public int countWays(String s1, String s2) {
    for (int i = 0; i <= s1.length(); i++) {
      for (int j = 0; j <= s2.length(); j++) {
        if (i == 0 && j == 0) {
          openSoFar[i][j] = 0;
        } else {
          if (i == 0) {
            openSoFar[i][j] = openSoFar[0][j - 1] + (s2.charAt(j - 1) == ')' ? -1 : 1);
          } else if (j == 0) {
            openSoFar[i][j] = openSoFar[i - 1][0] + (s1.charAt(i - 1) == ')' ? -1 : 1);
          } else {
            openSoFar[i][j] =
                openSoFar[i - 1][j - 1] + (s1.charAt(i - 1) == ')' ? -1 : 1) + (s2.charAt(j - 1) == ')' ? -1 : 1);
          }
        }
      }
    }
    memo = new int[51][51];
    for (int i = 0; i < memo.length; i++) {
      Arrays.fill(memo[i], -1);
    }
    memo[s1.length()][s2.length()] = openSoFar[s1.length()][s2.length()] == 0 ? 1 : 0;
    return count(s1, s2, 0, 0);
  }

  private int count(String s1, String s2, int index1, int index2) {
    if (memo[index1][index2] != -1) {
      return memo[index1][index2];
    }
    int c = 0;
    if (index1 < s1.length() && openSoFar[index1 + 1][index2] >= 0) {
      c += count(s1, s2, index1 + 1, index2);
    }
    if (index2 < s2.length() && openSoFar[index1][index2 + 1] >= 0) {
      c += count(s1, s2, index1, index2 + 1);
    }
    return memo[index1][index2] = c % POW;
  }
}
