import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class ConstructLCSEasy {

  public String construct(int ab, int bc, int ca) {
    String a = "", b = "", c = "";
    for (int i = 0; i < ca; i++) {
      a += "0";
    }
    for (int i = 0; i < ab; i++) {
      b += "0";
    }

    for (int i = ab; i < bc; i++) {
      b += "1";
    }
    for (int i = 0; i < ca; i++) {
      c += "0";
    }
    for (int i = ab; i < bc; i++) {
      c += "1";
    }
    return a + " " + b + " " + c;
  }
}
