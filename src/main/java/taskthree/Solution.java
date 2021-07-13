package taskthree;

public class Solution {
    public int solution(int a){
        return shuffled(a);
    }

    private int shuffled(int a) {
        
        char[] digits = String.valueOf(a).toCharArray();
        char[] temp = new char[digits.length];
        for (int i = 0; i < digits.length; i+=2) {
            temp[i] = digits[i / 2];
            if (i+1 < digits.length) {
                temp[i + 1] = digits[digits.length - (i / 2) - 1];
            }
        }
        String s = String.copyValueOf(temp);
        return Integer.parseInt(s);
    }

}
