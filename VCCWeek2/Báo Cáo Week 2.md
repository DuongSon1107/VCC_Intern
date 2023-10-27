#                                          **Báo Cáo Week 2**

### **2.1. Collections**

- **ArrayList**

  - Không như Array[] kích thước khai báo cố định,`ArrayList` trong java là một mảng động (có thể thay đổi kích thước) để lưu trữ các phần tử,là một lớp kế thừa lớp AbstractList và triển khai của List Interface  trong Collections Framework nên có một vài đặc điểm và phương thức tương đồng với List.Sử dụng ArrayList khi bạn cần một danh sách các phần tử có thứ tự với khả năng tồn tại các phần tử trùng lặp.

    - **Đặc điểm:** 

      -  Các phần tử có thể được thêm, xóa một cách linh động.
      -  Có thể chứa các phần tử trùng lặp
      -  Duy trì thứ tự của phần tử được thêm vào  
      -  Cho phép truy cập ngẫu nhiên vì nó lưu dữ liệu theo chỉ mục
      -  Không đồng bộ (non-synchronized)

    - **Phương thức sử dụng:**

      - Import gói thư viện `java.util` và khởi tạo ArrayList :

        ![image-20231024151351861](/VCCWeek2/png2/png1.png)

      - Sử dụng `add()` thêm các phần tử vào trong danh sách, ngoài ra có thể thêm phần tử vào vị trí mong muốn :

        ![image-20231024152702183](/VCCWeek2/png2/png2.png)

      - Thay đổi giá trị trong phần tử dùng phương thức `set()`:

        ![image-20231024152811319](/VCCWeek2/png2/png3.png)

      - Để lấy phần tử dùng phương thức `get()` và truyền vào vị trí muốn lấy: 

        ![image-20231024152941206](/VCCWeek2/png2/png4)

      - Xóa phần tử trong danh sách:

        ![image-20231024153535448](/VCCWeek2/png2/png5)

      - Dùng phương thức `size()` để lấy số lượng phần tử trong danh sách:

        ![image-20231024153613445](/VCCWeek2/png2/png6)
      - Sắp xếp các phần tử trong danh sách:

        ![image-20231024155606151](/VCCWeek2/png2/png7)

      - Sử dụng phương thức `indexOf()` để tìm kiếm phần tử trong danh sách, trả lại true nếu tìm thấy,false nếu không tìm thấy : 

        ![image-20231024160031829](/VCCWeek2/png2/png8)

      - Tìm kiếm vị trí xuất hiện (index) của phần tử trong danh sách.Sử dụng phương thức `indexOf()` ,nếu có trả lại vị trí index của phần tử, nếu không có trả về -1

        ![image-20231024160958515](/VCCWeek2/png2/png9)

      - Ngoài ra còn một số phương thức khác như :

        `toArray()`: Chuyển tập hợp ArrayList thành tập hợp Array

        `subList()`: Tạo ra một List mới với số lượng phần tử ít hơn và được chọn lọc từ một list có sẵn

        `addAll()`: Chuyển một ArrayList sang Set

        

  - **HashSet**

    - `HashSet` là một tập hợp (bộ sưu tập) sử dụng bảng băm để lưu trữ, trong đó các phần tử là duy nhất không bị trùng lặp nhau trong tập hợp.Nó kế thừa lớp AbstractSet và triển khai của Set Interface trong  Collections Framework nên nó sẽ có một vài đặc điểm và phương thức tương đồng với Set.Sử dụng HashSet khi bạn cần lưu trữ một tập hợp các phần tử duy nhất và kiểm tra nhanh chóng sự tồn tại của chúng.

    - **Phương thức sử dụng**

      - Khai báo của lớp `java.util.HashSet` trong java , khởi tạo HashSet:

        ![image-20231025135508400](/VCCWeek2/png2/png10)

      - Sử dụng `add()` thêm phần tử vào trong HashSet:

        ![image-20231025135524403](/VCCWeek2/png2/png11)

      - Xóa phần tử trong HashSet:

        ![image-20231025135836393](/VCCWeek2/png2/png12)

      - Dùng phương thức `size()`để lấy số lượng phần tử trong HashSet:

        ![image-20231025135903605](/VCCWeek2/png2/png13)

      - Sử dụng `isEmpty` kiểm tra HashSet có trống không: 

        ![image-20231025140044787](/VCCWeek2/png2/png14)

      - Sử dụng `contains()` để tìm phần tử chỉ định:

        ![image-20231025142145819](/VCCWeek2/png2/png15)

      - Chuyển đổi Set thành List:

        ![image-20231025142242143](/VCCWeek2/png2/png16)

      - Ngoài ra còn các phương thức khác như :

        + `boolean equals(Object o)`:So sánh các đối tượng được chỉ định với HashSet.

        + `int hashCode()`:Trả về giá trị mã băm

        + `Iterator iterator()`:Trả về một trình vòng lặp iterator để duyệt qua các phần tử của HashSet.

          

  - **HashMap**

    - `HashMap` được sử dụng để lưu trữ các phần tử dưới dạng key/value . Key và value là kiểu dữ liệu bất kỳ, và bạn có thể truy cập các giá trị của HashMap bằng một key cụ thể. Là một lớp kế thừa lớp AbstractMap và triển khai của Map Interface trong Collections Framework nên nó sẽ có một vài đặc điểm và phương thức  tương đồng với Map.Sử dụng HashMap khi cần liên kết các khóa với các giá trị và nhanh chóng truy xuất giá trị dựa trên các khóa.

    - **Đặc điểm**:

      - Các phần tử trong hashMap không sắp xếp theo thứ tự
      - Key là giá trị không được trùng lặp, mỗi key chỉ ánh xạ tới tối đa 1 value
      - Key và value có thể lưu trữ dưới các dạng khác nhau (String key, int value hoặc String value,int key) hoặc giống nhau (String key String value)

    - **Phương thức sử dụng**: 

      - Khởi tạo HashMap:

        ![image-20231025152308512](/VCCWeek2/png2/png17)

      - Phương thức ` put() ` được sử dụng để thêm phần tử( ngoài ra có thể sử dụng phương thức này để cập nhật giá trị của phần tử hashMap)

        ![image-20231025152405418](/VCCWeek2/png2/png18)

      - Ta có thể sử dụng `putAll()` để thêm tất cả phần tử của một hashMap sang hashMap khác:

        ![image-20231025152542256](/VCCWeek2/png2/png19)

      - Sử dụng phương thức `entrySet()` để trả về Collection view các ánh xạ có trong HashMap

        ![image-20231025153822074](/VCCWeek2/png2/png20)

        ![image-20231025153848754](/VCCWeek2/png2/png21)

      - Sử dụng phương thức `keySet()` để trả về một Set interface chứa tất cả các key của HashMap:

        ![image-20231025153951753](/VCCWeek2/png2/png22)

        ![image-20231025154001326](/VCCWeek2/png2/png23)

        ![image-20231025155956837](/VCCWeek2/png2/png24)

      - Xóa phần tử trong HashSet:

        ![image-20231025154705999](/VCCWeek2/png2/png25)

      - Dùng `replace()` thay thế giá trị của một key:

        ![image-20231025155054240](/VCCWeek2/png2/png26)

      - Phương thức `size()` trả về số lượng phần tử trong hashMap()

        ![image-20231025155603022](/VCCWeek2/png2/png27)
      - Ta có thể sử dụng `compute()` tính toán với các value ở dạng int :

        ![image-20231025160139277](/VCCWeek2/png2/png28)

      - Sử dụng `containsValue()` hoặc `ContainsKey()` trả về true hoặc false để kiểm tra value hoặc key chỉ định đã tồn tại trong hashMap chưa, phương thức ` get(key) ` để trả về giá trị của phần tử có key đã chỉ định :

        ![image-20231025160927326](/VCCWeek2/png2/png29)

        

