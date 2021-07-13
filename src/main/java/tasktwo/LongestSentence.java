package tasktwo;

public class LongestSentence {
    public static void main(String[] args) {
        String text = "We test coders. Give us a try?";
        String text2 = "Forget CVs..Save time . x x";
        Solution solution = new Solution();
        int maxWordsSentence = solution.solution(text);
        System.out.println(maxWordsSentence);
        maxWordsSentence = solution.solution(text2);
        System.out.println(maxWordsSentence);
    }
}
