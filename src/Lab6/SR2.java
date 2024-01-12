package Lab6;

public class SR2 {
    private static int staticField = 0;

    public static void displayAndIncrement() {
        System.out.println(staticField);
        staticField++;
    }
}
class Main_SR2 {
    public static void main(String[] args) {
        SR2.displayAndIncrement();
        SR2.displayAndIncrement();
    }
}
