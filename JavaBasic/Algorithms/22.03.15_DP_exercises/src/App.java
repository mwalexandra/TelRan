
public class App {
    public static void main(String[] args) {

    }

    public int knapsack(int V, int[] v, int[] p) {

        int[] v0 = new int[v.length + 1];
        int[] p0 = new int[p.length + 1];

        for (int i = 0; i < v.length; i++) {
            v0[i + 1] = v[i];
            p0[i + 1] = p[i];
        }

        int[][] res = new int[V + 1][v0.length];

        for (int i = 0; i < res.length; i++) {

            for (int j = 1; j < res[i].length; j++) {
                res[i][j] = res[i][j - 1];

                if (i >= v0[j]) {
                    int possibleRes = res[i - v0[j]][j - 1] + p0[j];

                    if (possibleRes > res[i][j])
                        res[i][j] = possibleRes;
                }
            }
        }
        return res[V][v0.length - 1];
    }

    public int knapsackRepeat(int V, int[] v, int[] p) {
        int[] res = new int[V + 1];

        for (int i = 1; i <= V; i++) {

            for (int j = 0; j < v.length; j++) {
                if (i >= v[j]) {
                    int possibleRes = res[i - v[j]] + p[j];

                    if (possibleRes > res[i])
                        res[i] = possibleRes;
                }
            }
        }
        return res[V];
    }
}
