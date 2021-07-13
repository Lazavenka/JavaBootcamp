package taskone;

public class CoinsCounter {
    public static void main(String[] args) {
        int[] a = {1, 0, 0, 1, 0 , 0, 1, 1};
        Solution solution = new Solution();
        int count = solution.solution(a);
        System.out.println(count);
    }

}
