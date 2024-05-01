public class SubClass2 extends SuperClass1 {
    public char field2;

    public SubClass2(int field1, char field2) {
        super(field1);
        this.field2 = field2;
    }

    public void setField1(int field1) {
        super.setField1(field1);
    }

    public void setField2(char field2) {
        this.field2 = field2;
    }

    public void setField1AndField2(int field1) {
        setField1(field1);
    }

    public void setField1AndField2(int field1, char field2) {
        setField1(field1);
        setField2(field2);
    }

    @Override
    public String toString() {
        return "SubClass2: " + super.toString() + ", field2=" + field2;
    }
}