- **So sánh**

  - **Giống** : `HashMap`, `HashSet`và `ArrayList`  đều là ba cấu trúc dữ liệu phổ biến trong Java được sử dụng để lưu trữ và quản lý các bộ sưu tập của các phần tử.

  - **Khác** :

    | ArrayList                                                    | HashSet                                                      | HashMap                                                      |
    | :----------------------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
    | Là một phần của Java Collections Framework và là một cấu trúc dữ liệu kiểu mảng động. | HashSet là một cài đặt của giao diện Set trong Java, cấu trúc dữ liệu kiểu bẳng băm | HashMap là một cài đặt của giao diện Map trong Java,cấu trúc dữ liệu kiểu bẳng băm |
    | Nó cho phép bạn lưu trữ và thao tác trên một danh sách các phần tử. | Nó lưu trữ một tập hợp các phần tử duy nhất (không có các phần tử trùng lặp). | Nó lưu trữ các cặp key-value, trong đó mỗi key được kết hợp với một giá trị. |
    | Các phần tử được sắp xếp và có thể được truy cập bằng chỉ mục của họ. | Các phần tử không được lưu trữ theo bất kỳ thứ tự cụ thể nào. | Key là duy nhất,nhưng các giá trị có thể trùng lặp.          |
    | Nó có thể chứa các phần tử trùng lặp.                        | Nó không cho phép bạn truy cập các phần tử theo chỉ mục vì nó không có thứ tự. | Các phần tử trong HashMap không có thứ tự; nếu bạn cần thứ tự, bạn có thể sử dụng TreeMap. |
    | Độ phức tạp là O(1) để truy cập các phần tử theo chỉ mục nhưng O(n) để tìm kiếm một phần tử. | Nó cung cấp độ phức tạp là O(1) cho việc thêm, xóa và kiểm tra sự tồn tại của các phần tử (trung bình). | Nó cung cấp độ phức tạp là O(1) cho việc thêm, truy xuất và xóa giá trị (trung bình) dựa trên key. |
    | Hiệu quả cho các thao tác như truy cập các phần tử theo chỉ mục và thêm hoặc xóa các phần tử ở cuối danh sách. | Nó phù hợp để kiểm tra sự tồn tại của các phần tử duy nhất và đảm bảo rằng một tập hợp không chứa các phần tử trùng lặp. | Nó phù hợp để lưu trữ và nhanh chóng truy xuất dữ liệu với một định danh duy nhất (key). |

