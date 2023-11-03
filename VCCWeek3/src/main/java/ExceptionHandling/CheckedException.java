package ExceptionHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CheckedException {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        String sCurrentLine;
            br = new BufferedReader(new FileReader("/home/son/Intern/VCCWeek3/src/main/java/Testing.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        }
    }
