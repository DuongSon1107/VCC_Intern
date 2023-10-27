package Week1_RWFile;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;


public class TextFile {
    public static void main(String[] args) {
        String fileName = "TextFile.text";
        // ghi vao file
        writeText(fileName);
        // doc file
        readText(fileName);
    }

    public static void writeText(String fileName) {
        //ghi van ban vao file text
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hello world");
            bufferedWriter.newLine();
            bufferedWriter.write("Trieu Duong Son 11/7/2002");
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Ghi thanh cong file " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readText(String fileName) {
        //doc van ban tu file text
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Noi dung cua file :");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




