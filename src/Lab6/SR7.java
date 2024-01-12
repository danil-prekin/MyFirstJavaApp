package Lab6;

public class SR7 {
        public static int[] getCharCodes(char[] charArray) {
            int[] intArray = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = (int) charArray[i];
            }
            return intArray;
        }
    }
class Main_SR7{
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c'};
        int[] intArray = SR7.getCharCodes(charArray);
        for (int code : intArray) {
            System.out.println(code);
        }
    }
}