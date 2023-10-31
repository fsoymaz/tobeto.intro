package fibonacci;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        System.out.println("First " + n + " Fibonacci numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
    }
}
