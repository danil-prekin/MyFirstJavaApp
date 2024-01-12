package Lab5;

public class SR5 {
    private int number;

    public SR5() {
        setNumber(0);
    }

    public SR5(int number) {
        setNumber(number);
    }

    public void setNumber(int number) {
        if (number > 100) {
            this.number = 100;
        } else {
            this.number = number;
        }
    }

    public int getNumber() {
        return this.number;
    }
}
class Main_SR5 {
    public static void main(String[] args) {
        SR5 myObject = new SR5();
        System.out.println(myObject.getNumber());

        myObject.setNumber(150);
        System.out.println(myObject.getNumber());

        myObject.setNumber(75);
        System.out.println(myObject.getNumber());
    }
}