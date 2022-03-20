
public class App {
    public static void main(String[] args) {

    }

    public int knapsack(int V, int[] v, int[] p) {
        if (V == 0 || v.length == 0)
            return 0;

        int[] v0 = new int[v.length + 1];
        int[] p0 = new int[p.length + 1];

        for (int i = 0; i < v.length; i++) {
            v0[i + 1] = v[i];
            p0[i + 1] = p[i];
        }

        int[][] res = new int[V + 1][v0.length];

        for (int i = 0; i < res.length; i++) {
            int tempV = 0;
            for (int j = 1; j < res[i].length; j++) {
                res[i][j] = res[i][j - 1];

                if (i > tempV + v0[j]) {
                    res[i][j] += p0[j];
                    tempV += v0[j];
                } else {
                    if (p0[j - 1] < p0[j]) {
                        res[i][j] += (p0[j] - p0[j - 1]);
                        tempV += (tempV - v0[j - 1] + v0[j]);
                    }
                }
            }
        }
        return res[V][p.length];
    }
}
