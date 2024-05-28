package Task1404;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encodedWord = scanner.nextLine();

        System.out.println(decodeWord(encodedWord));
    }

    public static String decodeWord(String encodedWord) {
        char[] letters = new char[encodedWord.length()];
        int[] numbers = new int[encodedWord.length()];

        // Шаг 1: Заменяем буквы на числа
        for (int i = 0; i < encodedWord.length(); i++) {
            letters[i] = encodedWord.charAt(i);
            numbers[i] = letters[i] - 'a';
        }

        // Шаг 2: Вычисляем исходные числа
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i > 0) {
                numbers[i] = (numbers[i] - numbers[i - 1] + 26) % 26;
            } else {
                numbers[i] = (numbers[i] - 5 + 26) % 26;
            }
        }

        // Шаг 3: Заменяем числа на буквы
        for (int i = 0; i < numbers.length; i++) {
            letters[i] = (char)('a' + numbers[i]);
        }

        return new String(letters);
    }
}
