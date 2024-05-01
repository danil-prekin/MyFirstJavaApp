public class Main {
    public static void main(String[] args) {
        SubClass3 subClass3 = new SubClass3('A', "Hello World!", 10);
        System.out.println(subClass3);

        SubClass3 subClass3Copy = new SubClass3(subClass3);
        System.out.println(subClass3Copy);
    }
}