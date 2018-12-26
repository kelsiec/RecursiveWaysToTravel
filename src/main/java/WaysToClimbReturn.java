import java.util.ArrayList;
import java.util.List;

public class WaysToClimbReturn {
    private static void waysToClimb(int numStairs) {
        List<List<Integer>> paths = waysToClimbHelper(new ArrayList<>(), numStairs);

        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }

    private static List<List<Integer>> waysToClimbHelper(List<Integer> path, int numStairs) {
        List<List<Integer>> paths = new ArrayList<>();

        if (numStairs >= 2) {
            List<Integer> path2 = new ArrayList<>(path);
            path2.add(2);
            paths.addAll(waysToClimbHelper(path2, numStairs - 2));
        }

        if (numStairs >= 1) {
            List<Integer> path1 = new ArrayList<>(path);
            path1.add(1);
            paths.addAll(waysToClimbHelper(path1, numStairs - 1));
        }

        if (numStairs == 0 && path.size() > 0) {
            paths.add(path);
        }

        return paths;
    }

    public static void main(String[] args) {
        waysToClimb(4);
    }
}
