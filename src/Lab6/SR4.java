package Lab6;

public class SR4 {
        public static int doubleFactorial(int n) {
            if (n <= 0) {
                return 1;
            } else {
                return n * doubleFactorial(n - 2);
            }
        }
    }

 class Main_SR4 {
    public static void main(String[] args) {
        int n = 6;
        int doubleFactorial = SR4.doubleFactorial(n);
        System.out.println(n + "!! = " + doubleFactorial);
    }
}