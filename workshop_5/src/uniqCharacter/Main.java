package uniqCharacter;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static boolean hasUniqueCharacters(String str) {
        Set<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (hasUniqueCharacters(input)) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string has duplicate characters.");
        }
    }
}
