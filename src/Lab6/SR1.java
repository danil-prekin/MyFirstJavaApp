package Lab6;

public class SR1 {
    private char symbolField;
    private String textField;

    public void setValues(char value) {
        symbolField = value;
    }

    public void setValues(String value) {
        textField = value;
    }

    public void setValues(char[] value) {
        if (value.length == 1) {
            symbolField = value[0];
        } else {
            textField = new String(value);
        }
    }

    public void displayData() {
        System.out.println("Символ: " + symbolField + ", Текст: " + textField);
    }
}

class Main_SR1 {
    public static void main(String[] args) {
        SR1 obj = new SR1();
        obj.setValues('A');
        obj.displayData();
        obj.setValues("Hello, world!");
        obj.displayData();
        obj.setValues(new char[]{'J', 'a', 'v', 'a'});
        obj.displayData();
    }
}