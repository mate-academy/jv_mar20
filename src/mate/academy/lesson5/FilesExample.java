package mate.academy.lesson5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class FilesExample {
    public static void main(String[] args) {
        String filename = "hello.txt";
        String content = "hello mates";

        Scanner scanner = new Scanner(System.in);
        content = scanner.next();
        writeToFile(content, filename);
    }

    public static String readline(String path) {
        try {
            File sourceFile = new File(path);
            if (!sourceFile.exists()) {
                sourceFile.createNewFile();
            }

            List<String> list = Files.readAllLines(sourceFile.toPath());
            // charset CP_1251 ---кирилиця

            return list.toString();
        } catch (IOException e) {
            throw new RuntimeException("Can't read data", e);
        }
    }

    public static void writeToFile(String content, String filename) {
        File file = new File(filename);
//
//        FileWriter writer = null;
//        try {
//            writer = new FileWriter(file);
//            writer.write(content);
//            writer.flush();
//        } catch (IOException e) {
//            throw new RuntimeException("Error while writing content to the file");
//        } finally {
//            if (writer != null) {
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    throw new RuntimeException("Can't close the file");
//                }
//            }
//        }

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(content);
            fileWriter.write("\n");
            fileWriter.write("new value");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
