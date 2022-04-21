package jrm;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Objects;

public class ReadTxt {
    public static void main(String[] args) {
        byte[] rawString = null;
        String fileName = "readMe.txt";
        ClassLoader classLoader = ReadTxt.class.getClassLoader();
        File file = new File(Objects.requireNonNull(classLoader.getResource(fileName)).getFile());
        try {
            rawString = Files.readAllBytes(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert rawString != null;
        String[] allRows = new String(rawString, StandardCharsets.UTF_8).split("\n");
        for (String row : allRows) {
            if (row.contains("Apple")) {
                System.out.println(row);
            }
        }
    }
}
