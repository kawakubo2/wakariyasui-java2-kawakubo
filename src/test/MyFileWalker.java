package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyFileWalker {
    public void replace(String filepath) {
        var path = Path.of(filepath);

        Path tempPath = Path.of("temp.txt"); 
        try (BufferedReader in = Files.newBufferedReader(path);
             PrintWriter out = new PrintWriter(Files.newBufferedWriter(tempPath));) {

            String line = "";
            int number = 1;
            while ((line = in.readLine()) != null) {
                //out.printf("%d %s%n", number++, line);
                out.println(line);
            }
            Files.delete(path);
            Files.move(tempPath, Path.of(filepath));
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        MyFileWalker mf = new MyFileWalker();
        mf.replace("src/test/README.md");
    }
}
