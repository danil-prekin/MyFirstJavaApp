public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Ввод с головы с использованием рекурсии
        list.createHeadRec(1);
        list.createHeadRec(2);
        list.createHeadRec(3);

        // Вывод списка с использованием рекурсии
        System.out.println("Список (рекурсия): " + list.toStringRec());

        // Ввод с хвоста с использованием рекурсии
        list.createTailRec(4);
        list.createTailRec(5);
        list.createTailRec(6);

        // Вывод списка с использованием рекурсии
        System.out.println("Список (рекурсия): " + list.toStringRec());
    }
}
