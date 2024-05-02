import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            File inputFile = new File("C:\\My\\input.txt");
            File outputFile = new File("C:\\My\\output.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("\\s+");

                int consonantWordsCount = 0;

                for (String word : words) {
                    if (startsWithConsonant(word)) {
                        writer.write("Строка " + lineNumber + ": " + word + "\n");
                        consonantWordsCount++;
                    }
                }

                if (consonantWordsCount > 0) {
                    writer.write("Количество слов: " + consonantWordsCount + "\n\n");
                }
            }

            reader.close();
            writer.close();

            System.out.println("Извлечение слов, начинающихся с согласных букв, завершено. Результат сохранен в файл output.txt");
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }

    private static boolean startsWithConsonant(String word) {
        Pattern pattern = Pattern.compile("^[бвгджзйклмнпрстфхцчшщ]");
        Matcher matcher = pattern.matcher(word.toLowerCase());
        return matcher.find();
    }
}