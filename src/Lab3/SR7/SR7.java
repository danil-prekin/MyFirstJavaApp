package Lab3.SR7;

public class SR7 {
    public static void main(String[] args) {
        int size = 10;

        char[] alphabet = new char[size];
        char letter = 'a';
        for (int i = 0; i < size; i++) {
            alphabet[i] = letter;
            letter += 2;
        }

        System.out.print("Массив в прямом порядке: ");
        for (int i = 0; i < size; i++) {
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();

        System.out.print("Массив в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(alphabet[i] + " ");
        }
        System.out.println();
    }
}
