package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test190_1 {
    public static void main(String[] args) {
        Path path = Paths.get("Sample.txt");
        try (BufferedReader in = Files.newBufferedReader(path);) {
            System.out.println("---< while文を使った例 >---");
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            // while文を使わすStreamを利用することもできます。
            // System.out.println("---< Streamを使った例 >---");
            // in.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
