package lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadException {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test_lesson2.txt");
//        try (FileInputStream fis = new FileInputStream("test_lesson2.txt")) {
            byte[] bytes = fis.readAllBytes();
            String text = new String(bytes);
            System.out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Файл не был найден!");
        } catch (IOException e) {
            System.out.println("Файл поврежден!");
        }/* finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
    }
}
