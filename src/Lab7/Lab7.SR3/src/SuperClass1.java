public class SuperClass1 {
        public int field1;

        public SuperClass1(int field1) {
            this.field1 = field1;
        }

        public void setField1(int field1) {
            this.field1 = field1;
        }

        @Override
        public String toString() {
            return "SuperClass1: field1=" + field1;
        }
    }
