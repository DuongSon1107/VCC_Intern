package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapLearning {
    public static void main(String[] args) {
        // tao hashmap City
        HashMap<String, Integer> City = new HashMap<>();

        //them phan tu vao hashmap
        City.put("Thai Nguyen", 20);
        City.put("Ha Noi", 29);
        City.put("Thanh Hoa",36 );
        City.put("Quang Ninh",14);
        City.put("Sai Gon",51);
        City.put("Hai Phong",15);

        // Tra ve Collection view các anh xa có trong HashMap.
        System.out.println(City.entrySet());

        // tao hashmap OtherCity
        HashMap<String, Integer> OtherCity = new HashMap<>();
        OtherCity.put("Hai Duong",34);
        OtherCity.put("Nghe An",37);
        // them vao hashmmap City
        City.putAll(OtherCity);

        //Kiem tra xem HashMap co trong khong
        if (City.isEmpty()){
            System.out.println("Danh Sach trong");
        } else {
            System.out.println("Danh sach co du lieu \n");
        }

        //xoa 1 key-value
        City.remove("Thai Nguyen",20);
        //Xoa tat ca key-value
        //City.clear();

        //thay the gia tri cua mot key (key Ha Noi)
        City.replace("Ha Noi", 30);

        // in ra tat ca key va gia tri tuong ung
        for (String i : City.keySet()) {
            System.out.println(i + " co so bien : " + City.get(i));
        }


        //in ra so luong key-value trong HashMap
        System.out.println("\nSo luong thanh pho la : " + City.size());



        //tinh toan gia tri Value
        int plusNumber = 2;
        City.compute("Sai Gon", (key, value) -> {
            if (value != null) {
                return value + plusNumber;
            }
            return plusNumber;
        });


        //Tim phan tu co key chi dinh hoac value chi dinh
        System.out.println(City.containsValue(36));
        System.out.println(City.containsKey("Son La"));

        //Tim kiem gia tri tuong ung voi key nhap vao tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhap vao thanh pho muon tim : ");
        String keyCity = scanner.nextLine();
        if (City.containsKey(keyCity)){
            int valueCity = City.get(keyCity);
            System.out.printf("\n");
            System.out.println(" Bien so xe cua thanh pho " + keyCity + " la : " + valueCity);
            scanner.close();
        }else {
            System.out.println("Khong tim thay bien so xe cho thanh pho " + keyCity);
        }
        scanner.close();
    }
}

