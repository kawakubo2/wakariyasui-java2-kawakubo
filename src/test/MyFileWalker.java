package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFileWalker {
    public static void main(String[] args) {
        var path = Path.of("./src/test/Season.java");
        try (BufferedReader br = Files.newBufferedReader(path);) {
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