- **Hashcode và equals**

  - **Phương thức `equals` :**
    - Được sử dụng để so sánh hai đối tượng xem chúng có bằng nhau (equal) hay không.Khi so sánh hai đối tượng với nhau, phương thức equals() trả về true nếu hai đối tượng bằng nhau hoặc trả về false nếu ngược lại .Mặc định, phương thức `equals` trong lớp Object so sánh địa chỉ bộ nhớ của đối tượng.
    - Khác với toán tử `==`, `equal` được thiết kế để so sánh hai đối tượng về mặt ngữ nghĩa (bằng cách so sánh các thành viên dữ liệu của lớp), trong khi toán tử == so sánh hai đối tượng về mặt kỹ thuật (bằng cách so sánh các tham chiếu của chúng, tức là địa chỉ bộ nhớ).

  - **Phương thức `hashCode` :** 
    - Được sử dụng để tính giá trị mã băm  (hash code) của một đối tượng. Mã băm này là một số nguyên được sử dụng  để xác định định danh của đối tượng trong các cấu trúc dữ liệu, lưu trữ các đối tượng này trong một thùng chứa nhỏ gọi là `buckets`.Mỗi bucket được liên kết với một mã băm và chỉ chứa các đối tượng có mã băm giống nhau.
    - Nhìn chung, mã băm được bộ sưu tập (Collections) sử dụng để lưu trữ và định vị các đối tượng một cách nhanh chóng và hiệu quả, vì bộ sưu tập dựa trên bảng băm (HashMap ,HashSet) không duy trì thứ tự các phần tử của nó.

  - Khi làm việc với Java Collections (bộ sưu tập), chúng ta nên Override phương thức hashCode và equals trong các lớp của các phần tử được thêm vào collection.Nếu không chúng ta sẽ bị nhận những hành vi và kết quả không mong muốn.
  - Hai phương thức này đều được định nghĩa bởi lớp Object, nghĩa là tất cả các lớp Java đều kế thừa lớp Object này.Tuy nhiên, các phương này cần ghi đè cụ thể đối với các lớp có đối tượng được thêm vào Collection, đặc biệt với các bộ sưu tập dựa trên bảng băm như HashSet và HashMap

  

  

  

  - **Ví dụ minh họa**:

    - **Equals:**

      Giả sử ta tạo class đối tượng Nhân viên với các thuộc tính và phương thức như sau:

      ![image-20231026204538337](/VCCWeek2/png2/png30)

    ​    Sau đó khởi tạo 2 đối tượng nhân viên và so sánh chúng bằng phương thức equals:

    ![image-20231026205405916](/VCCWeek2/png2/png31)

    Kết quả trả về:

    ![image-20231026205515151](/VCCWeek2/png2/png32)

    Như ta thấy,  2 đối tượng nhanvien2 và nhanvien3 được truyền tham số truyền vào giống nhau, nhưng khi so sánh bằng toán tử == hoặc phương thức equals() để so sánh 2 đối tượng này thì kết quả trả về đều là false. 

    Trong trường hợp này java không biết so sánh hai đối tượng này bằng nhau trên cơ sở là gì, vì vậy như đã nói, ta cần phải ghi đè phương thức equals để định nghĩa lại điều kiện so sánh giữa hai đối tượng như ta mong muốn, trong trường hợp này sẽ là name và id :

    ![image-20231026210130570](/VCCWeek2/png2/png33)

    Sau đó, khi sử dụng hàm equals để so sánh 2 đối tượng nhanvien2 và nhanvien3 sẽ trả về true, tức là bằng nhau ( do 2 đối tượng trùng name và id):

    ![image-20231026210504244](/VCCWeek2/png2/png34)

    Nhìn chung ,ghi đè phương thức `equals` quan trọng khi bạn muốn so sánh các đối tượng của lớp tùy chỉnh dựa trên nội dung của chúng thay vì chỉ địa chỉ bộ nhớ.

     - **hashCode** :

      Giả sử ta muốn đưa các đối tượng trên vào một Collections, ở đây ta sử dụng HashSet:

      ![image-20231026214330340](/VCCWeek2/png2/png35)

      Sau đó sử dùng hàm for each để duyệt từng phần tử trong hashSet và in ra thông tin, trước đó ta cần Override phương thức toString để hiển thị thông tin nhân viên:

      ![image-20231026214704532](/VCCWeek2/png2/png36)

      ![image-20231026214716226](/VCCWeek2/png2/png37)

      Kết quả hiển thị ra như sau:

      ![image-20231026215009768](/VCCWeek2/png2/png38)

      Như ta đã biết ở trong Collections HashSet chỉ lưu trữ các phần tử không trùng lặp , nghĩa là các phần tử trong HashSet phải là duy nhất, không giống nhau.

      Tuy nhiên trong trường hợp trên , 2 đối tượng nhanvien2 và nhanvien3 giống nhau đều có name là An và id=2 lại được chiếm 2 vùng nhớ trong Set và xuất hiện 2 lần, đơn giản vì mỗi đối tượng trên đều đang có giá trị hashCode khác nhau:

     ![image-20231026221143643](/VCCWeek2/png2/png39)

     ![image-20231026221233230](/VCCWeek2/png2/png40)

     Khi giá trị hashCode của 2 đối tượng khác nhau, khi đưa vào hashSet nó sẽ chiếm 2 vùng nhớ .Vì vậy để tránh trường hợp này ta cần override lại phương thức hashCode :

      ![image-20231026221706096](/VCCWeek2/png2/png41)

      Ở đây ta quy định hashCode sẽ trả về id của đối tượng, nghĩa là các đối tượng có id giống nhau thì hashCode sẽ khác nhau.Khi đó chạy lại chương trình ta sẽ được kết quả hiển thị:

      ![image-20231026221846469](/VCCWeek2/png2/png42)

      Khi đó hashSet sẽ chỉ còn lưu 1 đối tượng tên An có id là 2.

      Nhìn chung,nếu không ghi đè `hashCode`, mặc định phương thức `hashCode` của lớp Object sẽ trả về giá trị mã băm mặc định dựa vào địa chỉ bộ nhớ của đối tượng.Phương thức `hashCode` nên được ghi đè (override) nếu bạn  muốn đối tượng của lớp tùy chỉnh có cách tính toán mã băm đặc biệt. Nếu  hai đối tượng bằng nhau (dùng phương thức `equals`), thì mã băm của chúng phải giống nhau.           

    

