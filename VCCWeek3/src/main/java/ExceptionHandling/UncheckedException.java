package ExceptionHandling;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap vao so chia");
            int a = scanner.nextInt();
            System.out.println("Nhap vao so bi chia");
            int b = scanner.nextInt();
            int x = a / b;
            System.out.println("Ket qua cua phep chia 2 so : " + x);
        } catch (ArithmeticException e) {
            System.out.println("Khong the chia mot so cho 0");
        }
        catch (InputMismatchException e){
            System.out.println("Vui long nhap vao mot so");
        }
        catch (Exception e){
            System.out.println("Du lieu nhap vao khong phu hop");
        }
        finally {
            scanner.close();
        }
    }
}