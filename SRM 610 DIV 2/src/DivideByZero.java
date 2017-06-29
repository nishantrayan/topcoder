import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class DivideByZero {
  boolean[] seen = new boolean[101];
  int count;

  public int CountNumbers(int[] numbers) {
    int count = numbers.length;
    for (int i = 0; i < numbers.length; i++) {
      seen[numbers[i]] = true;
    }

    for (int i = 1; i <= 100; i++) {
      if (!seen[i]) {
        countPossible(i);
      }
    }
    return count;
  }

  private boolean countPossible(int num) {
    if (seen[num]) {
      return true;
    } else {

    }
  }
}
