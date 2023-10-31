package perfectNumber;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        while (count < 10) {
            if (isPerfectNumber(num)) {
                System.out.println("Perfect number " + (count + 1) + ": " + num);
                count++;
            }

            num++;
        }
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
