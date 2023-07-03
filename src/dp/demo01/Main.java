package dp.demo01;

import java.util.Arrays;

public class Main {
    public int[] generateFBNQ(int k) {
        int[] res = new int[k];
        if (k <= 0) {
            return res;
        }
        if (k == 1) {
            res[0] = 1;
            return res;
        }
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < k; i++) {
            res[i] = res[i - 2] + res[i - 1];
        }
        return res;
    }

    public int findFBNQ(int k) {
        if (k == 1 || k == 2) {
            return 1;
        }
        return findFBNQ(k - 1) + findFBNQ(k - 2);
    }

    public static void main(String[] args) {
        int[] resA = new Main().generateFBNQ(10);
        System.out.println(Arrays.toString(resA));
        int res = new Main().findFBNQ(10);
        System.out.println(res);
    }
}
