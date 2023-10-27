package Week1_OOP.NhanSuCongTy;

public class Launcher {
    public static void main(String[] args) {

        // tao Truong Phong
        TruongPhong truongPhong = new TruongPhong("Duong Son", 20, 0, "11/7/1994", 24, "Truong Phong");
        //tao Nhan Vien thuc tap
        NhanVienThucTap nhanVienThucTap = new NhanVienThucTap("Khoa Doan", 20, "2/9/2002", 12, "Sinh vien Thuc Tap", "Online");
        // tao Nhan Vien
        NhanVien nhanVien = new NhanVien("Hai Phong",20,0,"13/19/2002",29,"Nhan Vien");


        //Test thay doi thong tin cua nhan vien
        nhanVien.setAge(23);
        nhanVienThucTap.setTypeWork("Offline");

        nhanVien.inTTin();
        nhanVienThucTap.inTTin();
        truongPhong.inTTin();

        //Upcasting
        truongPhong.Show();
    }
}