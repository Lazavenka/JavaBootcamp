package tasktwo;

public class Solution {
    public int solution(String s){
        String[] sentences = s.split("[.!?]");
        int maxWordsCount = 0;
        for (String sentence: sentences) {
            String[] words = sentence.strip().split(" ");
            if (maxWordsCount < words.length){
                maxWordsCount = words.length;
            }
        }
        return maxWordsCount;
    }
}
