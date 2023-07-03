package dp.pkgProblem.demo01;

public class Main {
    // f(W)表示能装的最大价值 f(W)=max( f(W-wt[0])+val[0],...,f(W-wt[len-1])+val[len-1] )
    // f(1) = 2 f(2) = 4
    // f(W,list)表示W容量、可选择物品为list时，的最大价值  f(W,list)=max( f(W-list[0].wt,list.remove(0))+val[0] , ... , f(W-list[N].wt,list.remove(N))+val[N] )
    /*
    0-1背包中，dp[i][w]表示可选项为0-i，背包剩余容量为w时，可装的最大价值
    例如总容量为5，可选项为1,2,5时，dp数组为
      = 1 2 3 4 5
    = 0 0 0 0 0 0
    1 0 1 1 1 1 1
    2 0 1 2 3 3 3
    5 0 1 2 3 3 5
     */
}
