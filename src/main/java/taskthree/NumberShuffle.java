package taskthree;

public class NumberShuffle {
    public static void main(String[] args) {
        int ini = 123456;
        Solution solution = new Solution();
        solution.solution(ini);
        System.out.println(solution.solution(ini));
        ini = 130;
        System.out.println(solution.solution(ini));
        ini = 123_456_789;
        System.out.println(solution.solution(ini));
        ini = 4567;
        System.out.println(solution.solution(ini));
    }
}
