# Week 3

### 3.1. Exception

#### 3.1.1. Xử lý exception

- Exception là một sự kiện, một vấn đề bất thường xảy ra trong quá trình thực thi một chương trình Java,có thể dự đoán hoặc không dự đoán trước, nó làm phá vỡ cái **flow** (luồng xử lý) bình thường của một chương trình, thậm chí chết chương trình.
- Các ngoại lệ trong Java có thể phát sinh từ các loại tình huống khác nhau, chẳng hạn như người dùng nhập sai dữ liệu, lỗi phần cứng, lỗi kết nối mạng hoặc máy chủ cơ sở dữ liệu không hoạt động. Đoạn mã chỉ định những việc cần làm trong các tình huống ngoại lệ cụ thể được gọi là xử lý ngoại lệ.
- Ta phải bắt và xử lý các **ngoại lệ** trong chương trình. Nếu không chương trình sẽ bị dừng. Thường có thể bắt lại **Expection** trong lúc viết code hoặc dự đoán được Exception trong lúc chương trình đang chạy để từ đó  có thể xử lý các ngoại lệ đó mà chương trình vẫn tiếp tục chạy.

#### 3.1.2. Hệ thống các exception

![Exception ](https://levunguyen.com/images/post/javacore/exception.png)

- **Throwable** : là cha của tất cả **ngoại lệ** xảy ra trong chương trình bao gồm lỗi (**Error**) và ngoại lệ (**Exception**).
- **Error** : là tất cả những lỗi được bắt từ JMV (Máy ảo Java). Ví dụ  như Error OutOfMemory hoặc chia một số cho 0.
- **Exception** : là cha của tất cả class Check Exception.
- Trong Java có 2 loại exception: **checked** và **unchecked**. Tất cả các checked exception được kế thừa từ lớp **Exception** ngoại trừ lớp **RuntimeException**. RuntimeException là lớp cơ sở của tất cả các lớp unchecked exception,là các ngoại lệ sẽ không được java kiểm tra trong thời điểm biên dịch.
- Điểm khác biệt giữa các lớp checked và unchecked expcetion chính là thời điểm xác định được expcetion có thể xảy ra.

#### 3.1.3.Checked Exception và Unchecked Exception

- **Checked exceptions**

  - Đối với checked exception, việc kiểm tra được thực hiện ngay thời điểm  compile time, một số IDE sẽ giúp chúng ta bằng cách hiển thị lỗi cú pháp nếu ta gọi một method throw ra bất kỳ checked exception nào mà không  được catch. Một số checked exception tiêu biểu như: **IOException, InterruptedException, XMLParseException**..

  - Ví dụ xử lý checked exceptions:

    ```java
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        String sCurrentLine;
            br = new BufferedReader(new FileReader("/home/son/Intern/VCCWeek3/src/main/java/Testing.txt"));
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        }
    ```

- ##### Unchecked exception

  - Là loại exception xảy ra tại thời điểm thực thi chương trình, nó cũng có thể gọi là **runtime exceptions** đó là programming bugs, lỗi logic của chương trình… Loại exception này  được bỏ qua trong quá trình compile, không bắt buộc ta phải handle nó.

  - Các lớp extends từ RuntimeException được gọi là unchecked exception.

  - Ví dụ xử lý unchecked exception:dd

    ```java
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
    ```

### 3.2. Concurrency (optional):  

- **Thread** (luồng) về cơ bản là một tiến trình con  (sub-process). Một đơn vị xử lý nhỏ nhất của máy tính có thể thực hiện  một công việc riêng biệt

- **Multi-thread** (đa luồng) là một tiến trình thực hiện  nhiều luồng đồng thời. Một ứng dụng Java ngoài luồng chính có thể có các luồng khác thực thi đồng thời làm ứng dụng chạy nhanh và hiệu quả hơn.

  ```
  public class MyThread implements Runnable {
   //   private int threadNumber;
  //    public MyThread(int threadNumber){
  //        this.threadNumber = threadNumber;
  //    }
      private int numApple = 10;
      @Override
      public void run() {
          try {
              for (int i = 11; i > 0; i--) {
                  String name = Thread.currentThread().getName();
                  numApple = numApple - 1;
                  Thread.sleep(1000);
                  if (numApple < 0) {
                      System.out.println("No apple left");
                  } else {
  //                    System.out.println("Thread " + threadNumber + " eat one apple " );
                      System.out.println(name+ " eat one apple " );                }
              }
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
      }
      public static void main(String[] args) {
          MyThread thread1 = new MyThread();
          MyThread thread2 = new MyThread();
          Thread t1 = new Thread(thread1);
          Thread t2 = new Thread(thread2);
          t1.start();
          t2.start();
      }
  }
  ```

- **ThreadPool**

  - Thread được sinh ra để thực hiện một nhiệm vụ cụ thể, nhiều Thread  cùng xử lý công việc giúp chúng ta giải quyết được bài toán thời gian và hiệu năng khi xử lý một tác vụ nào đó.Câu trả lời là không phải cứ tạo nhiều Thread cùng hoạt động thì sẽ  đem lại hiệu năng cao vì mỗi khi có một Thread mới được tạo ra và được  cấp phát bộ nhớ bằng từ hóa new thì sẽ có vấn đề bộ nhớ và hiệu suất 

     -> có thể dẫn tới crash chương trình.Để giải quyết bài toán đó **ThreadPool** ra đời để giới hạn số lượng Thread  được chạy bên trong ứng dụng chúng ta cùng một thời điểm.

  - ThreadPool thường bao gồm một tập hữu hạn các luồng và một hàng đợi công việc (work queue) để lưu trữ các công việc đang chờ thực hiện. Công việc có thể được gửi đến ThreadPool để thực hiện bằng cách đặt chúng trong hàng đợi. ThreadPool sẽ tự động lấy công việc từ hàng đợi và giao cho luồng thích hợp để thực hiện. Khi công việc hoàn thành, luồng sẽ được trả lại cho ThreadPool để sử dụng cho các công việc khác.

    ```
    public class ThreadPool implements Runnable {
    
        private int numApple;
    
        public ThreadPool(int numApple){
            this.numApple=numApple;
        }
    
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" an qua tao  " + numApple);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" End.");
        }
        @Override
        public String toString() {
            return "ThreadPool{" +
                    "numApple=" + numApple +
                    '}';
        }
    }
    ```

  ```
  public class SimpleThreadPool {
  
      public static void main(String[] args) {
  
              ExecutorService executor = Executors.newFixedThreadPool(3);
              for (int i = 0; i < 10; i++) {
                  Runnable numAbpple = new ThreadPool(i);
                  executor.execute(numAbpple);
              }
              executor.shutdown();
              while (!executor.isTerminated()) {
              }
              System.out.println("Hoan thanh nhiem vu");
          }
      }
  ```

- **Lock** là một cơ chế được sử dụng để đạt được đồng bộ hóa và kiểm soát truy cập đa luồng vào tài nguyên hoặc phạm vi mã.Locks cho phép đặt và giải phóng một khóa (lock) để đảm bảo rằng chỉ một luồng có thể thực hiện một phần mã hoặc truy cập một tài nguyên tại một thời điểm. Locks được sử dụng để tránh xung đột giữa các luồng và đảm bảo tính nhất quán và đúng đắn trong các ứng dụng đa luồng.

  - Mục đích của **Lock**:
    1. Bảo vệ tài nguyên chia sẻ: Đặt khóa trước khi truy cập tài nguyên chia sẻ để đảm bảo rằng chỉ một luồng có thể thực hiện các hoạt động đối với tài nguyên tại một thời điểm.
    2. Đảm bảo tính đồng bộ hóa: Locks giúp đảm bảo rằng các luồng hoạt động một cách đồng bộ, đảm bảo tính nhất quán và đúng đắn trong các trường hợp đa luồng.
    3. Quản lý trạng thái và thứ tự thực hiện: Locks cũng được sử dụng để quản lý thứ tự thực hiện các luồng hoặc điều khiển trạng thái của luồng.
  - Một trong những triển khai phổ biến của Lock là `ReentrantLock`. Locks có thể được sử dụng để kiểm soát truy cập vào tài nguyên chia sẻ, tránh xung đột giữa các luồng và đảm bảo tính đồng bộ hóa trong các ứng dụng đa luồng.

- **AtomicInteger** là một lớp trong Java trong gói `java.util.concurrent.atomic` giúp thực hiện các phép toán trên số nguyên một cách nguyên tử (atomic) trong môi trường đa luồng. Điều này đảm bảo rằng các phép toán trên số nguyên sẽ không bị xung đột khi nhiều luồng cùng thực hiện chúng.

  - Là một công cụ mạnh mẽ cho việc thực hiện các phép toán trên biến nguyên trong môi trường đa luồng mà không cần sử dụng `synchronized` để đảm bảo tính đồng bộ. Nó được sử dụng rộng rãi trong lập trình đa luồng để tránh xung đột dữ liệu và đảm bảo tính nhất quán trong ứng dụng đa luồng.

  - **AtomicInteger** cung cấp các phương thức để thực hiện các phép toán như tăng giá trị, giảm giá trị, cộng, trừ, cộng dồn, so sánh và đổi giá trị, và nhiều phép toán khác mà bạn có thể cần trong môi trường đa luồng. Một số phương thức quan trọng của `AtomicInteger` bao gồm:

  ​            `get()`: Lấy giá trị hiện tại của `AtomicInteger`.

  ​            `set(int newValue)`: Đặt giá trị của `AtomicInteger` thành giá trị mới.

  ​            `    getAndIncrement()`: Tăng giá trị hiện tại lên 1 và trả về giá trị trước khi tăng.

  ​            ` getAndDecrement()`: Giảm giá trị hiện tại đi 1 và trả về giá trị trước khi giảm.

  ​             getAndAdd(int delta)`: Thêm giá trị delta vào giá trị hiện tại và trả về giá trị trước khi thêm.

  ​            compareAndSet(int expect, int update)`: So sánh giá trị hiện tại với giá trị mong đợi (expect) và nếu bằng nhau thì đặt giá trị mới (update).

- **Concurrent hashmap** là một lớp trong Java trong gói `java.util.concurrent`,cung cấp một Map an toàn cho hoạt động  của luồng. Có nghĩa là, nhiều luồng có thể truy cập Map cùng một lúc mà  không ảnh hưởng đến tính nhất quán của các mục trong Map. được  thiết kế để hỗ trợ việc thực hiện các hoạt động đọc và ghi trong môi  trường đa luồng một cách an toàn và hiệu quả. Nó là một phiên bản cải  tiến của `HashMap`, dành riêng cho các ứng dụng đa luồng

  - Bạn nên sử dụng ConcurrentHashMap khi bạn cần tính đồng bộ trong dự án của bạn.
  - Thread safe mà không cần đồng bộ hóa toàn bộ map.
  - Đọc có thể xảy ra rất nhanh trong khi ghi được thực hiện với một khóa.
  - Không có khóa ở cấp độ object.
  - ConcurrentHashMap không ném ra một ConcurrentModificationException  nếu một luồng cố gắng sửa đổi nó trong khi một luồng khác đang lặp qua  nó.
  - ConcurrentHashMap sử dụng vô số khóa.

### 3.3. json

- **JSON** là chữ viết tắt của **J**ava**s**cript **O**bject **N**otation, đây là một dạng dữ liệu tuân theo một quy luật nhất định mà hầu hết các ngôn ngữ lập trình đều có thể đọc được.JSON lưu trữ các dữ liệu theo cặp **khóa (key)** và **giá trị (value)**. So với XML thì JSON có định dạng đơn giản, dễ sử dụng và nhẹ hơn.

  - Sử dụng java parse json, lấy giá trị, chuyển jsonobject thành string

    ```java
    public static void main(String[] args) throws IOException {
        //chuyen object -> string
        JSONObject obj = new JSONObject();
    
        obj.put("name","Duong Son");
        obj.put("id",new Integer(20));
        obj.put("salary",new Double(100.21));
        obj.put("is_Student",new Boolean(true));
    
        StringWriter out = new StringWriter();
        obj.writeJSONString(out);
    
        String jsonText = out.toString();
        System.out.print(jsonText);
    }
    ```

  ```
  public static void main(String[] args) {
      //parse String -> object
      String jsonStr = "{\"name\":\"Duong Son\",\"salary\":100.21,\"id\":20,\"isStudent\":true}";
      Object obj = JSONValue.parse(jsonStr);
      JSONObject jsonObject = (JSONObject) obj;
  
      //Lay gia tri
      String name = (String) jsonObject.get("name");
      double salary = (Double) jsonObject.get("salary");
      long id = (Long) jsonObject.get("id");
      boolean isStudent = (Boolean) jsonObject.get("isStudent");
      System.out.println("name: " + name);
      System.out.println("salary: " + salary);
      System.out.println("age: " + id);
      System.out.println("isStudent: "+ isStudent);
  }
  ```

- **Gson** là một thư viện Java có thể được sử dụng để **chuyển đổi các đối tượng Java thành chuỗi JSON**. Nó cũng có thể được sử dụng để **chuyển đổi một chuỗi JSON thành một đối tượng Java** tương ứng. Gson có thể làm việc với các đối tượng Java tùy ý bao gồm  các đối tượng đã tồn tại từ trước mà bạn không có mã nguồn của nó.

  - Ví dụ :

    ```
    import com.google.gson.Gson;
    import java.util.ArrayList;
    import java.util.List;
    
    public class GsonEncode {
        public static void main(String[] args) {
            Gson gson = new Gson();
            List<String> animals = new ArrayList<>();
            animals.add("Cat");
            animals.add("Fish");
            animals.add("Chicken");
            animals.add("Bird");
            animals.add("Dog");
    
            // Serialization
            String jsonList = gson.toJson(animals);
            System.out.println(jsonList);
        }
    }
    ```

  ```
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
  ```

