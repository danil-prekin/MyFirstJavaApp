package Lab5;
public class SR1 {
    private char symbol;

    public void setSymbol(char value) {
        this.symbol = value;
    }

    public int getSymbolCode() {
        return (int) this.symbol;
    }

    public void printSymbolAndCode() {
        System.out.println("Символ: " + this.symbol);
        System.out.println("Код символа: " + (int) this.symbol);
    }
}

