package Lab5;

public class SR2 {
    private char symbol1;
    private char symbol2;

    public SR2(char symbol1, char symbol2) {
        this.symbol1 = symbol1;
        this.symbol2 = symbol2;
    }

    public void printSymbolsBetween() {
        int start = Math.min((int) symbol1, (int) symbol2);
        int end = Math.max((int) symbol1, (int) symbol2);

        for (int i = start; i <= end; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
    }
}

class Main_SR2 {
    public static void main(String[] args) {
        SR2 symbolInstance = new SR2('A', 'P');
        symbolInstance.printSymbolsBetween();
    }
}