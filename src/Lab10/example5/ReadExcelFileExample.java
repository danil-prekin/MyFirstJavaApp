package Lab10.example5;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        String filePath = "src/Lab10/example5/example5.xlsx";

        try (FileInputStream inputStream = new FileInputStream(filePath);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            // Получаем лист из книги по его имени
            XSSFSheet sheet = workbook.getSheet("Товары");

            // Проверяем, что лист существует
            if (sheet == null) {
                System.err.println("Лист с именем 'Товары' не найден в файле.");
                return;
            }

            // Перебираем строки и ячейки листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("Ошибка при работе с книгой Excel: " + e.getMessage());
        }
    }
}
