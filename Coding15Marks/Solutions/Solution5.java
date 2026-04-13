package Coding15Marks.Solutions;

import java.util.HashSet;

public class Solution5 {
    public static void main(String[] args) {
        String sentence = "hello I am a student";
        HashSet<Character> vowelsSet = new HashSet<>();

        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');

        StringBuilder sb = new StringBuilder();

        String[] arr = sentence.split(" ");

        for (String str: arr) {
            if (vowelsSet.contains(Character.toLowerCase(str.charAt(0)))) {
                sb.append(str.charAt(0));
            }
        }

        System.out.println(sb.toString());
    }
}
