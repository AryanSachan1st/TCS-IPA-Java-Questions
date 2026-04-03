package Coding15Marks.Solutions;

public class Solution3 {
    public static void main(String[] args) {
        String sentence = "Hello there Welcome back to my channel";

        int len = sentence.length();
        int spaces = 0;

        for (int i=0; i<len; i++) {
            if (sentence.charAt(i) == ' ') {
                spaces++;
            }
        }

        int chars = len - spaces;

        System.out.println("Num of Spaces: " + spaces);
        System.out.println("Num of Characters: " + chars);
    }
}
