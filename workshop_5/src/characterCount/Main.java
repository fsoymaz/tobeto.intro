package characterCount;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Lütfen bir giriş metni sağlayın.");
            return;
        }

        String str = args[0].toLowerCase();
        System.out.println("Giriş metni: " + str);

        for (char c : str.toCharArray()) {
            int count = countOccurrences(str, c);
            if (count > 0) {
                System.out.println(c + ": " + count);
                str = str.replace(String.valueOf(c), "");
            }
        }
    }

    public static int countOccurrences(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }
}

