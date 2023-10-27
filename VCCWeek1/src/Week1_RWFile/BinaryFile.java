package Week1_RWFile;

import java.io.*;
import java.nio.file.*;

public class BinaryFile {
    public static void main(String[] args) {
        String filePath = "BinaryFile.bin";
        // Ghi du lieu theo dang binary
        byte[] binaryData = { 84,114,105,101,117,32,68,117,111,110,103,32,83,111,110 };
        writeBinary(filePath, binaryData);

        // Doc du lieu
        byte[] binaryContent = readBinary(filePath);
        System.out.print("Noi dung cua file: ");
        for (byte b : binaryContent) {
            System.out.print((char) b);
        }
    }

    public static void writeBinary(String filePath, byte[] data) {
        try (OutputStream os = new FileOutputStream(filePath)) {
            os.write(data);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static byte[] readBinary(String filePath) {
        try {
            Path path = Paths.get(filePath);
            return Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }
}
