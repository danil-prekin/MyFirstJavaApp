package SR1;
import java.io.*;

public class File_RW_byByte {
    public static void main(String[] args) throws IOException {
        Reader in=null; // можно сразу записать FileReader in=null;
        Writer out=null; // можно сразу записать FileWriter out =null;
        try {
            in = new FileReader("C:\\My\\MyFile1.txt"); // файл для чтения
            out= new FileWriter("C:\\My\\MyFile2.txt", true); // файл для записи
            int oneByte; // переменная, в которую считываются данные
            while ((oneByte = in.read()) != -1) {
// out.write((char)oneByte); // запись с уничтожением ранее
// существующих данных
                out.append((char)oneByte); // запись с добавлением данных в конец
                System.out.print((char)oneByte);
            }
        } catch (IOException e) {
            System.out.println("Ошибка!!!! ");
        }
        finally{
            in.close();
            out.close();
        } }}
