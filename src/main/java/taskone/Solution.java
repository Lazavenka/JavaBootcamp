package taskone;

import java.util.Arrays;

public class Solution {
    public int solution(int[] a) {
        if (a.length <= 1) {
            return 0;
        }
        int heads = (int) Arrays.stream(a).filter(i -> i == 0).count();
        return heads < a.length / 2 ? heads : a.length - heads;
    }
}
