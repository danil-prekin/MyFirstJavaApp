package Lab6;

public class SR6 {
    public static int[] getSubarray(int[] inputArray, int startIndex, int endIndex) {
        int[] result = new int[endIndex - startIndex + 1];
        System.arraycopy(inputArray, startIndex, result, 0, result.length);
        return result;
    }
}
class Main_SR6 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int startIndex = 2;
        int endIndex = 6;
        int[] result = SR6.getSubarray(inputArray, startIndex, endIndex);
        for (int value : result) {
            System.out.println(value);
        }
    }
}
