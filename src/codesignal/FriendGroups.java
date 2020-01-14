package codesignal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FriendGroups {

  public static void main(final String[] args) {
    friendGroups(5, new int[][] { { 2, 3 }, { 4, 3 }, { 2, 4 } });
  }

  static int friendGroups(final int n, final int[][] friends) {

    final Map<Integer, List<Integer>> groups = new HashMap<>();

    for (int i = 0; i < friends.length; i++) {
      final List<Integer> first = groups.get(friends[i][0]);
      final List<Integer> second = groups.get(friends[i][1]);

      if ((first == null && second == null) || first.size() >= second.size()) {
          if (first != null && !first.contains(friends[i][1])) {
              groups.get(friends[i][0]).add(friends[i][1]);
          } else {
              groups.put(friends[i][0], Arrays.asList(friends[i][1]));
          }
      } else {
          if (second != null && !second.contains(friends[i][1])) {
              groups.get(friends[i][1]).add(friends[i][1]);
          } else {
              groups.put(friends[i][0], Arrays.asList(friends[i][1]));
          }
      }
    }

    System.out.print(groups);

    return 0;
  }
}
