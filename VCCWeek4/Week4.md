# Week 4

### 4.1. Cơ sở dữ liệu (MySQL)

#### **4.1.1.1.Trình bày về MySQL**

- **SQL(Structed Query Language)** Ngôn ngữ truy vấn có cấu trúc: là ngôn ngữ theo chuẩn ANSI để định nghĩa và xử lý dữ liệu trong một cơ sở dữ  liệu quan hệ. Các phát biểu SQL dùng để truy tìm và cập nhật dữ liệu  trong một cơ sở dữ liệu.

- **MySQL** là hệ quản trị cơ sở dữ liệu quan hệ mã nguồn mở miễn phí (được gọi tắt là RDBMS) sử dụng Ngôn ngữ truy vấn có cấu trúc (**SQL**). Đang hoạt động theo  mô hình dạng client-server. Đối với RDBMS - Relational Database  Management System thì MySQL đã được tích hợp apache và PHP,được các nhà phát triển rất ưa chuộng trong quá trình phát triển ứng dụng.

- MySQL là hệ quản trị cơ sở dữ liệu tốc độ cao, ổn định và dễ sử dụng, có tính khả chuyển, hoạt động trên nhiều hệ điều hành cung cấp một hệ  thống lớn các hàm tiện ích rất mạnh. Với tốc độ và tính bảo mật cao,  MySQL rất thích hợp cho các ứng dụng có truy cập CSDL trên internet.

- Đặc điểm của hệ quản trị cơ sở dữ liệu MySQL

  \- MySQL là một phần mềm quản trị CSDL dạng server-based (gần tương đương với SQL Server của Microsoft).

  \-MySQL quản lý dữ liệu thông qua các CSDL, mỗi CSDL có thể có nhiều bảng quan hệ chứa dữ liệu.

  \-MySQL có cơ chế quản lý sử dụng riêng giúp cho mỗi người sử dụng đều có thể quản lý cùng lúc một hay nhiều CSDL khác nhau. Và mỗi người dùng đều có 1 username và password để truy nhập và truy xuất đến CSDL. Khi  truy vấn đến CSDL của MySQL, bạn phải cung cấp tài khoản và mật khẩu có  quyền sử dụng cơ sở dữ liệu đó.

- Ưu điểm :

  - **Nhanh chóng:** Nhờ vào việc đưa ra một số những tiêu  chuẩn và cho phép MySQL làm việc hiệu quả cũng như tiết kiệm chi phí,  giúp gia tăng tốc độ thực thi.
  - **Mạnh mẽ và khả năng mở rộng:** MySQL hoàn toàn có thể xử lý số lượng lớn dữ liệu và đặc biệt hơn thế nữa thì nó còn có thể mở rộng nếu như cần thiết. 
  - **Đa tính năng:**  MySQL hiện đang  hỗ trợ nhiều những chức năng SQL rất được mong chờ từ 1 hệ quản trị CSDL quan hệ cả gián tiếp cũng như trực tiếp.
  - **Độ bảo mật cao:**:Hiện tại nó đang rất  thích hợp cho những ứng dụng truy cập CSDL thông qua internet khi sở hữu rất nhiều những tính năng về bảo mật và thậm chí là đang ở cấp cao.
  - **Hỗ trợ nền tảng đa hệ điều hành:** MySQL có sẵn trên nhiều hệ điều hành khác nhau như Windows, Linux, macOS, giúp tăng tính linh hoạt trong triển khai hệ thống.
  - **Dễ sử dụng:** MySQL cung cấp giao diện dòng lệnh và giao diện đồ họa, làm cho việc quản lý và thao tác cơ sở dữ liệu trở nên dễ dàng đối với người quản trị.

