# Week 8

### 8.1. Tìm hiểu Shell linux

#### 8.1.1.Khái niệm

Khái niệm : **Shell là một chương trình cung cấp cho bạn một giao diện dòng lệnh (command-line interface) trên hệ điều hành Linux và các hệ điều hành tương tự UNIX**. Nó nhận thông tin đầu vào từ người dùng và thực hiện tập lệnh của các chương trình máy tính dựa trên những thông tin ấy. Khi một chương trình kết thúc việc thực hiện tập lệnh.

- **Shell** có thể được truy cập bởi người dùng bằng cách sử dụng **command line interface**. Một chương trình đặc biệt có tên **Terminal** trong linux/ macOS hoặc **Command Prompt** trong Windows OS, được cung cấp để nhập vào các lệnh có thể đọc được của người dùng như “cat”, “ls” etc. và sau đó nó được thực thi.

- Một số Linux Shell có sẵn. Nhập câu lệnh sau để tìm ra tất cả các shell có sẵn trên hệ thống

  ```html
  cat /etc/shells
  ```

- Tìm loại Shell đang sử dụng 

  ```html
  echo $0
  ```

![img](https://i.imgur.com/jeUn3DZ.png)

#### 8.1.2.Tìm hiểu các câu lệnh liên quan

##### **8.1.2.1.Các command cơ bản**

- **Lệnh cd**

  - Lệnh **cd** là dòng lệnh cơ bản của Linux giúp điều hướng qua các file và thư mục Linux.Tùy thuộc vào vị trí thư mục bạn đang làm việc hiện tại, lệnh này sẽ yêu cầu đường dẫn đầy đủ hoặc tên của thư mục

    ![img](https://i.imgur.com/BW0vuz3.png)

    ![img](https://i.imgur.com/WekMe0A.png)

  - Một số phím tắt giúp điều hướng nhanh chóng 

    `cd ..` để di chuyển đến thư mục cha (parent directory) của thư mục hiện tại 

    `cd`  để chuyển thẳng đến thư mục chính

    `cd -` để chuyển đến thư mục trước đó

- **Lệnh ls**

  - Lệnh **ls**  sẽ liệt kê tất cả thư mục và tập tin trong thư mục bạn đang  đứng

    ![img](https://i.imgur.com/M6cLaTX.png)

- **Lệnh cp**

  - Lệnh **cp**  giúp bạn có thể copy thư mục, tập tin từ thư mục này sang thư mục khác

![img](https://i.imgur.com/7aYFypG.png)

- **Lệnh mv**
  - Lệnh **mv** dùng để di chuyển file hoặc thư mục,cũng được dùng để đặt lại tên file hoặc thư mục

![image-20231211150315616](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231211150315616.png)

- **Lệnh mkdir**
  - Lệnh **mkdir** dùng để tạo mới 1 thư mục trống ở thư mục hiện tại

![img](https://i.imgur.com/Q2MEHLJ.png)

- **Lệnh cat**

  - Lệnh **cat** dùng để  xem nội dung của file hoặc tạo 1 file mới có nội dung từ file cũ

    ![img](https://i.imgur.com/T7Cpkwv.png)

  - Một số cách sử dụng lệnh cat khác :

    `cat > filename` tạo một file mới

    `cat file1 file2 > file3` kết hợp 2 file (1 và 2) và lưu trữ kết quả đầu ra của chúng trong một file mới

- **Lệnh head**

  - Lệnh **head** để xem các dòng đầu tiên của bất kỳ file văn bản nào. Mặc định là 10 hoặc có thể hiển thị tùy chọn bằng cách thêm -n number, number là số dòng muốn hiển thị

    ![img](https://i.imgur.com/W4iyD0C.png)

##### **8.1.2.2.Các command liên quan đến quyền**

- **Lệnh chmod**

  - **Lệnh chmod:** được sử dụng để kiểm quyền truy cập / cho phép của người dùng lên các tập tin và thư mục

    | #    | Permission               | rwx  |
    | ---- | ------------------------ | ---- |
    | 0    | none                     | 000  |
    | 1    | execute only             | 001  |
    | 2    | write only               | 010  |
    | 3    | write and execute        | 011  |
    | 4    | read only                | 100  |
    | 5    | read and execute         | 101  |
    | 6    | read and write           | 110  |
    | 7    | read, write, and execute | 111  |

![img](https://i.imgur.com/107idke.png)

- **Lệnh chown**
  - Lệnh **chown** dùng để thay đổi chủ sở hữu và nhóm sở hữu của 1 thư mục hoặc tập tin

`sudo chown newuser:newgroup example.txt` : Thay đổi chủ sở hữu của tệp tin "example.txt" thành "newuser" và nhóm thành "newgroup"

- **Lệnh ls -l**
  - Lệnh **ls -l** sử dụng để liệt kê thông tin chi tiết về các tệp tin và thư mục trong thư mục hiện tại hoặc được chỉ định

![img](https://i.imgur.com/lgMRkpF.png)

**8.1.2.3.Các command thực hiện song song**

`cat test.txt | wc -l` : đọc nội dung của tệp tin "test.txt" và đếm số dòng

![img](https://i.imgur.com/EnvO7nE.png)

`cat test.txt | grep "a"` : hiển thị những dòng trong tệp tin "test.txt" mà chứa chuỗi "a"

![image-20231211161330177](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231211161330177.png)

`cat test.txt | head` : hiển thị nội dung của tệp tin "test.txt" và sau đó giữ lại chỉ 10 dòng đầu tiên.

![image-20231211161717834](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231211161717834.png)

 `echo "aabb" > test.txt` tạo hoặc ghi đè nội dung vào tệp tin "test.txt".

![img](https://i.imgur.com/vQuWYLd.png)

`echo "cc" >> test.txt` để thêm nội dung "cc" vào cuối tệp tin "test.txt" mà không làm mất nội dung hiện tại của tệp tin

![img](https://i.imgur.com/cCvZlj8.png)

**8.1.2.4.Sử dụng Vim**

- **Tạo hoặc mở file** 

  ```
  vi <FileName>
  ```

- **Các chế độ trong Vim**

  | Chế độ       | Mô tả                                          | Cú pháp |
  | ------------ | ---------------------------------------------- | ------- |
  | Normal       | Mặc định; để điều hướng và chỉnh sửa đơn giản  | Esc     |
  | Insert       | Để chèn và sửa đổi văn bản rõ ràng             | i       |
  | Command Line | Đối với các hoạt động như saving, exiting, etc | :       |

- **Sửa đổi trong file**

Để chuyển từ chế độ **Normal** sang chế độ **Insert** ta ấn phím `i`, dưới cùng phía bên trái ta sẽ thấy **-- INSERT --**. Nghĩa là mình đang ở chế độ **Insert** và có thể chỉnh sửa văn bản.

Để lưu file ta cần thoát khỏi chế độ **Insert** bằng `ESC` rồi vào chế độ Command Line. Sau đó sử dụng cú pháp với mục đích khác nhau, các cú pháp cơ bản: 

| Câu lệnh      | Ý nghĩa                                           |
| ------------- | ------------------------------------------------- |
| :e filename   | Mở filename với editor                            |
| :w            | Lưu file                                          |
| :q            | Thoát Vim                                         |
| :q!           | Thoát mà không lưu                                |
| :x            | Viết vào file (nếu thay đổi đã được tạo) và thoát |
| :sav filename | Lưu file dưới tên (filename)                      |
| /word         | Tìm kiếm "word" từ trên xuống dưới                |
| :set number   | Đánh số thứ tự bên trái mỗi dòng                  |

**8.1.2.5.Quản lý tiến trình**

- **htop** là một công cụ quản lý tiến trình trực quan dựa trên giao diện dòng lệnh.Nó hiển thị một danh sách các tiến trình đang chạy cùng với các thông tin như CPU, bộ nhớ, thời gian chạy, và nhiều thông tin khác.
  - Htop chủ yếu có ba phần chính như sau:
    - Phần đầu: Nơi chúng ta có thể xem thông tin như mức sử dụng **CPU**, **Bộ nhớ** **RAM** , **Swap** và cũng hiển thị các tác vụ, **Load Average** và **Thời gian hoạt động** của máy chủ.
    - Phần thân: Danh sách các tiến trình được sắp xếp theo mức sử dụng **CPU**
    - Phần chân: Hiển thị các tùy chọn khác nhau như **trợ giúp**, **thiết lập**, **tiêu diệt tiến trình**, **thoát,** v.v.

![img](https://i.imgur.com/aeAS08o.png)

- **ps aux**

**ps** là lệnh hiển thị thông tin về các tiến trình.

**ps aux** hiển thị tất cả các tiến trình trong hệ thống cùng với các thông tin như ID tiến trình (PID), CPU, bộ nhớ, thời gian chạy, và nhiều thông tin khác.

![img](https://i.imgur.com/S1cVsdl.png)

- **Kill -9**

**Kill** được sử dụng để gửi một tín hiệu đến một tiến trình để kết thúc hoặc kiểm soát nó.

Sử dụng tín hiệu **Kill -9** , là một tín hiệu mạnh mẽ nhất, để bắt buộc tiến trình kết thúc ngay lập tức.

### 8.2. Yêu cầu tìm hiểu về docker

#### 8.2.1.Docker là gì 

- **Docker** là một dự án nguồn mở nó cho phép tự động hóa việc triển khai các ứng  dụng bên trong các Container (Linux), cung cấp chức năng đóng gói các thành phần cần để chạy ứng dụng vào Container.  
  - Là nền tảng cung cấp cho các công cụ, service để các developers, adminsystems có thể phát triển, thực thi, chạy các ứng dụng với containers.
  - Một nền tảng để cung cấp cách để building, deploy và run các ứng dụng một cách dễ dàng trên nền tảng ảo hóa - "Build once, run anywhere". 

- **Container**

  - Các containers cho phép lập trình viên đóng gói một ứng dụng với tất  cả các phần cần thiết, chẳng hạn như thư viện và các phụ thuộc khác, và gói tất cả ra dưới dạng một package.
  - Các gói container chỉ là một user space bao gồm ứng dụng, system binaries và libraries mà không cần guest OS hoặc ảo hóa phần cứng => làm cho các container nhẹ hơn (lightweight) , không mất nhiều thời gian khởi động

  ![img](https://images.viblo.asia/3e9d0b65-3973-4270-8f9e-c13af49e630c.png)

- **Cơ chế hoạt động** của Docker thông qua một Docker Engine có sự kết hợp của server và client .Hai thành phần này giao tiếp với nhau thông qua REST API
  - **Server** hay còn được gọi là docker daemon: chịu trách nhiệm tạo, quản lý các Docker objects như images, containers, networks, volume.
  - **REST API:** docker daemon cung cấp các api cho Client sử dụng để thao tác với Docker
  - **Client** là thành phần đầu cuối cung cấp một tập hợp các câu lệnh sử dụng api để người dùng thao tác với Docker.

![img](https://images.viblo.asia/b1c6a040-1dcd-4db7-aaa2-61cf563a730b.png)

- **Các khái niệm liên quan**
  - **Docker Engine** : là thành phần chính của Docker, như một công cụ để đóng gói ứng dụng
  - **Docker Hub** : là một “github for docker images”.  Trên DockerHub có hàng ngàn public images được tạo bởi cộng đồng cho  phép bạn dễ dàng tìm thấy những image mà bạn cần. Và chỉ cần pull về và sử dụng với một số config mà bạn mong muốn.
  - **Images**: là một khuôn mẫu để tạo một container. Một image sẽ được build dựa trên những  chỉ dẫn của Dockerfile.
  - **Container**: là một instance của một image. Bạn có thể create, start, stop, move or delete container dựa trên Docker API hoặc Docker CLI.
  - **Docker Client**: là một công cụ giúp người dùng giao tiếp với Docker host.
  - **Docker Daemon**: lắng nghe các yêu cầu từ Docker  Client để quản lý các đối tượng như Container, Image, Network và Volumes thông qua REST API. Các Docker Daemon cũng giao tiếp với nhau để quản  lý các Docker Service.
  - **Dockerfile**: là một tập tin bao gồm các chỉ dẫn để build một image .
  - **Volumes**: là phần dữ liệu được tạo ra khi container được khởi tạo.

![Docker là gì](https://topdev.vn/blog/wp-content/uploads/2019/05/docker.png)

- **Quy trình thực thi** 

  - **Build**

    Đầu tiên tạo một dockerfile, trong dockerfile này chính là code của  chúng ta. Dockerfile này sẽ được Build tại một máy tính đã cài đặt Docker Engine. Sau khi build ta sẽ có được Container, trong Container  này chứa ứng dụng kèm bộ thư viện của chúng ta.

  - **Push**

    Sau khi có được Container, chúng ta thực hiện push Container này lên cloud và lưu tại đó.

  - **Pull, Run**

    Nếu một máy tính khác muốn sử dụng Container chúng ta thì bắt buộc máy phải thực hiện việc Pull container này về máy, tất nhiên máy này  cũng phải cài Docker Engine. Sau đó thực hiện Run Container này.

![docker là gì](https://topdev.vn/blog/wp-content/uploads/2019/05/basics-of-docker-system.png)



### 8.3.Xây dựng một RestFul API đơn giản với python và Flask

- Viết một chương trình sử dụng rest api cơ bản(GET /ping và response về "pong") bằng flask python.Tạo file tên là app.py

```python
from flask import Flask

app = Flask(__name__)

@app.route('/ping', methods=['GET'])
def ping():
    return 'pong'

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)
```



- Tạo **Dockerfile** với nội dung như sau:

```
FROM python:3.9.2-alpine
WORKDIR /home/app
COPY requirements.txt requirements.txt
RUN pip install -r requirements.txt
ENV FLASK_APP=app.py
ENV FLASK_RUN_HOST=0.0.0.0
ENV FLASK_ENV=development
EXPOSE 5000
COPY . .
CMD ["flask", "run"]
```

- Tạo một file **requirements.txt** chứa dependencies của bạn

```
Flask==2.0.1
Werkzeug==2.0.2
```

- Sau đó ta xây dựng Docker image bằng lệnh 

  ```
  sudo docker build -t flask-rest-api .
  ```

  ![image-20231213161113861](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231213161113861.png)

- Sau khi xây dựng xong image, chạy container bằng lệnh

  ```
  sudo docker run -p 8080:5000 flask-rest-api
  ```

  ![image-20231213161203632](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231213161203632.png)

- Khi đó ta mở trình duyệt và truy cập vào địa chỉ ip trên và thêm /ping vào cuối, sau đó ta sẽ thấy trình duyệt phản hồi lại pong và xuất hiện dòng log trên terminal ghi lại mỗi lần có yêu cầu GET đến /ping

![img](https://i.imgur.com/CajCy3o.png)



![img](https://i.imgur.com/fJsn23t.png)
