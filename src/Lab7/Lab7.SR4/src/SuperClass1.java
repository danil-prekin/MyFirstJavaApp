public class SuperClass1 {
    public char field1;

    public SuperClass1(char field1) {
        this.field1 = field1;
    }

    public SuperClass1(SuperClass1 superClass1) {
        this.field1 = superClass1.field1;
    }

    @Override
    public String toString() {
        return "SuperClass1: field1=" + field1;
    }
}