- Nhược điểm:

  - **Dung lượng hạn chế:** Trong trường hợp nếu như số lượng bản ghi của bạn đang lớn dần lên thì khi đó quá trình truy xuất dữ liệu sẽ diễn ra vô cùng khó khăn. Như vậy cần phải áp dụng rất nhiều  những biện pháp khác nhau để có thể gia tăng được tốc độ truy xuất những dữ liệu ví dụ như tạo cache MySQL hoặc chia tải database ra nhiều  server. 
  - **Độ tin cậy:**  Theo đó cách  thức nhận chức năng cụ thể đang được xử lý cùng với MySQL (ví dụ như  kiểm toán, những giao dịch, tài liệu tham khảo,...) khiến cho nó trở nên kém tin cậy hơn một số những hệ quản trị về cơ sở dữ liệu có quan hệ  khác. 
  - **Giới hạn:** Theo thiết kế thì MySQL  không có ý định thực hiện toàn bộ và nó đang đi kèm cùng với những hạn  chế liên quan tới chức năng mà một số ứng dụng có thể cần tới. 
  - **Chưa hỗ trợ NoSQL mạnh mẽ:** Trong khi MySQL hỗ trợ một số tính năng NoSQL, nhưng không có sự linh hoạt và hiệu suất cao như một số hệ quản trị cơ sở dữ liệu NoSQL chuyên sâu.

- Các kiểu dữ liệu trong MySQL

  - Kiểu dữ iệu số

    | Kiểu dữ liệu | Độ dài (số byte) | Khoảng giá trị                                      |
    | ------------ | ---------------- | --------------------------------------------------- |
    | TINYINT      | 1                | -128..127                                           |
    | SMALLINT     | 2                | -32768..32767                                       |
    | MEDIUMINT    | 3                | -8388608..8388607                                   |
    | INT          | 4                | -2147483648..2147483647                             |
    | BIGINT       | 8                | -9223372036854775808..9223372036854775807           |
    | FLOAT        | 4                | -3.402823466E+38..-1.175494351E-38                  |
    | DOUBLE       | 8                | -1.7976931348623157E+308..-2.2250738585072014E- 308 |

    Ngoài ra còn các kiểu  **FLOAT** và **DOUBLE** mô tả gần đúng các giá trị số thực,**DECIMAL** theo định dạng nhị phân.

  - Kiểu dữ liệu chuỗi

    | Kiểu dữ liệu | Mô tả                                                        | Định dạng hiển thị                                     | Phạm vi các ký tự                                            |
    | ------------ | ------------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------------ |
    | CHAR         | Chứa chuỗi không  phải nhị phân (non-binary strings). Độ dài là cố định  như khi bạn khai báo cột của bảng. Khi lưu trữ chúng được độn thêm bên  phải (right-padded) để có độ dài chỉ được chỉ định. | Khoảng trắng phía trước (Trailing spaces) được loại bỏ | Giá trị từ 0 tới 255                                         |
    | VARCHAR      | Chứa các chuỗi không phải nhịn phân (non-binary strings). Cột là chuỗi có chiều dài thay đổi. | Giống như lưu trữ.                                     | Giá trị từ 0 tới 255 với MySQL trước phiên bản 5.0.3. Và 0 tới 65,535 với các phiên bản MySQL 5.0.3 hoặc mới hơn. |

  - Một số lệnh trong MySQL:

    \- Tạo một Database mới: `CREATE DATABASE + <Tên Database>`

    \- Tạo một bảng mới: `CREATE TABLE + <Tên bảng>`

    \- Lệnh **ALTER** để sửa thông tin một thực thể trong **MySQL**. Cấu trúc chung: `ALTER + <Loại thực thể> + <Tên thực thể> + <Tùy chọn>`

    \- Câu lệnh **SELECT** trong **MySQL** được sử dụng để lấy các bản ghi từ một hoặc nhiều bảng.  

    \- Câu lệnh **INSERT** trong **MySQL** được sử dụng để chèn một bản ghi đơn hoặc nhiều bản ghi vào một bảng.

    \- Câu lệnh **UPDATE** trong **MySQL** được sử dụng để cập nhật các bản ghi hiện có trong một bảng.

    \- Câu lệnh **DELETE** trong **MySQL** được sử dụng để xóa một hoặc nhiều bản ghi từ một bảng.

    ...

#### 4.1.2.1.Tạo database trên MySQL 

- Demo **xây dựng cơ sở dữ liệu quản lý thư viện** : quản lý sách, người mượn sách, hóa đơn mượn sách.

