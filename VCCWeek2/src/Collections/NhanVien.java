package Collections;

import java.util.Objects;

public class NhanVien {
    public String name;
    public int id;
    public NhanVien(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof NhanVien nhanVien)) return false;
        return getId() == nhanVien.getId() && Objects.equals(getName(), nhanVien.getName());
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
     public int hashCode() {
      return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //    public static boolean checkNhanVien(HashSet<NhanVien> CongTy, String name, int id) {
//        for (NhanVien nhanVien : CongTy) {
//            if (nhanVien.getName().equals(name) && nhanVien.getId() == id) {
//                return true; // Nếu tên và ID của nhân viên trùng khớp, trả về true
//            }
//        }
//        return false; // Nếu không tìm thấy nhân viên, trả về false
//    }
}

