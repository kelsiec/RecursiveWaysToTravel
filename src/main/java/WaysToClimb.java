import java.util.ArrayList;
import java.util.List;

public class WaysToClimb {
    private static void waysToClimb(int numStairs) {
        waysToClimbHelper(new ArrayList<>(), numStairs);
    }

    private static void waysToClimbHelper(List<Integer> path, int numStairs) {
        if (numStairs >= 2) {
            List<Integer> path2 = new ArrayList<>(path);
            path2.add(2);
            waysToClimbHelper(path2, numStairs - 2);
        }

        if (numStairs >= 1) {
            List<Integer> path1 = new ArrayList<>(path);
            path1.add(1);
            waysToClimbHelper(path1, numStairs - 1);
        }

        if (numStairs == 0 && path.size() > 0) {
            System.out.println(path);
        }
    }

    public static void main(String[] args) {
        waysToClimb(4);
    }
}
