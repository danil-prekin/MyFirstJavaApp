public class SubClass3 extends SubClass2 {
    public String field3;

    public SubClass3(int field1, char field2, String field3) {
        super(field1, field2);
        this.field3 = field3;
    }

    public void setField1(int field1) {
        super.setField1(field1);
    }

    public void setField2(char field2) {
        super.setField2(field2);
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public void setField1AndField2(int field1) {
        setField1(field1);
    }

    public void setField1AndField2(int field1, char field2) {
        setField1(field1);
        setField2(field2);
    }

    public void setField1AndField2AndField3(int field1, char field2, String field3) {
        setField1AndField2(field1, field2);
        setField3(field3);
    }

    @Override
    public String toString() {
        return "SubClass3: " + super.toString() + ", field3=" + field3;
    }
}
