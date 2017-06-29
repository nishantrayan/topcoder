import java.util.*;
import java.math.*;
import javax.swing.*;

import static java.lang.Math.*;


public class Permutiple {
  private List<String> list = new ArrayList<>();

  public String isPossible(int x) {
    int[] oldDigits = new int[10];
    int oldNum = x;
    while (oldNum > 0) {
      oldDigits[oldNum % 10]++;
      oldNum /= 10;
    }
    for (int i = 2; i < 10; i++) {
      int newNum = i * x;
      int[] digits = new int[10];
      while (newNum > 0) {
        digits[newNum % 10]++;
        newNum /= 10;
      }
      if (Arrays.equals(digits, oldDigits)) {
        return "Possible";
      }
    }
    return "Impossible";
  }
}
