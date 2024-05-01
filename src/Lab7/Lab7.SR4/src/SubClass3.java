public class SubClass3 extends SubClass2 {
    public int field3;

    public SubClass3(char field1, String field2, int field3) {
        super(field1, field2);
        this.field3 = field3;
    }

    public SubClass3(SubClass3 subClass3) {
        super(subClass3);
        this.field3 = subClass3.field3;
    }

    @Override
    public String toString() {
        return "SubClass3: " + super.toString() + ", field3=" + field3;
    }
}
