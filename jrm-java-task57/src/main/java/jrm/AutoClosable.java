package jrm;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class AutoClosable {
    private static String fileName = "test.txt";
    private static String text = "Запись в файл выполнена";


    public static void main(String args[]) {
        createFileWithText(fileName, text);
        readFile(fileName);

    }

    private static void readFile(String fileName) {
        byte[] rawString = null;
        File file = new File(fileName);
        try {
            rawString = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(new String(rawString, StandardCharsets.UTF_8));
    }

    private static void createFileWithText(String fileName, String text) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(text.getBytes());

        } catch (
                FileNotFoundException exception) {
            System.out.println("файл не найден");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}