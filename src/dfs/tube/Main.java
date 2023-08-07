package dfs.tube;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        int[][] tubesValue = new int[][]{
//                {1, 2, 1, 2},
//                {2, 1, 2, 1},
//                {0, 0, 0, 0}
//        };
        int[][] tubesValue = new int[][]{
                {1, 2, 2, 3},
                {3, 1, 4, 5},
                {6, 5, 4, 7},
                {7, 8, 8, 3},
                {6, 1, 8, 4},
                {8, 3, 1, 6},
                {9, 9, 5, 4},
                {5, 7, 6, 9},
                {2, 7, 2, 9},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };
        Solution solution = new Solution();
        ArrayList<LinkedList<Integer>> tubes = solution.transform(tubesValue);
        solution.dfs(tubes);
        for (Integer[] integers : solution.result) {
            System.out.printf("%d -> %d\n", integers[0] + 1, integers[1] + 1);
        }
    }
}
