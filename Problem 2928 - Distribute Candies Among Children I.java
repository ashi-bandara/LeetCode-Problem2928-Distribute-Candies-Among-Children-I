import java.util.ArrayList;
import java.util.List;

class Solution {
    public int distributeCandies(int n, int limit) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= limit && i <= n; i++) {
            for (int j = 0; j <= limit  && i + j <= n; j++) {
                int k = n - i - j;
                if (k >= 0 && k <= limit) {
                    list.add(i);
                    list.add(j);
                    list.add(k);
                }
            }
        }

        return list.size()/3;
    }
}