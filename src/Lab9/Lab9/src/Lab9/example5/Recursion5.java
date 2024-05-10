package Lab9.example5;

public class Recursion5 {
    public static void main(String[] args) {
        System.out.println(fact(5, ""));
    }

    public static int fact(int n, String sequence) {
        System.out.println("Обход: " + sequence + " n=" + n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2, sequence + "L") + fact(n - 1, sequence + "R");
        }
    }
}
