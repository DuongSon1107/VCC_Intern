package Week1_RWFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class ThaoTacFile {
    public static void main(String[] args) {
        //duong dan den thu muc
        String directoryPath = "src/";

        // Liet ke file trong thu muc
        listFilesInDirectory(directoryPath);

        // Đọc nội dung của một tệp cụ thể
        String filePathToRead = "TextFile.text";
        String fileContent = readFileContent(filePathToRead);
        System.out.println("Nội dung của file:");
        System.out.println(fileContent);
    }
    public static void listFilesInDirectory(String directoryPath) {
        try {
            Path directory = Paths.get(directoryPath);
            List<Path> files = Files.list(directory).toList();
            for (Path file : files) {
                System.out.println("Tên tệp: " + file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFileContent(String filePath) {
        try {
            Path file = Paths.get(filePath);
            byte[] fileBytes = Files.readAllBytes(file);
            return new String(fileBytes);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