- Các dữ liệu lưu trữ :

  \-  Dữ liệu về sách: tên, tác giả, thể loại, số lượng, giá cả, vv…

  \-  Dữ liệu về nhà xuất bản: tên, địa chỉ, vv…

  \-  Dữ liệu về người mượn: tên, địa chỉ, loại thẻ, ngày mở thẻ, ngày hết hạn, vv…

  \-  Dữ liệu về hoá đơn mượn sách, chi tiết hoá đơn mượn sách 

#### 4.1.2.2 Sơ đồ thực thể liên kết 

![image-20231108143518345](/VCCWeek4/Anhweek4/1.png)





#### 4.1.2.3Phân tích lược đồ quan hệ 

![image-20231108143619966](/VCCWeek4/Anhweek4/2.png)



- **Publisher**: Tên nhà xuất bản

​       \- Pub_ID: Khoá chính

​      \- Name: Tên nhà xuất bản

​      \- Address: Địa chỉ



- **Books**: Sách

​       \- Book_ID: Khoá chính

​       \- Author: Tác giả

​       \- Title: Tiêu đề

​       \- Price: Giá

​        \- Quantity: Số lượng



- **Pub_Book**: Danh sách xuất bản

​           \- Khoá chính: Pub_ID, Book_ID

​           \- Pub_ID: Khoá ngoại, tham chiếu đến Pub_ID ở bảng Publisher

​           \- Book_ID: Khoá ngoại, tham chiếu đến Book_ID ở bảng Books



- **Member**: Người mượn

​         \- Menber_ID: Khoá chính

​         \- Name: Tên

​         \- Address: Địa chỉ

​         \- Member_Type: Loại thành viên

​         \- Member_Date: Ngày mở thẻ

​         \- Exipry_Date: Ngày hết hạn



- **Invoice**: Hoá đơn  

​         \- Invoice_ID: Khoá chính

​         \- Member_ID: Khoá ngoại, tham chiếu đến Member_ID ở bảng Member

​         \- Borrow_Date: Ngày mượn

​         \- Return_Date: Ngày trả



- **Invoice_Detail**: Chi tiết hoá đơn

​          \- Khoá chính: Invoice_ID, Book_ID  

​          \- Book_ID: Khoá ngoại, tham chiếu đến Book_ID ở bảng Books

​         \- Invoice_ID: Khoá ngoại, tham chiếu đến Invoice_ID ở bảng Invoice

​         \- Quantity: Số lượng

#### 4.1.2.4 Thêm dữ liệu vào database

- **Publisher** 

![image-20231108145310569](/VCCWeek4/Anhweek4/3.png)

- **Books**

  ![image-20231108145447290](/VCCWeek4/Anhweek4/4.png)

- **Pub_Book**

  ![image-20231108145542792](/VCCWeek4/Anhweek4/5.png)

- **Member**

  ![image-20231108150023836](/VCCWeek4/Anhweek4/6.png)
- **Invoice**

  ![image-20231108150124165](/VCCWeek4/Anhweek4/7.png)

- **Invoice_Detail** 

  ![image-20231108150339641](/VCCWeek4/Anhweek4/8.png)

### 4.2. Tối ưu hóa truy vấn

- Khi truy vấn vào cơ sở dữ liệu bất cứ ở môi trường nào thì tối ưu hóa các câu lệnh truy vấn là điều bắt buộc chúng ta phải làm để tối ưu hóa performance của ứng dụng. Một truy vấn không hiệu quả có  thể là gánh nặng cho cơ sở dữ liệu và gây hiệu suất chậm, thậm chí có thể làm mất kết nối tới ứng dụng nếu câu truy vấn sql có lỗi. Sau đây là 5 ví dụ về câu truy vấn không tốt và cách tối ưu hóa nó.

