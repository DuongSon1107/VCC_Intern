package Collections;

import java.util.*;

public class HashSetLearning {
    public static void main(String[] args) {
        HashSet<String> Global = new HashSet<String>();
        // them du lieu vao hashset
        Global.add("VietNam");
        Global.add("Thailand");
        Global.add("America");
        Global.add("Australia");
        Global.add("Portugal");
        Global.add("France");

        //xoa phan tu trong hashSet
        Global.remove("France");

        //xoa tat ca phan tu
        //Global.clear();

        //Kiem tra HashSet trong
        if(Global.isEmpty() == true) {
            System.out.println("Global empty");
        } else {
           System.out.println("Global not empty");
        }


        //So luong phan tu trong hash
       System.out.println("So luong cac nuoc trong danh sach la " + Global.size());


        //Su dung for each liet ke cac phan tu
        for (String i : Global) {
            System.out.println(i);
        }

        //Chuyen doi Set thanh List
        List<String> listGlobal = new ArrayList<String>();
        listGlobal.addAll(Global);
        System.out.println(listGlobal);


       //Tim kiem Country co trong set khong
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao dat nuoc muon tim kiem ");
        String CountryName = scanner.nextLine();

        if(Global.contains(CountryName)){
            System.out.println("Co dat nuoc " + CountryName + " trong danh sach");
        } else {
            System.out.println("Khong co dat nuoc " + CountryName + " trong danh sach");
      }



        //tao doi tuong nhan vien
        NhanVien nhanvien1 = new NhanVien("Son", 1);
        NhanVien nhanvien2 = new NhanVien("An", 2);
        NhanVien nhanvien3 = new NhanVien("An", 2);

        //So sanh 2 doi tuong
        System.out.println(nhanvien2.equals(nhanvien3));
        System.out.println(nhanvien2 == nhanvien3);

       //Tao HashSet
        HashSet<NhanVien> CongTy = new HashSet<NhanVien>();
        // them phan tu vao hashset
        CongTy.add(nhanvien1);
        CongTy.add(nhanvien2);
        CongTy.add(nhanvien3);

        for (NhanVien element : CongTy){
            System.out.println(element);
        }


        //In ra HashCode nhan vien
        for (NhanVien nhanVien : CongTy) {
            System.out.println("Hashcod nhan vien " + nhanVien.getName() + " : " + nhanVien.hashCode());
        }

        // Kiem tra nhan vien
//      System.out.println("Nhap vao ten nhan vien muon kiem tra : ");
//      String checkName  = scanner.nextLine();
//      System.out.println("Nhap vao id cua nhan vien");
//      int checkID = scanner.nextInt();
//
//      if (NhanVien.checkNhanVien(CongTy, checkName, checkID)) {
//            System.out.println("Nhan vien " + checkName + " co ID " + checkID + " da ton tai trong Cong Ty.");
//      } else {
//            System.out.println("Nhan vien " + checkName + " co ID " + checkID + " chua ton tai trong Cong Ty.");
//        }
//        scanner.close();
    }
}






