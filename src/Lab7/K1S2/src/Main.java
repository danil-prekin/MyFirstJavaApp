package Lab7;

public class Main {
    public static void main (String[] args) {
        SuperClassTest superClassObject =
                new SuperClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        SubClassTest subClassObject1 =
                new SubClassTest("передал в конструктор подкласса");
        SubClassTest subClassObject2 =
                new SubClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);

    }

}