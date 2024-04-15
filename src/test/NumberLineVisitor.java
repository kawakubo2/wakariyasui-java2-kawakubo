package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class NumberLineVisitor {
    public void replace(Path path) {
        Path tempPath = Path.of("temp.txt"); 
        try (BufferedReader in = Files.newBufferedReader(path);
             PrintWriter out = new PrintWriter(Files.newBufferedWriter(tempPath));) {

            String line = "";
            int number = 1;
            while ((line = in.readLine()) != null) {
                out.printf("%03d %s%n", number++, line);
            }
            Files.delete(path);
            Files.move(tempPath, path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
