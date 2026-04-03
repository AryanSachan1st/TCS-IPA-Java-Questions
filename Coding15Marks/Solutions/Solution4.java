package Coding15Marks.Solutions;

public class Solution4 {
    public static void main(String[] args) {
        String sentence = "Hey3 there Java4 Learners";

        String[] arr = sentence.split(" ");
        StringBuilder output = new StringBuilder();

        for (String str: arr) {
            int len = str.length();

            if (!Character.isDigit(str.charAt(len-1))) {
                output.append(str.charAt(len-1));
            }
        }
        System.out.println(output.toString());
    }
}
