package jrm;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class WriteTxt {
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
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(text.getBytes());
        } catch (FileNotFoundException exception){
            System.out.println("Файл не найден");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка записи файла");
            }
        }
    }
}


