public class Main {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass("Hello World!");
        System.out.println("Super class: field1 = " + superObj.getField1() + ", length = " + superObj.getField1Length());

        SubClass subObj = new SubClass(10, "Subclass Field");
        System.out.println("Sub class: field1 = " + subObj.getField1() + ", field2 = " + subObj.getField2());

        subObj.setField1AndField2("New Value", 20);
        System.out.println("Sub class after setField1AndField2: field1 = " + subObj.getField1() + ", field2 = " + subObj.getField2());

        subObj.setField1();
        subObj.setField2();
        System.out.println("Sub class after setField1 and setField2: field1 = " + subObj.getField1() + ", field2 = " + subObj.getField2());
    }
}