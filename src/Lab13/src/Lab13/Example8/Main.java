package Lab13.Example8;

    public class Main {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } catch (RuntimeException e) {
                System.out.println("1");
                return 2;
            } finally {
                System.out.println("3");
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }

