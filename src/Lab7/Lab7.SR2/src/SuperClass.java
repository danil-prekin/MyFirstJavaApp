public class SuperClass {
    private String field1;

    public SuperClass(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        return field1;
    }

    public void setField1() {
        this.field1 = "";
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getField1Length() {
        return field1.length();
    }
}

