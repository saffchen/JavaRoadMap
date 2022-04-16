package jrm;


import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ReadTxt {
    public static void main(String[] args) {
        byte[] rawString = null;
        String fileName = "readMe.txt";
        ClassLoader classLoader = ReadTxt.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try {
            rawString = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] allRaws = new String(rawString, StandardCharsets.UTF_8).split("\n");
        for (String row : allRaws){
            if (row.contains("Apple")){
                System.out.println(row);
            }
        }
    }
}