package Coding15Marks.Solutions;

public class Solution7 {
    public static void main(String[] args) {
        String sentence = "I work in TCS as a system engineer";
        String[] words = sentence.split(" ");

        int maxLen = Integer.MIN_VALUE;
        String maxWord = "";

        for (String word: words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
                maxWord = word;
            }
        }

        System.out.println(maxWord);
    }
}
