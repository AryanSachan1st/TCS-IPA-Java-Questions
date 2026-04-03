package Coding15Marks.Solutions;

public class Solution1 {
    public static void main(String[] args) {
        String str = "DataBaSe";
        int lowerCount = 0, len = str.length();

        for (int i = 0; i < len; i++) {
            Character currChar = str.charAt(i);

            if (currChar >= 'a' && currChar <= 'z') { // more efficient
                lowerCount++;
            }
        }

        System.out.println(lowerCount);
    }
}
