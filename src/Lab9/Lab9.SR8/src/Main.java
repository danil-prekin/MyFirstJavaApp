public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Добавление элементов
        list.createHead(1);
        list.createTail(2);
        list.addFirst(0);
        list.addLast(3);

        // Вывод списка
        System.out.println("Список: " + list.toString());

        // Вставка элемента
        list.insert(2, 4);

        // Вывод списка после вставки
        System.out.println("Список после вставки: " + list.toString());

        // Удаление элемента
        list.removeFirst();
        list.removeLast();
        list.remove(1);

        // Вывод списка после удаления
        System.out.println("Список после удаления: " + list.toString());
    }
}
