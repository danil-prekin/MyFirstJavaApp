package Lab3.SR8;

public class SR8 {
    public static void main(String[] args) {
        char[] alphabet = new char[10];
        char letter = 'A';
        for (int i = 0; i < alphabet.length; i++) {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                letter++;
            }
            alphabet[i] = letter;
            letter++;
        }

        System.out.print("Массив в прямом порядке: ");
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();

    }
}
