package codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jhonatan.zambrano on 1/2/17.
 */
public class AsanaBot_R1 {

  public static void main(String[] args) {
    int[] dimensions = new int[] {135, 9, 1};
    String[] tasks = new String[] {"Task 1",
        "Task 2",
        "Task 3",
        "Very Important Task",
        "Not So Important Task",
        "Yet Another Task",
        "The last task"};
    int[][] mouseCoordinates = new int[][] {{132, 42}, {35, 13}};
        /*
        int[] dimensions = new int[] {1000500, 5, 1};
        String[] tasks = new String[] {"singletask"};
        int[][] mouseCoordinates = new int[][] {{100, 4}, {300, 4}};
        */
    System.out.println(Arrays.toString(multiSelection(dimensions, tasks, mouseCoordinates)));
  }

  static String[] multiSelection(int[] dimensions, String[] tasks, int[][] mouseCoordinates) {
    List<String> r = new ArrayList<>();
    for (int i = 0; i < tasks.length; i++) {
      int start = i * (dimensions[1] + dimensions[2]);
      int end = (i * (dimensions[1] + dimensions[2])) + dimensions[1];

      if (mouseCoordinates[0][1] > mouseCoordinates[1][1]) {
        if ((mouseCoordinates[0][1] >= start && mouseCoordinates[1][1] <= start) ||
            (mouseCoordinates[0][1] >= end) && mouseCoordinates[1][1] <= end) {
          r.add(tasks[i]);
        }
      } else {
        if ((mouseCoordinates[1][1] >= start && mouseCoordinates[0][1] <= start) ||
            (mouseCoordinates[1][1] >= end) && mouseCoordinates[0][1] <= end) {
          r.add(tasks[i]);
        }
      }

      if (start <= mouseCoordinates[0][1]
          && end >= mouseCoordinates[0][1]
          && start <= mouseCoordinates[1][1]
          && end >= mouseCoordinates[1][1]) {
        r.add(tasks[i]);
      }
    }
    return r.toArray(new String[0]);
  }
}
