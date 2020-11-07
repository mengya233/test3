package wangfei;
import static wangfei.Chuli.inRange;

public class Tax {
    public static class TaxManager {
        final static float[] taxValues = {0.03f, 0.1f, 0.2f, 0.25f, 0.3f, 0.35f, 0.45f};
        final static int[][] rules = {{0, 3000}, {3000, 12000}, {12000, 25000}, {25000, 35000}, {35000, 55000}, {55000, 80000}, {80000, -1}};
        public static float getTax(float income) {
            return taxValues[getLevel(income)] * income;
        }
        public static int getLevel(float revenues) {
            for (int i = 0; i < rules.length; i++) {
                if (inRange(revenues, rules[i][0], rules[i][1])) return i;
            }
            return rules.length - 1;
        }
    }
}