public class Main {
    // main - точка входа в программу
    public static void main(String[] args) {
        System.out.println("helo java");

    }
}

class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            prod = prod * digit; // prod *= digit;
            sum = sum + digit; // sum += digit;

            n = n / 10; // n/= 10;
        }
        return prod - sum;
    }
}