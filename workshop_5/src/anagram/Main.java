package anagram;

public class Main {
    static boolean areAnagrams(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            boolean found = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not Anagram.");
                System.exit(1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];


        if (areAnagrams(str1, str2) && areAnagrams(str2, str1) && str1.length() == str2.length()) {
            System.out.println("Anagrams");
        }
        else
                System.out.println(("Not anagram"));
    }
}
