import java.util.*;
import java.math.*;

import static java.lang.Math.*;


public class grafixMask {

  public int[] sortedAreas(String[] rectangles) {
    boolean[][] rects = new boolean[400][600];
    for (int i = 0; i < rectangles.length; i++) {
      Integer[] coords = Arrays.stream(rectangles[i].split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
      for (int j = coords[0]; j < coords[2]; j++) {
        for (int k = coords[1]; k < coords[3]; k++) {
          rects[j][k] = true;
        }
      }
    }

    List<Integer> areaList = new ArrayList<>();
    for (int i = 0; i < rects.length; i++) {
      for (int j = 0; j < rects[i].length; j++) {
        if (!rects[i][j]) {
          int area = findArea(rects, i, j);
          areaList.add(area);
        }
      }
    }
    int[] arr = new int[areaList.size()];
    for (int i = 0; i < areaList.size(); i++) {
      arr[i] = areaList.get(i);
    }
    return arr;
  }

  private int findArea(boolean[][] rects, int i, int j) {
    rects[i][j] = true;
    int newArea = 0;
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    for (int k = 0; k < dirs.length; k++) {
      if (i + dirs[k][0] >= 0 && i + dirs[k][0] < rects.length && j + dirs[k][1] >= 0
          && j + dirs[k][1] < rects[0].length) {
        if (!rects[i + dirs[k][0]][j + dirs[k][1]]) {
          newArea += findArea(rects, i + dirs[k][0], j + dirs[k][1]);
        }
      }
    }
    return newArea + 1;
  }
}
