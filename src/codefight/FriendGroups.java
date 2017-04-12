package codefight;

import java.util.*;

/**
 * Created by jhonatan.zambrano on 12/19/16.
 */
public class FriendGroups {

    public static void main(String[] args) {
        friendGroups(5, new int[][]{{2, 3}, {4, 3}, {2, 4}});
    }

    static int friendGroups(int n, int[][] friends) {

        Map<Integer, List<Integer>> groups = new HashMap<>();

        for (int i = 0; i < friends.length; i++) {
            List<Integer> first = groups.get(friends[i][0]);
            List<Integer> second = groups.get(friends[i][1]);

            if ((first == null && second == null) || first.size() >= second.size()) {
                if (first != null && !first.contains(friends[i][1]))
                    groups.get(friends[i][0]).add(friends[i][1]);
                else
                    groups.put(friends[i][0], Arrays.asList(friends[i][1]));
            } else {
                if (second != null && !second.contains(friends[i][1]))
                    groups.get(friends[i][1]).add(friends[i][1]);
                else
                    groups.put(friends[i][0], Arrays.asList(friends[i][1]));
            }
        }

        System.out.print(groups);

        return 0;
    }

}