- **Indexing (Chỉ mục)** 

  Dùng index một cách ĐÚNG ĐẮN sẽ giúp việc thực thi truy vấn nhanh hơn rất nhiều lần. Index giống như một cái mục lục vậy, khi bạn muốn tìm đến một phần hay  một chương trong cuốn sách thì chỉ cần nhìn mục lục và số trang rồi lật  đến trang đó là xong, thay vì mất công xem tìm từng trang một trong cuốn sách.

  Giả sử ta muốn lấy thông tin những quyển sách có số lượng lớn hơn 3 :

  ```
  select *  from Books where Quantity > 3;
  ```

  MySQL có một câu lệnh **EXPLAIN** để có thể phân tích câu truy vấn của mình, khi đặt **EXPLAIN** vào trước câu lệnh SQL, MySQL sẽ hiển thị thông tin từ trình tối ưu hóa về kế hoạch thực hiện dự định, hay xem kết quả :

  ![image-20231110163120001](/VCCWeek4/Anhweek4/9.png)

  Đầu tiên,MySQL sẽ tiến hành quét toàn bộ bảng vì cột key là 'NULL'.Chúng ta dễ thấy được mysql cần duyệt qua 13 dòng trong cơ sở dữ liệu để thực thi câu truy vấn này.

  Để tối ưu hóa truy vấn trên, ta sẽ thêm index vào trường **Quantity** bằng cú pháp như sau:

  ```
   create index idxQuantity on Books(Quantity);
  ```

  Sau đó thực hiện lại câu truy vấn cũ và vẫn thêm câu lệnh **EXPLAIN** đằng trước để được phân thích và thấy sự khác biệt :

  ![image-20231110163624195](/VCCWeek4/Anhweek4/10.png)

  Từ output trên, rõ ràng máy chủ MySQL sẽ sử dụng **Index (Quantity)** để tìm kiếm. Ta có thể thấy rõ số lượng rows cần quét chỉ là 6. Indexes có thể rất có ích khi bạn truy vấn một tập dữ liệu lớn (ví dụ: một bảng có hàng triệu rows).Sử dụng chỉ mục có thể cải thiện hiệu suất của truy vấn bằng cách giảm số lượng bản ghi cần được quét. 

- **SELECTION**

  Việc lựa chọn lấy các hàng cần thiết thay vì chọn tất cả các hàng là ưu tiên. Việc sử dụng SELECT * rất kém hiệu quả vì nó quét toàn bộ dữ liệu của bảng đó. 

  Thay vì sử dụng SELECT*  hay chỉ lấy ra các hàng cần thiết cho mục đích của mình.

  ![image-20231110172250072](/VCCWeek4/Anhweek4/11.png)
  Việc này với một database nhỏ nhắn thì không thấy chậm lắm nhưng với một **database lớn**, một records có **nhiều trường phức tạp** thì việc lấy ra hết các hàng sẽ **làm câu truy vấn chạy chậm một cách đáng kể** và việc này khá là tai hại, vì thế chúng ta nên chỉ nên lấy  ra những **dữ liệu mà mình cần**.

- **SELECT DISTINCT**

  \- Lệnh **SELECT DISTINCT** trong **SQL** được sử dụng để tìm nạp các kết quả duy nhất và loại bỏ các hàng trùng lặp trong mối quan hệ.  Để đạt được nhiệm vụ này, về cơ bản nó nhóm các hàng liên quan lại với nhau và sau đó loại bỏ chúng.  Hoạt động GROUP BY là một hoạt động tốn kém.  Vì vậy, để tìm nạp các hàng riêng biệt và loại bỏ các hàng trùng lặp, người ta có thể sử dụng nhiều thuộc tính hơn trong thao tác **SELECT**.

   \- **DISTINCT** là một toán tử được sử dụng để trả về các bản ghi duy nhất  trong một tập dữ liệu. Trong một số trường hợp, DISTINCT có thể được  loại bỏ mà không làm thay đổi kết quả của truy vấn. Điều này có thể cải  thiện hiệu suất của truy vấn bằng cách giảm số lượng bản ghi cần được  quét.

- **Sử dụng (INNER) JOIN thay vì WHERE:**

  Giả sử ta sử dụng where để truy vấn kết nối bảng như sau:

  ```
  Select Member.Member_ID,Member.Member_Date,Member.Name,Invoice.Member_id 
      -> From Member,Invoice
      -> Where Member.Member_ID=Invoice.Member_id;
  ```

  Khi kết nối các bảng như này ta sẽ tạo ra một Cartesian Join, còn gọi là Cross Join.Ở trong ví dụ trên, giả sử nếu chúng ta có 1000 members và 1000 Invoices, truy vấn sẽ tạo ra 1.000.000 kết quả , và sau đó chỉ lọc 1000 bản ghi trong đó ID được kết nối chính xác.Đây là việc sử dụng tài nguyên cơ sở dữ liệu không hiệu quả, vì cơ sở dữ liệu đã thực hiện nhiều hơn 100 lần so với yêu cầu. 

  Để tránh việc này ta cần sử dụng **INNER JOIN** thay thế: 

  ```
  Select Member.Member_ID,Member.Member_Date,Member.Name,Member.Member_Type,
  Invoice.Invoice_id,Invoice.Borrow_Date,Invoice.Return_Date  
  From Member 
  JOIN Invoice 
  On  Member.Member_ID=Invoice.Member_id;
  
  ```

