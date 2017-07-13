import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class InterleavingParenthesisDiv2 {

  int[][] openSoFar = new int[51][51];
  int[][] memo = new int[51][51];
  long POW = (long) (Math.pow(10, 9) + 7);

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
      for (int j = 0; j < memo[i].length; j++) {
        memo[i][j] = -1;
      }
    }
    return count(s1, s2, 0, 0);
  }

  public int count(String s1, String s2, int index1, int index2) {
    if (memo[index1][index2] != -1) {
      return memo[index1][index2];
    }
    if (index1 >= s1.length() && index2 >= s2.length() && openSoFar[s1.length()][s2.length()] == 0) {
      return 1;
    }
    long c = 0;
    if (index1 < s1.length() && ((s1.charAt(index1) == ')' && openSoFar[index1 + 1][index2] >= 0)
        || s1.charAt(index1) == '(')) {
      c += count(s1, s2, index1 + 1, index2);
    }
    if (index2 < s2.length() && ((s2.charAt(index2) == ')' && openSoFar[index1][index2 + 1] >= 0)
        || s2.charAt(index2) == '(')) {
      c += count(s1, s2, index1, index2 + 1);
    }
    return memo[index1][index2] = (int)(c % POW);
  }
}