### **2.2.Design Pattern**

- Design pattern là một mẫu thiết kế có sẵn, như một một hướng dẫn,một mô hình kiến trúc được sử dụng để giải quyết các vấn đề phổ biến trong lập trình. Các bản thiết kế được tạo sẵn này có thể tùy chỉnh để giải quyết vấn đề thiết kế định kỳ trong mã code, được phát triển và thử nghiệm qua thời gian, giúp giải quyết các vấn đề phức tạp một cách hiệu quả và giảm thiểu sự lặp lại trong thiết kế phần mềm. Mục tiêu của việc sử dụng design pattern là tạo ra mã nguồn dễ đọc, dễ bảo trì, mở rộng và tái sử dụng.

- Design Pattern gồm 23 mẫu được chia vào 3 nhóm chính

  - Creational Patterns: Cung cấp nhiều cơ chế tạo đối tượng khác nhau, giúp tăng tính linh hoạt và tái sử dụng mã hiện có.
    - Factory Method Abstract Factory, Builder, Prototype, Singleton
  - Structural Patterns: Giải thích cách tập hợp các đối tượng và lớp thành các cấu trúc lớn hơn, đồng thời giữ cho các cấu trúc này linh hoạt và hiệu quả.
    - Adapter, Bridge, Composite, Decorator, Facade, Flyweight và Proxy

  - Behavioral Patterns:Liên quan đến các thuật toán và phân công trách nhiệm giữa các đối tượng.
    - Interpreter, Template Method, Chain of Responsibility, Command,  Iterator, Mediator, Memento, Observer, State, Strategy và Visitor



