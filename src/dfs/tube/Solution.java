package dfs.tube;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Solution {
    public static final int elementNum = 4;

    // 结果 即操作步骤 [0] -> [1]
    public LinkedList<Integer[]> result = new LinkedList<>();

    // 检查是否为完成状态
    public boolean checkFinish(ArrayList<LinkedList<Integer>> tubes) {
        for (LinkedList<Integer> tube : tubes) {
            if (tube.size() == 0) {
                // 空试管跳过
                continue;
            }
            if (tube.size() != elementNum) {
                // 试管不空也不满 未完成
                return false;
            }
            if (getColorNum(tube) > 1) {
                // 试管元素颜色数>1 未完成
                return false;
            }
        }
        return true;
    }

    // 获取a与b的倒入关系 -1不可以 1表示可以a to b 2表示可以b to a 3表示都可以
    public int getOperation(LinkedList<Integer> a, LinkedList<Integer> b) {
        if (a.size() == 0 && b.size() == 0) {
            // 两个空试管，不可操作
            return -1;
        }
        if (getColorNum(a) == 1 && b.size() == 0 || getColorNum(b) == 1 && a.size() == 0) {
            // 一个纯色试管，一个空试管，不可操作
            return -1;
        }
        if (a.size() == 0 && b.size() != 0) {
            // a为空试管 b不为空试管且不为纯色 可以b to a
            return 2;
        }
        if (a.size() != 0 && b.size() == 0) {
            // b为空试管 a不为空试管且不为纯色 可以a to b
            return 1;
        }
        if (a.size() != 0 && b.size() != 0) {
            // a b 都不为空试管
            if (!a.get(0).equals(b.get(0))) {
                // a b 顶层颜色不一样 不可操作
                return -1;
            }
            // a顶部同色元素数
            int aTopNum = 1;
            // b顶部同色元素数
            int bTopNum = 1;
            for (int i = 1; i < a.size(); i++) {
                if (a.get(i).equals(a.get(i - 1))) {
                    aTopNum++;
                } else {
                    break;
                }
            }
            for (int i = 1; i < b.size(); i++) {
                if (b.get(i).equals(b.get(i - 1))) {
                    bTopNum++;
                } else {
                    break;
                }
            }
            if (a.size() + bTopNum <= elementNum && b.size() + aTopNum <= elementNum) {
                // 可以互相倒入
                return 3;
            } else if (a.size() + bTopNum > elementNum && b.size() + aTopNum <= elementNum) {
                // 只能 a to b
                return 1;
            } else if (a.size() + bTopNum <= elementNum && b.size() + aTopNum > elementNum) {
                // 只能 b to a
                return 2;
            } else {
                return -1;
            }
        }
        return -1;
    }

    public int getColorNum(LinkedList<Integer> tube) {
        Set<Integer> set = new HashSet<>(tube);
        return set.size();
    }

    // a向b倒入
    public int aTob(LinkedList<Integer> a, LinkedList<Integer> b) {
        if (a.size() == 0) {
            return 0;
        }
        int changeVal = 0;
        Integer topColor = a.getFirst();
        while (a.size() > 0 && a.getFirst().equals(topColor)) {
            b.addFirst(a.getFirst());
            a.removeFirst();
            changeVal++;
        }
        return changeVal;
    }

    // 用于回溯失败后恢复，由于此时顶层颜色不同，强制倒回
    public void recover(LinkedList<Integer> a, LinkedList<Integer> b, int changeVal) {
        for (int i = 0; i < changeVal; i++) {
            b.addFirst(a.getFirst());
            a.removeFirst();
        }
    }

    public void dfs(ArrayList<LinkedList<Integer>> tubes) {
        if (checkFinish(tubes)) {
            return;
        }
        ArrayList<Integer[]> canExchange = new ArrayList<>();
        for (int i = 0; i < tubes.size() - 1; i++) {
            for (int j = i + 1; j < tubes.size(); j++) {
                if (getOperation(tubes.get(i), tubes.get(j)) == 1) {
                    canExchange.add(new Integer[]{i, j});
                }
                if (getOperation(tubes.get(i), tubes.get(j)) == 2) {
                    canExchange.add(new Integer[]{j, i});
                }
                if (getOperation(tubes.get(i), tubes.get(j)) == 3) {
                    canExchange.add(new Integer[]{i, j});
                    canExchange.add(new Integer[]{j, i});
                }
            }
        }
        for (Integer[] integers : canExchange) {
            result.addLast(integers);
            int changeVal = aTob(tubes.get(integers[0]), tubes.get(integers[1]));
            dfs(tubes);
            if (checkFinish(tubes)) {
                return;
            }
            recover(tubes.get(integers[1]), tubes.get(integers[0]), changeVal);
            result.removeLast();
        }
    }

    public ArrayList<LinkedList<Integer>> transform(int[][] tubesValue) {
        ArrayList<LinkedList<Integer>> tubes = new ArrayList<>();
        for (int[] ints : tubesValue) {
            LinkedList<Integer> ll = new LinkedList<>();
            for (int anInt : ints) {
                if (anInt != 0) {
                    ll.offer(anInt);
                }
            }
            tubes.add(ll);
        }
        return tubes;
    }
}
