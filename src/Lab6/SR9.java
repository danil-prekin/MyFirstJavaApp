package Lab6;

public class SR9 {
        public static void swapPairs(char[] array) {
            for (int i = 0; i < array.length / 2; i++) {
                char temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
    }

class Main_SR9 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        SR9.swapPairs(array);
        for (char value : array) {
            System.out.println(value);
        }
    }
}
