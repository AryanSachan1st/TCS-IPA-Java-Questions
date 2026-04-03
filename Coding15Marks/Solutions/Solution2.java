package Coding15Marks.Solutions;

import java.util.HashSet;

public class Solution2 {
    public static void main(String[] args) {
        String str = "experience";
        StringBuilder sb = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for (Character ch: str.toCharArray()) {
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
