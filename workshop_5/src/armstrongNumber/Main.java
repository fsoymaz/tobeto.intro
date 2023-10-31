package armstrongNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNum, remainder, result = 0, n = 0;
        originalNum = number;
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }
        originalNum = number;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += (int) Math.pow(remainder, n);
            originalNum /= 10;
        }

        if (number == result) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
