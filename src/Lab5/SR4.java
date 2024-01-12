package Lab5;

public class SR4 {
        private char symbol;
        private int number;

        public SR4(char symbol, int number) {
            this.symbol = symbol;
            this.number = number;
        }

        public SR4(double number) {
            int wholePart = (int) number;
            double fractionPart = number % 1;
            this.symbol = (char) ('A' + wholePart);
            this.number = wholePart;
        }

        public void printData() {
            System.out.println("Символ: " + this.symbol);
            System.out.println("Код символа: " + this.number);
        }
    }
class Main_SR4 {
    public static void main(String[] args) {
        SR4 instance1 = new SR4('A', 65);
        instance1.printData();

        SR4 instance2 = new SR4(65.1267);
        instance2.printData();
    }
}
