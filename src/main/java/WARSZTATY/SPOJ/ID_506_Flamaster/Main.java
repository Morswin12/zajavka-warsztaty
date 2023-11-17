package WARSZTATY.SPOJ.ID_506_Flamaster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();

        for (int i = 0; i < C; i++) {
            String word = scanner.next();

            String compressedWord = compressWord(word);

            System.out.println(compressedWord);
        }
    }

    private static String compressWord(String word) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(word.charAt(i));
                if (count == 2) {
                    compressed.append(word.charAt(i));
                }
                if (count > 2) {
                    compressed.append(count);
                }

                count = 1;
            }
        }

        compressed.append(word.charAt(word.length() - 1));
        if (count == 2) {
            compressed.append(word.charAt(word.length() - 1));
        }
        if (count > 2) {
            compressed.append(count);
        }

        return compressed.toString();
    }
}
