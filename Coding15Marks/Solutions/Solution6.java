package Coding15Marks.Solutions;

public class Solution6 {
    public static void main(String[] args) {
        int n = 36;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            n /= 10;

            sum += digit;
        }

        if (sum % 3 == 0) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not Divisible by 3");
        }
    }
}
