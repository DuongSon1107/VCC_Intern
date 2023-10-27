`	`**Report báo cáo kết quả công việc**

**Data Engineer Training**

**Tuần 1:**

**1.1 OOP**

` `**1.1.1 Xây dựng chương trình java bất kì có sử dụng đầy đủ 4 tính chất của oop** 

Mô tả: Xây dựng chương trình java đơn giản “tạo và in các thông tin cá nhân của các nhân viên trong một công ty” mà sử dụng đẩy đủ 4 tính chất của OOP:
`        `+ Tính đóng gói (Encapsulation)

`        `+ Tính kế thừa (Inheritance)

`        `+ Tính đa hình (Polymorphism)

`        `+ Tính  trừu tượng (Abstraction)



Mô tả đã áp dụng:

- ` `Tính đóng gói :

\- Dữ liệu/thuộc tính và hành vi/phương thức được đóng gói trong một lớp(hoặc các lớp đóng gói trong một package),cho phép ẩn đi những thông tin không cần thiết về đối tượng.

<img src="/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019103557316.png" alt="image-20231019103557316" style="zoom: 150%;" />




\- Sử dụng phạm vi truy cập để che giấu dữ liệu: tránh thay đổi trái phép hoặc làm sai lệch dữ liệu

`    `+ Dữ liệu được che giấu ở bên trong lớp bằng cách gán phạm vi truy cập private (hoặc che giấu bên trong package bằng cách gán protected) :



<img src="/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019103720519.png" alt="image-20231019103720519"  />



`    `+ Các đối tượng khác muốn truy nhập vào dữ liệu riêng tư này phải thông qua các phương thức của lớp có phạm vi truy cập public:

Accessor (getter): Trả về giá trị hiện tại của một thuộc tính (dữ liệu)

![image-20231019103855452](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019103855452.png)

Mutator (setter): Thay đổi giá trị của một thuộc tính

![image-20231019103911241](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019103911241.png)

- Tính kế thừa

\- Lớp mới kế thừa những gì đã có trong lớp cũ và phát triển những tính năng mới

\+ Trong chương trình này,lớp con (NhanVienThucTap và TruongPhong) tái sử dụng bằng cách kế thừa các thành phần dữ liệu và các hành vi của lớp cha (NhanVien)

![image-20231019104005322](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019104005322.png)

![image-20231019104013586](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019104013586.png)


\+ super: tìm kiếm phương thức/thuộc tính trong lớp cha trực tiếp,cho phép tái sử dụng các đoạn mã của lớp cha trong lớp con

![image-20231019104039016](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019104039016.png)

\+ Giao diện (Interface):một bản thiết kế của một lớp chứa phương thức trừu tượng. Dùng để cho phép một lớp có thể “kế thừa” (triển 	khai, thực thi) nhiều cấu trúc một lúc

![image-20231019104046710](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019104046710.png)

- Tính đa hình:

\+ Ghi đè phương thức (overriding) :Lớp con định nghĩa phương thức trùng tên với phương thức trong lớp cha (sư dụng lại phương thức của lớp cha)

![image-20231019104102736](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019104102736.png)

- Tính trừu tượng: loại bỏ đi các thông tin ít quan trọng và giữ lại những thông tin quan trọng, có ý nghĩa với bài toán. Ví dụ khai báo thuộc tính là thông tin cá nhân cho đối tượng nhân viên trong công ty:

![image-20231019104125273](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019104125273.png)

**1.1.2. Nêu hiểu biết về các khái niệm liên quan**

\- Abtract :Một lớp trừu tượng (abstract class) trong lập trình hướng đối tượng là một lớp mà không thể tạo ra đối tượng (instance) từ nó trực tiếp. Thay vào đó, mục đích chính của lớp trừu tượng là để định nghĩa các thuộc tính (fields) và phương thức (methods) mà các lớp con (subclasses) phải triển khai (implement). Lớp trừu tượng có thể chứa cả phương thức trừu tượng (abstract methods) và phương thức cụ thể (concrete methods).

\- Interface :Dùng để cho phép một lớp có thể “kế thừa” (triển khai, thực thi) nhiều cấu trúc một lúc,một interface là một tập hợp các phương thức (method) mà các lớp con (classes) phải triển khai (implement),Interface thường được sử dụng để định nghĩa giao diện (contract) cho các lớp con, đảm bảo tính nhất quán trong việc triển khai các phương thức.

\- Static: được sử dụng để chỉ ra rằng một biến hoặc phương thức thuộc về lớp (class) chứ không phải là một thành phần của đối tượng (instance). Các thành phần static được chia sẻ giữa tất cả các đối tượng của lớp, và  có thể được truy cập thông qua tên của lớp mà không cần tạo một đối tượng từ lớp đó.	

\- Final: sử dụng để khai báo một biến, phương thức hoặc lớp không thể thay đổi hoặc kế thừa,định nghĩa một thứ gì đó và không muốn nó thay đổi sau khi đã định nghĩa.

\- Ngoại lệ (exception):Ngoại lệ là một sự kiện xảy ra trong quá trình thực thi chương trình, nó phá vỡ luồng bình thường của chương trình.Là một lỗi đặc biệt như do lâp trình sai,do nhập sai dữ liệu, do trạng thái của hệ thống (tràn bộ nhớ).



**1.1.3. Xây dựng UML**

![image-20231019104216315](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231019104216315.png)



**1.2.Đọc ghi File**	

Link github:

**1.2.1.Viết trương trình java đọc ghi file theo 2 dạng binary và text**

**1.2.2. viết trương trình java thao tác với file và thư mục: list các file, đọc nội dung file**

