package Lab5;

class Main_SR1 {
    public static void main(String[] args) {
        SR1 symbolInstance = new SR1();

        symbolInstance.setSymbol('A');
        int code = symbolInstance.getSymbolCode();
        System.out.println("Код символа: " + code);

        symbolInstance.printSymbolAndCode();
    }
}
