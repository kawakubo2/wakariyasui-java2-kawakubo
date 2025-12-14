package test;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileWalkerTest {
    public static void main(String[] args) {
        try {
            Files.walkFileTree(Path.of("./abc"), new FileWalker());
        } catch(Exception e) {
            System.out.println(e);
        }     
    }
}
