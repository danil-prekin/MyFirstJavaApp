package Lab5;

public class SR6 {
    private int max;
    private int min;

    public SR6() {
        setValues(0, 0);
    }

    public SR6(int value) {
        setValues(value, value);
    }

    public SR6(int max, int min) {
        setValues(max, min);
    }

    public void setValues(int value1, int value2) {
        if (value1 > value2) {
            this.max = value1;
            this.min = value2;
        } else {
            this.max = value2;
            this.min = value1;
        }
    }

    public void displayValues() {
        System.out.println("Максимальное значение: " + this.max);
        System.out.println("Минимальное значение: " + this.min);
    }
}
class Main {
    public static void main(String[] args) {
        SR6 myObject1 = new SR6();
        myObject1.displayValues();

        SR6 myObject2 = new SR6(5);
        myObject2.displayValues();

        SR6 myObject3 = new SR6(10, 5);
        myObject3.displayValues();

        myObject3.setValues(3, 8);
        myObject3.displayValues();
    }
}