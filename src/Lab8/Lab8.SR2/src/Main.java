import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\My\\input.txt");
            File outputFile = new File("C:\\My\\output.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line1 = reader.readLine();
            String line2 = reader.readLine();

            String[] numbers = reader.readLine().split(" ");

            for (String number : numbers) {
                double num = Double.parseDouble(number);
                if (num > 0) {
                    writer.write(number + " ");
                }
            }

            writer.newLine();
            writer.write(line2);

            reader.close();
            writer.close();

            System.out.println("Данные успешно переписаны в файл output.txt");
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}
