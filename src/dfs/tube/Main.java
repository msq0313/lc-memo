package dfs.tube;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[][] tubesValue = new int[][]{
                {1, 2, 1, 2},
                {2, 1, 2, 1},
                {0, 0, 0, 0}
        };
        Solution solution = new Solution();
        ArrayList<LinkedList<Integer>> tubes = solution.transform(tubesValue);
        solution.dfs(tubes);
        for (Integer[] integers : solution.result) {
            System.out.printf("%d -> %d", integers[0], integers[1]);
        }
    }
}