- **LIMIT command**

  Trong SQL, câu lệnh LIMIT thường được sử dụng để hạn chế số hàng được trả về bởi một truy vấn. Ví dụ , truy vấn trích dẫn dữ liệu từ bảng và giới hạn bộ kết quả chỉ chứa 10 hàng đầu tiên bằng cách sử dụng mệnh đề `LIMIT 10`. Điều này có thể rất hữu ích để cải thiện hiệu suất của truy vấn khi bạn chỉ cần một phần nhỏ của dữ liệu.

  ![image-20231113154457090](/VCCWeek4/Anhweek4/12.png)

  

4.3. Tìm hiểu các loại database

#### 4.3.1.SQL Database

#### 4.3.1.1.Cơ sở dữ liệu quan hệ (RDBMS) : 

- **Hệ thống quản lý cơ sở dữ liệu quan hệ (RDBMS)** là viết tắt của Relational Database Management System có nghĩa là hệ quản trị cơ sỡ dữ liệu quan hệ,là một dạng DBMS sử dụng  **relational database.** . RDBMS là cơ sở cho SQL, và cho tất cả các hệ thống cơ sở dữ liệu hiện đại.

- **Relational database** được tối ưu cho việc lưu trữ dữ  liệu dưới dạng các dòng - tức dữ liệu của cùng một dòng sẽ được lưu trữ  gần nhau trong ổ cứng, việc này giúp tối ưu hoá cho các ứng dụng liên  quan nhiều tới giao dịch.

- Dữ liệu trong một RDBMS được lưu trữ trong các đối tượng cơ sở dữ liệu được gọi là **các bảng (table)** , chứa **cột (thực thể)** và **hàng (bản ghi)** . Bảng này về cơ bản là một bộ sưu tập các mục nhập dữ liệu có liên quan và nó bao gồm nhiều cột và hàng. Bảng là hình thức lưu trữ dữ liệu phổ biến và đơn giản nhất trong một cơ sở dữ liệu quan hệ. 

  ![image-20231108145310569](/VCCWeek4/Anhweek4/13.png)

- **Ràng buộc (Constraint)** là các quy tắc được áp dụng trên các cột dữ  liệu của một bảng. Chúng được sử dụng để kiểm tra tính hợp lệ của dữ  liệu đầu vào, đảm bảo tính chính xác, độ tin cậy và tính toàn vẹn của dữ liệu trong database.

  - PRIMARY Key : mỗi bảng sẽ chỉ có 1 khóa chính và giá trị của trường này không được null. Bộ giá trị của các khóa chính luôn là duy nhất và không có trùng  lặp.
  - FOREIGN Key: Dùng để thiết lập khóa ngoại trên bảng,dùng để liên kết hai bảng lại với nhau, tham chiếu đến bảng khác thông qua giá trị của cột được liên kết. Giá trị của cột được liên kết phải là duy nhất trong bảng kia.
  - NOT NULL: Đảm bảo giá trị của cột không được nhận giá trị NULL.
  - DEFAULT: Cung cấp một giá trị mặc định khi dữ liệu của một cột NULL.
  - UNIQUE: Đảm bảo rằng dữ liệu của cột là duy nhất, tất cả các giá trị trong một cột là khác nhau không trùng lặp.
  - INDEX: Dùng để tạo và lấy dữ liệu từ cơ sở dữ liệu một cách nhanh chóng.

