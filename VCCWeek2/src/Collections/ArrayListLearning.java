package Collections;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListLearning {
    public static void main(String[] args) {
        ArrayList<String> Day = new ArrayList<>();
        //Them phan tu vao danh sach
        Day.add("Monday");
        Day.add("Tuesday");
        Day.add("Wednesday");
        Day.add("ThursDay");
        Day.add("Friday");
        Day.add("SaturDay");
        Day.add("SunDay");
        //Them phan tu vao vi tri mong muon
        Day.add(7,"Thu Ba");
        // in danh sach
        System.out.println("Danh Sach Phan Tu: " + Day);


        //thay doi phan tu trong danh sach
        Day.set(1,"Thu Hai");

        //xoa phan tu vi tru thu 7
        Day.remove(6);

        //Xoa tat ca phan tu
       // Day.clear();

        //So luong phan tu trong danh sach
        System.out.println("So luong phan tu : " + Day.size());

        //Sap xep danh sach
        Collections.sort(Day);
        System.out.println("Danh Sach Phan Tu Sau Khi Sap Xep : " + Day);

        //In ra phan tu thu 2 trong danh sach
        System.out.println("Phan tu thu 2 trong danh sach : " + Day.get(1));

        //Tim kiem phan tu trong danh sach
        if(Day.contains("Friday") == true){
            System.out.println("Co phan tu trong danh sach");
        } else {
            System.out.println("Khong co phan tu trong danh sach");
        }

        //Tim kiem vi tri xuat hien cua 1 phan tu trong danh sach
        System.out.println(Day.indexOf("ThursDay"));
        System.out.println(Day.indexOf("WeekDay"));
    }
}
