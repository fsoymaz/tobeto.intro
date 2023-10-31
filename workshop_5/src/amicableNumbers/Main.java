package amicableNumbers;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int num1 = 1;

        while (count < 2) {
            int num2 = findAmicableNumber(num1);

            if (num2 > num1 && findAmicableNumber(num2) == num1) {
                System.out.println((count + 1) + ": " + num1 + " - " + num2);
                count++;
            }

            num1++;
        }
    }

    public static int findAmicableNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
