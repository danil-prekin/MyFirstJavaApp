package Lab5;

public class SR3 {
    private int number1;
    private int number2;

    public SR3() {
        this(0, 0);
    }

    public SR3(int number1) {
        this(number1, 0);
    }

    public SR3(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void printNumbers() {
        for (int i = Math.min(number1, number2); i <= Math.max(number1, number2); i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
class Main_SR3 {
    public static void main(String[] args) {
        SR3 numberInstance = new SR3();
        numberInstance.printNumbers();

        numberInstance = new SR3(1);
        numberInstance.printNumbers();

        numberInstance = new SR3(1, 100);
        numberInstance.printNumbers();
    }
}
