package test;

    
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
/*
import java.nio.file.FileVisitOption.*;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitOption.*;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitOption.*;
*/
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

public class FileWalker implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // ディレクトリに入る前に実行されるアクション
        System.out.println("Entering directory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        // ファイルに対して実行されるアクション
        System.out.println("File: " + file);
        // 特定の条件に合致するファイルを見つけた場合に走査を終了する例
        if (file.getFileName().toString().endsWith(".txt")) {
            var visitor = new NumberLineVisitor();
            visitor.replace(file);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        // ファイルにアクセスできなかった場合に実行されるアクション（スキップ可能）
        System.err.println("Failed to visit file: " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        // ディレクトリを出た後に実行されるアクション
        System.out.println("Exiting directory: " + dir);
        return FileVisitResult.CONTINUE;
    }
}

