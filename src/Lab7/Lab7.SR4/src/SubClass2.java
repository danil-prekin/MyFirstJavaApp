public class SubClass2 extends SuperClass1 {
    public String field2;

    public SubClass2(char field1, String field2) {
        super(field1);
        this.field2 = field2;
    }

    public SubClass2(SubClass2 subClass2) {
        super(subClass2);
        this.field2 = subClass2.field2;
    }

    @Override
    public String toString() {
        return "SubClass2: " + super.toString() + ", field2=" + field2;
    }
}