- Các hệ thống RDBMS hữu dụng trong  việc xử lí các dữ liệu được cấu trúc kỹ càng và hỗ trợ ACID – 4 thuộc  tính quan trọng của bất kì hệ thống cơ sở dữ liệu nào:

  - Tính nguyên tố (Atomicity). Một giao dịch có nhiều thao tác khác biệt thì  hoặc là toàn bộ các thao tác hoặc là không một thao tác nào được hoàn  thành. Chẳng hạn việc chuyển tiền có thể thành công hay trục trặc vì  nhiều lý do nhưng tính nguyên tố bảo đảm rằng một tài khoản sẽ không bị  trừ tiền nếu như tài khoản kia chưa được cộng số tiền tương ứng.
  - Tính nhất quán (Consistency). Một giao dịch hoặc là sẽ tạo ra một trạng thái mới  và hợp lệ cho dữ liệu, hoặc trong trường hợp có lỗi sẽ chuyển toàn bộ dữ liệu về trạng thái trước khi thực thi giao dịch.
  - Tính độc lập (Isolation). Một giao dịch đang thực thi và chưa được xác nhận phải bảo đảm tách biệt khỏi các giao dịch khác.
  - Tính bền vững (Durability). Dữ liệu được xác nhận sẽ được hệ thống lưu lại sao  cho ngay cả trong trường hợp hỏng hóc hoặc có lỗi hệ thống, dữ liệu vẫn  đảm bảo trong trạng thái chuẩn xác.

  Dữ liệu được lưu trữ và truy xuất dễ dàng bằng các lệnh truy vấn SQL. Cấu trúc dữ liệu cũng có thể được mở  rộng nhanh chóng, việc bổ sung thêm các dữ liệu mới cũng không ảnh hưởng tới các data có sẵn. Các RDBMS còn có khả năng cấp quyền truy xuất và  chỉnh sửa thông tin cho các loại người dùng khác nhau (admin, user,  khách vãng lai, etc.). 

#### 4.3.1.2.Cơ sở dữ liệu cột (Columnar Databases) : 

- Là một hệ thống quản lý cơ sở dữ liệu (DBMS) mà lưu trữ dữ liệu trong các cột hơn là trong hàng như DBMS quan hệ làm.

