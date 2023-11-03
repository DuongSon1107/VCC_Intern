package JsonPractice;

import com.google.gson.Gson;

public class GsonDecode {
    public static void main(String[] args) {
        //Chuyen doi tu string sang object
       String jsonnv1 = "{\"name\":\"Doan\",\"salary\":1000}";
       String jsonnv2 = "{\"name\":\"Son\",\"salary\":2000}";
        Gson gson = new Gson();

        // Parse chuỗi JSON thành đối tượng Person
        NhanVien nhanvien1 = gson.fromJson(jsonnv1, NhanVien.class);
        System.out.println(jsonnv1);

        NhanVien nhanvien2 = gson.fromJson(jsonnv2, NhanVien.class);
        System.out.println(jsonnv2);

    }
}
