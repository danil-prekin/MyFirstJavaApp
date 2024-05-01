public class SubClass extends SuperClass {
    private int field2;

    public SubClass(int field2, String field1) {
        super(field1);
        this.field2 = field2;
    }

    public int getField2() {
        return field2;
    }

    public void setField2() {
        this.field2 = 0;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public void setField1AndField2() {
        setField1();
        setField2();
    }

    public void setField1AndField2(String field1) {
        setField1(field1);
        setField2();
    }

    public void setField1AndField2(int field2) {
        setField1();
        setField2(field2);
    }

    public void setField1AndField2(String field1, int field2) {
        setField1(field1);
        setField2(field2);
    }
}