- Trong khi **relational database** được tối ưu cho việc  lưu trữ dữ liệu dưới dạng các dòng - tức dữ liệu của cùng một dòng sẽ  được lưu trữ gần nhau trong ổ cứng, việc này giúp tối ưu hoá cho các ứng dụng liên quan nhiều tới giao dịch. Thì **Columnar Database** lại lưu dữ liệu theo từng cột, việc này làm tăng quá trình lưu trữ và lấy  dữ liệu của từng cột trong database đặc biệt trong các ứng dụng nặng về  phân tích.

  ![image](https://github.com/DuongSon1107/VCC_Intern/assets/98730673/ee39f311-7e51-41a1-bd90-8a91d655ea27)


- Khi ta thực hiện một câu lệnh truy vấn có điều kiện WHERE trên 1 cột nào đó thì với **relational database**, nó phải tải lên tất cả các cột trong một dòng rồi tìm tới cột cần xác định điều kiện. Trong khi đó với **Columnar Database** thì DBMS chỉ cần tải lên đúng dữ liệu của 1 cột đó và thực hiện việc lọc. Từ đó tối ưu hơn do giảm thiểu được đáng kể lượng dữ liệu đi từ ổ cứng đến CPU, từ đó giảm được thời gian xử lý khi thực thi truy vấn.

#### 4.3.2.NoSQL Database 

#### 4.3.2.1.Key-Value Database

- **Key-Value Database**  ( hay còn được gọi là kho lưu trữ giá trị-khóa ), là loại cơ sở dữ liệu NoSQL trong đó dữ liệu được lưu trữ ở định dạng “key-value” và được tối ưu hóa để đọc và ghi dữ liệu đó. Mỗi key có  một giá trị xác định duy nhất trên toàn bộ datbase, từ đó có thể lấy  được value dựa theo key. Các giá trị có thể là các kiểu dữ liệu đơn giản như chuỗi và số hoặc các đối tượng phức tạp. 

![key-val](https://images.viblo.asia/9b1e1479-fcd2-452c-9dd0-818cc165e881.png)

- Về cơ bản key-value được coi là các bảng chỉ có 2 cột và không có tính  năng joins như các bảng trong SQL. Các cơ sở dữ liệu dạng này thường đơn giản, kích thước nhỏ, lưu phân tán tại nhiều nơi và lưu ở trong RAM  nhằm tăng tốc độ xử lý.
- Cơ sở dữ liệu key-value sử dụng cấu trúc chỉ mục (index) nhỏ gọn, hiệu quả để có thể định vị một giá trị theo khóa của nó một cách nhanh chóng và  đáng tin cậy, khiến chúng trở nên lý tưởng cho các hệ thống cần có khả năng tìm và truy xuất dữ liệu trong thời gian không đổi.
- “Value” có thể được lưu trữ dưới dạng  blob (Là kiểu dữ liệu của một cột trong bảng RDBMS, có thể lưu ảnh lớn  hoặc dữ liệu văn bảng như những thuộc tính.) và không cần schema định  sẵn.. Các giá trị này có thể được gán bất cứ loại giá trị nào:số, chuỗi, json, html, hình ảnh, video, danh sách,...
- Key-value database được sử dụng chủ yếu cho các trường hợp như : thông tin và thiết lập người dùng, truy cập dữ liệu ngẫu nhiên theo thời gian thực,..

#### 4.3.2.2.**Document Database**

- **Document Database** là một loại database lưu trữ dữ liệu dưới dạng tài liệu, là một phần mở rộng của key-value.Mỗi tài liệu lại có thể chứa nhiều trường dữ liệu và được lưu dưới dạng Json, Bson hoặc XML.Document giúp ánh xạ các đối tượng trong OOP sang database.

  

  ![img](https://redis.com/wp-content/uploads/2022/12/image-01-document-db-document-key-value.svg?&auto=webp&quality=85,75&width=1200)

  

- Các trường dữ liệu ở đây có thể là số, chuỗi, mảng, hoặc đối tượng, chính vì thế phù hợp để lưu trữ dữ liệu từ các nguồn khác nhau (dữ liệu bán cấu trúc) như từ web,cảm biến, hệ thống phân tán, ... 

- Các tính năng của document database:

  - **Document model:** Mô hình tài liệu là phổ biến, trực quan và cho phép phát triển phần mềm nhanh chóng.
  - **Flexible schema:** Schema linh hoạt cho phép mô hình dữ liệu thay đổi khi yêu cầu của ứng dụng thay đổi.
  - **Rich APIs and query languages:** Document database có API và ngôn ngữ truy vấn phong phú cho phép nhà phát triển dễ dàng tương tác với dữ liệu của họ.
  - **Distributed and resilient:** Document database có thể dễ dàng mở rộng theo chiều ngang và có khả năng chịu tải và phục hồi nhanh sau sự cố.

#### 4.3.2.2.** Graph Database**

- **Graph database** là một loại database NoSQL lưu trữ dữ  liệu dưới dạng đồ thị thay vì bảng hay tài liệu. Đồ thị là một cấu trúc dữ liệu bao gồm các đỉnh (nút) được kết nối với nhau bằng các cạnh (thể hiện cho mối quan hệ). Mỗi đỉnh có thể đại diện cho  một thực thể, chẳng hạn như một người, một địa điểm, hoặc một sản phẩm.  Mỗi cạnh có thể đại diện cho một mối quan hệ giữa hai thực thể, chẳng  hạn như bạn bè, hàng xóm, hoặc mua bán.

  ![What is a Graph Database? - Developer Guides](https://dist.neo4j.com/wp-content/uploads/graph-example.png)

- Các mối quan hệ cho phép dữ liệu trong kho chứa được liên kết trực tiếp với nhau và trong nhiều trường hợp được truy xuất chỉ bằng một thao tác.  Cơ sở dữ liệu đồ thị ưu tiên các mối quan hệ giữa dữ liệu.  Truy vấn các mối quan hệ nhanh chóng vì chúng được lưu trữ vĩnh viễn trong cơ sở  dữ liệu.

- Graph database được thiết kế để lưu trữ dữ liệu có nhiều mối quan hệ  phức tạp. Điều này làm cho chúng phù hợp để lưu trữ dữ liệu từ các lĩnh  vực như mạng xã hội, tài nguyên mạng, và phân tích dữ liệu, hệ thống gợi ý ...
