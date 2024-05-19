package SR4;

public class SR4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                long threadNumber = Thread.currentThread().getId();
                System.out.println("Поток " + threadNumber);
            });
            thread.start();
        }
    }
}