###      2.2.1.Builder Pattern

![Builder design pattern](https://refactoring.guru/images/patterns/content/builder/builder-en.png)

- **Builder pattern** là một trong những **Creational pattern**. Builder pattern là mẫu thiết kế đối tượng được tạo ra để xây dựng  một đôi tượng phức tạp bằng cách sử dụng các đối tượng đơn  giản và sử dụng tiếp cận từng bước, việc xây dựng các đối  tượng đôc lập với các đối tượng khác.

- Một builder gồm các thành phần cơ bản sau:

  - **Product** : đại diện cho đối tượng cần tạo, đối tượng này phức tạp, có nhiều thuộc tính.
  - **Builder** : là abstract class hoặc interface khai báo phương thức tạo đối tượng.
  - **ConcreteBuilder** : kế thừa Builder và cài đặt chi tiết cách tạo ra đối tượng. Nó sẽ xác  định và nắm giữ các thể hiện mà nó tạo ra, đồng thời nó cũng cung cấp  phương thức để trả các các thể hiện mà nó đã tạo ra trước đó.
  - **Director**/ Client: là nơi sẽ gọi tới Builder để tạo ra đối tượng.

  ![image-20231027135634580](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231027135634580.png)

### 2.2.2.Adapter Pattern

![Adapter design pattern](https://refactoring.guru/images/patterns/content/adapter/adapter-en.png)

- Adapter Pattern (Người chuyển đổi) là một trong những Pattern thuộc  nhóm cấu trúc (Structural Pattern). Adapter Pattern cho phép các  inteface (giao diện) không liên quan tới nhau có thể làm việc cùng  nhau. Đối tượng giúp kết nối các interface gọi là Adapter.
- Adapter Pattern giữ vai trò trung gian giữa hai lớp, chuyển đổi  interface của một hay nhiều lớp có sẵn thành một interface khác, thích  hợp cho lớp đang viết. Điều này cho phép các lớp có các interface khác  nhau có thể dễ dàng giao tiếp tốt với nhau thông qua interface trung  gian, không cần thay đổi code của lớp có sẵn cũng như lớp đang viết.
- Một Adapter Pattern bao gồm các thành phần cơ bản sau:
  - **Adaptee**: định nghĩa interface không tương thích, cần được tích hợp vào.
  - **Adapter**: lớp tích hợp, giúp interface không tương thích tích hợp được với  interface đang làm việc. Thực hiện việc chuyển đổi interface cho Adaptee và kết nối Adaptee với Client.
  - **Target**: một interface chứa các chức năng được sử dụng bởi Client (domain specific).
  - **Client**: lớp sử dụng các đối tượng có interface Target.

### 2.2.3.Iterator Pattern

![Iterator design pattern](https://refactoring.guru/images/patterns/content/iterator/iterator-en.png)



- **Iterator Pattern** là một trong những Pattern thuộc  nhóm hành vi (Behavior Pattern). Nó được sử dụng để “Cung cấp một cách  thức truy cập tuần tự tới các phần tử của một đối tượng tổng hợp, mà  không cần phải tạo dựng riêng các phương pháp truy cập cho đối tượng  tổng hợp này”.

- Một Iterator được thiết kế cho phép xử lý nhiều loại  tập hợp khác nhau bằng cách truy cập những phần tử của tập hợp với cùng  một phương pháp, cùng một cách thức định sẵn, mà không cần phải hiểu rõ  về những chi tiết bên trong của những tập hợp này.

- Interator Pattern được áp dụng trong java với Interface iterator trong gói **java.util.Iterator**. Interface này định nghĩa các phương thức sau:

  - **Hàm next()** : trả về phần tử kế tiếp trong tập hợp
  - **Hàm hasNext()** : trả về giá trị True nếu vẫn còn phần tử trong tập hợp và trả về false trong trường hợp ngược lại.

- Các thành phần tham gia mẫu Iterator:

  - **Aggregate** : là một interface định nghĩa định nghĩa các phương thức để tạo Iterator object.
  - **ConcreteAggregate** : cài đặt các phương thức của Aggregate, nó cài đặt interface tạo  Iterator để trả về một thể hiện của ConcreteIterator thích hợp.
  - **Iterator** : là một interface hay abstract class, định nghĩa các phương thức để truy cập và duyệt qua các phần tử.
  - **ConcreteIterator** : cài đặt các phương thức của Iterator, giữ index khi duyệt qua các phần tử.
  - **Client** : đối tượng sử dụng Iterator Pattern, nó yêu cầu một iterator từ một  đối tượng collection để duyệt qua các phần tử mà nó giữ. Các phương thức của iterator được sử dụng để truy xuất các phần tử từ collection theo  một trình tự thích hợp.

  ![img](https://gpcoder.com/wp-content/uploads/2018/12/design-patterns-iterator-diagram.png)

### 2.3. Serializable 

- Serializable giúp chúng ta có thể chuyển đổi trạng thái của một Java object thành một định dạng nào đó để Java object này có thể được lưu trữ ở đâu đó và sau đó, nó sẽ được sử dụng bởi một tiến trình khác..Nói chung , Serialization trong Java. Việc này đảm bảo các đối tượng được lưu chính xác và khi chuyển đổi ngược lại chuẩn khi chung serialVersionUID.

- Để cho một object có thể sử dụng Serialization được,ta phải cho  object của chúng ta hiện thực một interface với tên gọi là **java.io.Serializable**.

  
