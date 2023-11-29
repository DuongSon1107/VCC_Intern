#                                          Báo Cáo Week 5-6

### 5.1 **BigData**

- Big Data hay “dữ liệu lớn” là thuật ngữ chỉ về các tập dữ liệu khổng lồ  và phức tạp, đến mức khó có thể xử lý được bằng các phương pháp truyền  thống. Doanh nghiệp sử dụng lượng dữ liệu khổng lồ này để phân tích,  chuyển hóa thành thông tin quan trọng để giải quyết các vấn đề liên  quan.

-  Dữ liệu lớn thường bao gồm các tập dữ liệu mà các công cụ phần mềm  truyền thống (ví dụ: công nghệ SQL) không thể nắm bắt, sắp xếp, quản lý  và xử lý trong khoảng thời gian có thể chấp nhận được do kích thước  khổng lồ của tập hợp.

### 5.2 **Hadoop**

- Hadoop như là phần mềm thể hiện của BigData, nó là nền tảng cho phép phát triển,phân tán,phân tích các dữ liệu khổng lồ , mở rộng lưu trữ một cách miễn phí.Được thiết kế để mở rộng quy mô từ một máy chủ đơn sang hàng ngàn máy  tính khác có tính toán và lưu trữ cục bộ (local computation and  storage).

**Hadoop ecosystem**

- Hệ sinh thái Apache Hadoop có nguồn gốc là để **quản lý và truy cập dữ liệu** ,đề cập đến các thành phần khác nhau  của thư viện phần mềm Apache Hadoop,nó bao gồm các dự án mã nguồn mở  cũng như một loạt các công cụ bổ sung hoàn chỉnh khác.
- Theo thời gian, nền tảng Hadoop mở rộng kết hợp với một loạt các dự án  khác để thành một nền tảng hoàn chỉnh. Nền tảng này chia thành 5 loại  sau: **data access, data management, security, operations và governance.** 
-  Một số công cụ nổi tiếng nhất của hệ sinh thái Hadoop bao gồm HDFS, Hive, Pig, YARN,  MapReduce, Spark, HBase, Oozie, Sqoop, Zookeeper,…

![Hadoop ecosystem.webp](https://d2mk45aasx86xg.cloudfront.net/Hadoop_ecosystem_ad02acdfcf.webp)

- **HDFS** (Hadoop Distributed File System) là một trong những hệ thống lớn nhất trong hệ sinh thái Hadoop và là hệ thống lưu trữ chính của Hadoop, cung cấp khả năng lưu trữ tin cậy và chi phí hợp lí cho khối dữ liệu lớn, tối ưu cho các tập tin kích thước lớn 
- **HBASE** là một cơ sở dữ liệu dạng column-family, lưu trữ dữ liệu trên HDFS, được xem như là hệ quản trị CSDL của Hadoop.
- **MapReduce** là một lớp xử lý dữ liệu khác của Hadoop, có khả năng xử lý dữ liệu  có cấu trúc và phi cấu trúc lớn cũng như quản lý song song các tệp dữ  liệu rất lớn bằng cách chia công việc thành một tập hợp các nhiệm vụ độc lập (sub-job).
- **Apache Hadoop YARN** (Yet Another Resource Negotiator) được giới thiệu từ  Hadoop 2.0 là một công nghệ hỗ trợ quản lý tài nguyên và lập lịch công  việc trong Hadoop.

**Rise of BigData**

- Trong cuộc sống ngày nay, với công nghệ tiến độ hiện đại cho phép thu thập, lưu trữ và xử lý khối lượng lớn thông tin.Doanh nghiệp đã bắt đầu nhận ra số lượng dữ liệu người dùng được tạo ra thông qua các nguồn khác nhau như qua điện thoại, báo chí, cảm biến và các dịch vụ trực tuyến khác là rất lớn. Các mảng IoT và AI cũng được hưởng lợi từ BigData

- Dữ liệu ngày nay không chỉ do  con người tạo ra mà còn do máy móc tạo tự động. Big Data đã trở thành  một tài nguyên quý giá đối với các doanh nghiệp, đặc biệt là các doanh  nghiệp thương mại điện tử, giúp doanh nghiệp tăng lợi thế cạnh tranh và  phục vụ khách hàng tốt hơn . 

- Categories of Data

  - Có 3 loại dữ liệu trong Data:

     **Dữ liệu có cấu trúc** : dữ liệu có một số thuộc tính được tổ chức và xác định trước giúp tìm kiếm và phân tích 

​                     VD: dữ liệu trong cơ sở dữ liệu SQL

​             **Dữ liệu phi cấu trúc**: không được tổ chức và gán nhãn để xác định mối quan hệ có ý nghĩa giữa các dữ liệu, không có bất kì định nghĩa hoặc loại                       khái niệm nào,không thể chứa trong CSDL dạng hàng và cột, và nó cũng không có mô hình dữ liệu nào liên quan.

​                      VD: video , âm thanh, tệp văn bản, email, social media, ...

​         **Dữ liệu bán cấu trúc** : là kết hợp giữa dữ liệu có cấu trúc và phi cấu trúc, không có mô hình dữ liệu hoặc định nghĩa cấu trúc rõ ràng,có một số tính chất đồng nhất có thể xác định được,  nhưng lại không hình thành một cấu trúc rõ ràng và phù hợp với CSDL quan hệ.

​                      VD: JSON,XML

**Database Management System (DBMS)**

- DBMS là hệ thống quản lý cơ sở dữ liệu, là phần mềm cho phép người dùng tạo, duy trì và xóa nhiều cơ sở dữ liệu riêng lẻ.Nó cung cấp các dịch vụ và giao diện ngoại vi để người dùng cuối tương tác với cơ sở dữ liệu.

**Database**

- Cơ sở dữ liệu là một tập hợp dữ liệu có tổ chức và có cấu trúc, thường được lưu trữ và truy xuất dưới dạng điện tử,thường tồn tại trong một hệ thống quản lý cơ sở dữ liệu.

- 2 Loại database:

  - **Relational or SQL**  : Cơ sở dữ liệu quan hệ bao gồm dữ liệu được lưu trữ dưới dạng hàng trong  bảng. Các cột của bảng tuân theo một lược đồ xác định mô tả loại và kích thước dữ liệu mà một cột trong bảng có thể chứa.

    VD: Oracle, DB2, Microsoft SQL Server, PostgreSQL và MySQL.

  - **Non-Relational/NoSQL**:không có lược đồ cứng nhắc,NoSQL, dữ liệu phi cấu trúc và bán cấu trúc thuộc phạm vi quản lý của Dữ liệu lớn.bao gồm các kho lưu trữ khóa-giá trị (Redis, Amazon Dynamo DB), kho lưu  trữ cột (HBase, Cassandra), kho tài liệu (Mongo DB, Couchbase), cơ sở dữ liệu đồ thị (Neo4J) và công cụ tìm kiếm (Solr, ElasticSearch, Splunk). 

**Định nghĩa về BigData.**

- BigData được định nghĩa là những dữ liệu có độ đa dạng (**Variety**) lớn với khối lượng (**Volumes**) ngày càng tăng theo cấp số nhân và có tốc độ (**Velocity**) cao hơn bao giờ hết, đồng thời yêu cầu kiến trúc có thể mở rộng để lưu trữ, thao tác và phân tích hiệu quả. Những thuộc tính này còn được gọi là 3 V's trong bigdata

- Những bộ dữ liệu này quá lớn đến nỗi phần mềm xử lý dữ liệu truyền thống không thể quản lý chúng .Nhưng khối lượng dữ liệu khổng lồ này có thể được sử dụng để giải quyết các vấn đề kinh doanh mà trước đây không thể giải quyết được.

![img](https://lh7-us.googleusercontent.com/0yzWnVIsKWtGIZVSsymJe5KGTJOUTGOvHaBzULiHLTkYSrds_cWRCf1h7XrKo6nLeujhyDBoYf3ozB0jNRlo-6Ves1O01MzrlU-ivWEM9SsR6pSBauSODXel90pfv175jomUnnvEpuSQlIqCFK09Dw)

 

- **Volume**: là khối lượng dữ liệu có dung lượng lưu trữ vượt mức đảm đương của những ứng dụng và công cụ truyền thống, đây có thể là dữ liệu có giá trị không xác định, chẳng hạn như nguồn  cấp dữ liệu Twitter, luồng nhấp chuột trên trang web hoặc ứng dụng dành  cho thiết bị di động hoặc thiết bị hỗ trợ cảm biến. 
- **Velocity**: là tốc độ nhận và xử lý dữ liệu.Dung lượng gia tăng của dữ liệu rất nhanh và tốc độ xử lý đang tiến tới real-time. 
- **Variety**: hình thức lưu trữ và loại dữ liệu ngày một đa dạng hơn.Ngày nay hơn 80% dữ liệu trên thế giới được sinh ra là phi cấu trúc (tài liệu, blog, hình ảnh, video, voice v.v.). 

##### Data Warehouse (kho dữ liệu)

- Là một hệ thống lấy dữ liệu từ nhiều nguồn khác nhau về một tổ chức, chuyển đổi và lưu trữ dữ liệu đó cho mục đích báo cáo và phân tích,hỗ trợ các hoạt động kinh doanh thông minh (BI) 

- Kho dữ liệu nhằm mục đích thực hiện các truy vấn nhanh, phức tạp và phân tích trên tất cả dữ liệu, ngoài ra còn chứa một lượng lớn dữ liệu lịch sử. 

![img](https://lh7-us.googleusercontent.com/GCg8fhUmPxoqcj6I92i8vTxVbnSoprSivkXFCBEUOhmP4QwP-vTQrDWFGJMyywB7OWikakqG-XGmF1FGhMzmwZqhUQMRv9AuWcc8ir5e1Vwh7zqrpDufPJvvK8NGSYYp2AuEYBjXZ7Vh6K2aBP5jrQ)

- **Data Warehouse vs Database**

\- Data Warehouse sử dụng OLAP (Xử lý phân tích trực tuyến), được tối ưu hóa để xử lý số lượng truy vấn phức tạp thấp trên các tập dữ liệu lịch sử lớn tổng hợp.Được tối ưu hóa để tổng hợp và truy xuất các tập dữ liệu lớn.Trong kho dữ liệu,dữ liệu được sắp xếp thành một định dạng và có thể được kết hợp với các  nguồn dữ liệu khác cho phép xử lý nhanh hơn các truy vấn phức tạp.

\- Database sử dụng OLTP (Xử lý giao dịch trực tuyến) để xóa, chèn, thay thế và cập nhật số lượng lớn các giao dịch ngắn, trực tuyến.Được tối ưu hóa cho việc đọc/ghi ,tốc độ và hiệu quả mà dữ liệu được cập nhật (thêm, sửa đổi hoặc xóa) và cho phép phân tích và truy cập dữ liệu nhanh hơn.,Không phù hợp với các truy vấn phân tích phức tạp vì cần có số lượng bảng nối.

- **Data Warehouse vs DataLake**

\- Data Lake (hay Hồ dữ liệu) là một kho lưu trữ tập trung được thiết kế để lưu trữ, xử lý và bảo mật một lượng lớn dữ liệu có cấu trúc, bán  cấu trúc và phi cấu trúc

\- Data warehouse (Kho dữ liệu) được sử dụng để phân tích dữ liệu có cấu  trúc được lưu trữ, trong khi Data lake (Hồ dữ liệu) được sử dụng để lưu  trữ dữ liệu lớn của tất cả các cấu trúc.

\- Data Lake là một Data Warehouse thô rộng lớn, mục đích của nó vẫn  chưa được xác định. Data Warehouse là một kho lưu trữ dữ liệu có cấu  trúc, đã được lọc, đã được xử lý cho một mục đích cụ thể. 

### 5.3 **YARN**

- Framework dùng cho việc lập lịch và quản lý tài nguyên hệ thống,tương tự như một hệ điều hành của một cụm 
- Cụm là một tập hợp các máy tính được kết nối lỏng lẻo hoặc chặt chẽ hoạt động cùng nhau để được xem như một hệ thống duy nhất. 



![img](https://lh7-us.googleusercontent.com/ifI3ANtB5UyysyjMV8k08rR6T2D4Ope9dl7dTsNJJJuxdiWaMf6gaGn42FK2ZLbv5MKr4s1WYnyhNhyOlhLmV6cX0VGO_F0LPa9Sn3OUWwmOoBmBU6PdrcNEWHhqGfBGeT9V9buMHzYcpbNioyatOQ)

- Nhiệm vụ của Yarn :
  - Quản lý các tài nguyên cụm như máy tính, mạng và bộ nhớ
  - Lập kế hoạch và giám sát công việc
- Thành phần :
  - **Resource Manager**: có nhiệm vụ quản lý toàn bộ tài nguyên trong cụm, phân chia tài nguyên giữa tất cả các ứng dụng trong hệ thống, đồng thời cũng là đầu não quản lý  các NodeManager
  - **Applications Manager**:chịu trách nhiệm chấp nhận các job từ client và bắt đầu cấp phát tài nguyên cho một thực thể được gọi là ApplicationMaster
  - **Scheduler**: chịu trách nhiệm phân bổ các tài nguyên như disk, CPU, RAM,.. và các ứng dụng đang chạy mạng, tuân theo các hạn chế do hàng đợi và dung lượng áp đặt.  Bộ lập lịch không giám sát các ứng dụng cũng như không bắt đầu khởi động lại khi có lỗi ứng dụng hoặc phần cứng.
  - **Node Manager**:  là một tác nhân chạy trên mọi máy trong cụm.  Nó chịu trách nhiệm khởi  chạy các container trên máy đó và quản lý việc sử dụng tài nguyên của các container.  Nó báo cáo việc sử dụng trở lại thành phần Lập lịch biểu của Trình quản lý tài nguyên.

**Workflow**: Việc thực thi job sử dụng Hadoop YARN bao gồm 3 bước chính:

- Client submit application tới YARN

- YARN khời tạo ApplicationMaster tương ứng với chương trình đó.
- ApplicationMaster quản lý thực thi của chương trình trên các containers.              

![img](https://lh7-us.googleusercontent.com/7x8dpXZTZybhnsLgP3M-X_0nH21AwmI6KcCb96wpr_M8vXijPYlUcFeS6gQNYhne2QsP-FBJWPsSUA0hSDeoOW4D3z-zqPanmCrIakiaryP3cohTiMc-LXbhcaqb3t5ch_zeCXLBh7ocrMN6KG6kVQ)



- Horizontal vs Vertical Scaling:

  - Horizontal Scaling : (chia tỉ lệ theo chiều ngang) có nghĩa là chia tỷ lệ bằng cách thêm nhiều máy hơn vào nhóm tài nguyên

  - Vertical Scaling: (Chia tỉ lệ theo chiều dọc) có nghĩa là chia tỷ lệ bằng cách bổ sung thêm năng lượng (CPU, RAM) cho máy hiện có.

    

**Scheduling**: Việc lập kế hoạch của Yarn rất quan trọng vì cụm có nguồn tài nguyên hữu hạn để phân bổ cho jobs dựa trên một số chính sách

- FIFO Scheduler:

  - FIFO nghĩa là First In First Out, các job submit trước sẽ thực hiện trước, giống như trong hàng đợi. 

  - Không phù hợp với cụm dùng chung,một công việc lớn có thể cản trở việc thực hiện những công việc nhỏ hơn. 

  ![img](https://lh7-us.googleusercontent.com/VxpLx3VIfUkYTmAhdHphuOIc_P2HZ9aelF59B9JBkRd3MAVCqzoEMnrgTQiR8pzglGWjTzuyhrPcENehawdWkXCg3vT8szhRbYK1z6j63RIvkxkS4cvdTYweMiIeg1m0zF7V4-FkOOkwtSIW8bA59Q)

- Capacity Scheduler:

  - Chia tài nguyên trong YARN thành các queue, ứng dụng sẽ submit job lên các queue này,các queue sẽ được cấu hình một lượng tài nguyên nhất định và có thể sử dụng nhiều hơn cấu hình nếu có nhiều tài nguyên đang free.

    ![img](https://lh7-us.googleusercontent.com/glYTJB0HuiXudx2_mjvYcmhHaaTvqqd_VMKqNpTUOPYJQb24cVN8zqHUAl7sM09GesFpIeaFD70ZEk0TBcQD-_IPA0mqZQEk8a6af1gDkCt_CFPP5Py6qlAmNEyGbEKpj5hpXZX2NuLGuglNGRUAXw)

  - Cụm được chia làm hai queue A và B, có 2 job submit tương ứng 2 queue này, và chạy ngay khi được submit, điều này khắc phục tồn tại ở  FIFO Scheduler, các job có thể chạy song song đồng thời, cả job lớn lẫn  job nhỏ.  Tuy nhiên chúng ta sẽ phải cân đối tài nguyên giữa các queue,  phân chia hợp lý để đảm bảo các queue đủ tài nguyên chạy job của mình,  vì tài nguyên là hữu hạn nên khi tăng queue này đồng nghĩa với việc phải giảm tài nguyên của queue khác.

- Fair Scheduler:

  - Như tên gọi của nó, cố gắng phân bổ tài nguyên một cách công bằng giữa tất cả các ứng dụng đang chạy

  - Nếu job đầu tiên submit, nó sẽ chiếm toàn bộ tài nguyên trong cụm, đến  khi có job 2 submit, tài nguyên sẽ dần cân bằng lại 50% giữa 2 queue.

    ![img](https://lh7-us.googleusercontent.com/Ua1oocU3yIKmFZLmg8rXHxjE6yeULtFXuSsDXXvlvMYbIOYEj_1y7Lv72anVe2SFGWzeT5MOlFfGVT8XgJua7DxSIUcRVMUNAu3z-zW2GUzdGcCklb3tEH47v5141bjCD21assUvG1lJ5_PTxrxYTw)

​    

### 5.4 MapReduce

- Là một mô hình lập trình và một framework phân tán được thiết kế  để xử lý và phân tích đồng thời các tập dữ liệu khổng lồ một cách hợp lý trên các cụm máy tính phân tán, do đó loại bỏ các dữ liệu xấu và giữ lại thông tin cần thiết.

  ![img](https://lh7-us.googleusercontent.com/Ezjnwowktq7uX5b1U5CoTnh6WV4YkPaID5loaJsO3fRIy05bWlBJpTLDwXRKyu3faXYbwjTzEqlX-LTeaNaJxXPIMtoe8p3nNCNpXN8wKlgYNbVbmx9CYlO5f0LVR9c7YGPz82Tz1sIff1rZ7GuPdQ)

- MapReduce về cơ bản là một hệ thống xử lý hàng loạt và không phù hợp để phân tích tương tác.

- Bao gồm 2 giai đoạn :

  - Map: Trong giai đoạn này, dữ liệu đầu vào được chia thành các cặp key-value, và một hàm ánh xạ được áp dụng cho từng cặp, từ đó tạo ra danh sách các cặp key-value trung gian , không cần phải theo thứ tự.
  - Reduce: có nhiệm vụ tiếp nhận từ khóa trung gian và những giá trị tương ứng với  lượng từ khóa đó. Sau đó, tiến hành ghép chúng lại để có thể tạo thành  một tập khóa khác nhau.

  Ở giữa Map và Reduce thì còn 1 bước trung gian đó chính là **Shuffle**. Sau khi Map hoàn thành xong công việc của mình thì Shuffle sẽ làm  nhiệm vụ chính là thu thập cũng như tổng hợp từ khóa/giá trị trung gian  đã được map sinh ra trước đó rồi chuyển qua cho Reduce tiếp tục xử lý.

**Map** 

- Trong MapReduce, giai đoạn Map được thực hiện bởi một lớp Java gọi là  Mapper. Lớp này ánh xạ cặp key/value đầu vào thành một tập hợp các cặp  key/value trung gian.

  ![img](https://i.imgur.com/EjDrIrm.jpg)

- Hoạt động của map task:
  
  - Mỗi map task được thực hiện trên một phần input duy nhất, được gọi là input split,Input split là một phần nhỏ của dữ liệu đầu vào và mỗi map task sẽ xử lý một split này.
  - Đầu ra output được ghi vào bộ nhớ trong buffer (100MB).Nếu bộ nhớ đầy, một background thread sẽ chuyển nội dung của buffer vào một spill file trên đĩa.Dữ liệu trung gian này không bao giờ được ghi vào HDFS vì nó là tạm thời và sẽ được loại bỏ sau khi công việc hoàn thành thành công.
  - Spill file có một giới hạn dung lượng tối đa. Khi đạt đến giới hạn đó, một spill file mới được tạo ra.
  - Trước khi dữ liệu của map task được ghi vào đĩa, nó có thể được chia  thành các phân vùng. Phân vùng chỉ xảy ra khi số lượng reducers lớn hơn  một.Dữ liệu từ mỗi phân vùng được gửi đến một reducer task cụ thể.
  - Dữ liệu trong từng phân vùng được sắp xếp trong bộ nhớ theo key. Lưu ý  rằng việc sắp xếp xảy ra ở phía map, không phải ở phía reduce.Dữ liệu chỉ có thể được sắp xếp nếu các key có thể so sánh được với nhau.
  - Output của map task có thể được tổng hợp hoặc roll-up. Ví dụ, nếu có hai cặp key/value (1, toyota), chúng có thể được thay thế bằng một cặp  key/value (2, toyota)
  - Tệp output có thể được nén trước khi được viết ra để tiết kiệm không  gian đĩa và băng thông mạng khi được chuyển đến reduce task.
  - Output của một map task có thể cung cấp cho nhiều reducer task, và mỗi  reducer sẽ xử lý một phần của dữ liệu đã được sắp xếp từ map tasks.

**Reducer**

- Trong pha reducer của mô hình MapReduce, các task reduce xử lý đầu vào trung gian được tạo ra bởi các nhiệm vụ map.

  

  ![img](https://i.imgur.com/iuwJIIA.jpg)

### 5.5 HDFS

**Filesystem**

- Filesystem (hệ thống tệp) là một cơ chế tổ chức lưu trữ và truy xuất các file và dữ liệu của chúng trên phương tiện lưu trữ, đơn vị cơ bản của một hệ thống tệp là một tệp(file)
- Phân loại:
  - Disk File Systems
  - Tape File Systems
  - Network File Systems
  - Special Purpose File Systems

- Hệ điều hành thường hỗ trợ nhiều hơn một hệ thống tập tin.  Ví dụ: MacOS của Apple sử dụng APFS (Apple File System), thay thế hệ thống tệp trước đó có tên HFS+. 

**Distributed file systems**

- Hệ thống tệp phân tán (DFS) là một mô hình phân lớp hệ thống tập tin được phân tán trên nhiều máy. Sử dụng mạng để gửi/nhận dữ liệu và tạo ảo giác về hệ thống tệp cục bộ cho máy khách.

=>  Là hệ thống file hỗ trợ chia sẻ files và các tài nguyên trên mạng 

**Disk Block**

- Là đơn vị nhỏ nhất được ghi lại bởi đĩa hoặc hệ thống tệp

**File metadata**

- Metadata (siêu dữ liệu) của tệp là các thông tin mô tả về tệp mà không  phải là nội dung thực tế của tệp đó. Các thông tin này cung cấp các chi  tiết về thuộc tính, quyền truy cập, thời gian tạo và sửa đổi, và các thuộc tính khác của tệp

**i-Node**

- i-Node (index Node) là cấu trúc dữ liệu trong filesystem được dùng lưu trữ thông tin metadata và thông tin của vị trí dữ liệu trên phương tiện lưu trữ

**Mục tiêu HDFS**

- Hệ thống tệp phân tán Hadoop (HDFS) được thiết kế với các mục tiêu sau:
  - Lưu trữ các tệp lớn
  - Truy cập dữ liệu trực tuyến : ghi một lần, đọc nhiều lần 
  - Sử dụng phần cứng thông thường: không yêu cầu phần cứng chuyên dụng đắt tiền, khả năng chịu lỗi cao

**Hoạt động HDFS**

- Hai thành phần tạo nên HDFS:

  ![img](https://i.imgur.com/x9rDDfO.png)

  - Namenode: theo dõi tất cả dữ liệu lưu trữ trên HDFS ,lưu trữ metadata, quản lý không gian tên trên hệ thống tập tin và kiểm soát quyền truy cập của khách hàng vào các files 

  - Datanode: lưu trữ những dữ liệu thực tế,trực tiếp thực hiện và xử lý công việc ( đọc/ghi dữ liệu)

    ![img](https://lh7-us.googleusercontent.com/ob1m99BhBiavWD7lMDAE8Qcj9Ec2KlFiQpewSWSvotkRMjSMOWEnh5FatshBo1Njh2IIoCis8-h6e4lGiomD455_0u4wrTG_SE7qa-JQkHBEBU1oQP5VghNk66wq18goMek9OZAD2arL5M-LL1wz4Q)

-  Các tính toán hiệu quả hơn khi được thực hiện gần dữ liệu mà chúng hoạt động,giảm thiểu tắc nghẽn mạng và tăng thông lượng tổng thể của hệ thống.

- Hạn chế:

  - Truy cập dữ liệu có độ trễ thấp
  - Nhiều file nhỏ

**HDFS block**

- Blocks là một đơn vị lưu trữ của HDFS, các data được đưa vào HDFS sẽ  được chia thành các block có các kích thước cố định (nếu không cấu hình  thì mặc định nó là 128MB).

- Mỗi khối của HDFS được tạo ra từ các filesystem block

- HDFS có kích thước khối mặc định là 128 MB. Tuy nhiên, nếu lưu trữ một tệp 10 MB, nó sẽ chỉ chiếm 10 MB dung lượng ổ đĩa chứ không  phải 128 MB.  Việc lưu trữ tệp 1KB trong HDFS không có nghĩa là trên đĩa có một khối có kích thước tối thiểu 128MB được ghi.  

![img](https://lh7-us.googleusercontent.com/FN7hlEBLCcvPN1-vaA4hvHbu4qUaB2VHwl1aATarADaokFSLN9pJrqpXif_x-80N5ZU8ujb1eySgHWlINIROSno3pomO40_81XF7ZaiDHQOYzmETMsAKBNU7YGee-NVpiDCXtAjptoXhPewnAi5w2w)

- HDFS block là đơn vị nhỏ nhất mà name node có thể tham chiếu tới	

- Large block size: làm giảm áp lực bộ nhớ lên NameNode, giảm thời gian tìm kiếm, cải thiện thông lượng mạng,cải Thiện Hiệu Suất MapReduce

**Block Replication**

- Để đảm bảo khả năng chịu lỗi,chống lại dữ liệu bị hỏng hoặc mất, HDFS sao chép mỗi block ra nhiều bản ghi khác nhau (mặc định là 3).
- Việc sao chép đảm bảo rằng nếu một khối dữ liệu bị hỏng hoặc xảy ra lỗi phần cứng thì yêu cầu đọc vẫn có thể được thực hiện bởi một bản sao có  sẵn khác của block đó. 

**NameNode**

- NameNode là nơi lưu trữ thông tin metadata của cụm, bao gồm các thông  tin như vị trí, số lượng block của file, quyền truy cập vào file đó,…
- Namenode duy trì cây filesystem (hệ thống tệp) và tất cả metadata (siêu dữ liệu) cho tất cả các tệp và thư mục trong cây.
- Metadata trong NameNode được lưu trữ dưới dang 2 file:
  - Namespace Image File (FS Image): ảnh chụp nhanh siêu dữ liệu hệ thống tệp HDFS tại một thời điểm nhất định. .
  - EditLogs: Chứa thông tin các thay đổi gần đây nhất của cụm chưa có trong FSImage. nhật ký giao dịch hoặc nhật ký chứa các bản ghi cho mọi thay đổi xảy ra với metadata của hệ thống tệp sau hình ảnh FS gần đây nhất.

- Working of NameNode: Khi Namenode khởi động, nó chọn hình ảnh FS và áp dụng với nhật ký edit log để nhận trạng thái metadata mới nhất của hệ thống tệp.  Tiếp theo,  Namenode ghi trạng thái HDFS mới vào hình ảnh FS và bắt đầu hoạt động bình thường với một edit log trống.

**Secondary NameNode**

- Khi tiến trình NameNode được bật lên, nó sẽ gộp file editlog với fsimage để khôi phục trạng thái gần đây nhất của cụm(cluster), nếu kích thước của file editlog là lớn, việc gộp lại này sẽ rất lâu dẫn đến thời gian downtime  của hệ thống là lớn. Để tránh tình trạng này, SecondaryNamenode sinh ra  giúp làm giảm dung lượng của editlog, giúp quá trình khởi động của  NameNode nhanh hơn
- SecondaryNamenode hoạt động như một tiến trình hỗ trợ NameNode và không dùng để thay thế NameNode trong trường hợp bị lỗi. 
- Thông thường được chạy trên một máy khác
- Thường xuyên đọc các file, các metadata được lưu trên RAM của datanode và ghi vào ổ cứng.

**Single point of failure**

- Là thành phần trong hệ thống, sự cố của thành phần này có thể làm đổ gục toàn bộ hệ thống 
  => NameNode là một SPOF trong hệ sinh thái hadoop, nếu NameNode gặp sự cố , toàn bộ hệ thống sẽ trở nên không khả dụng (mapreduce, đọc ghi tệp)

- Khắc phục : 
  - Using backups : sao lưu metadata file , đặc biệt là namespace image file và editlog file .
  - Using Secondary Namenode : duy trì một bản sao của hình ảnh FS, nhưng trạng thái của nó thường chậm hơn so với NameNode chính.
  - Using Standby Namenode

**DataNode**

- Là nơi lưu trữ dữ liệu vật lý, đây là nơi lưu trữ block của file.
- Có nhiệm vụ báo cáo tình trạng đến NameNode, thông báo về danh sách các block mà nó quản lý.

**Writing and Reading**

- Cơ chế ghi file trong HDFS 

  - Lúc đầu, máy khách sẽ đệm dữ liệu trên đĩa cục bộ.  Nó chờ tích lũy một khối dữ liệu HDFS trước khi liên hệ với Namenode. 

  - Namenode, sau khi được khách hàng liên hệ, sẽ xác minh xem tệp có tồn tại hay không và khách hàng có  các quyền cần thiết để tạo tệp đó hay không.  Nếu các bước kiểm tra này  vượt qua, Nút tên sẽ thực hiện thay đổi tương ứng trong không gian tên  của nó.  Sau đó nó trả về cho khách hàng một danh sách các DataNodes để  ghi vào.  Các DataNode này lưu trữ các khối (và bản sao của chúng) tạo  nên tệp. 

  - Khi nhận được danh sách từ Namenode, máy khách bắt đầu ghi vào DataNode đầu tiên. 

  - DataNode đầu tiên đó nhận dữ  liệu từ máy khách theo từng phần.  Nó nhận phần đầu tiên, ghi nó vào kho lưu trữ cục bộ và sau đó bắt đầu chuyển phần đó sang DataNode thứ hai  trong danh sách. 

  - DataNode thứ hai nhận dữ liệu  từ DataNode đầu tiên, ghi vào kho lưu trữ cục bộ của nó và bắt đầu  chuyển phần đó sang DataNode thứ ba trong danh sách. 

  - Một đường truyền dữ liệu được  hình thành từ máy khách đến tất cả các DataNode có liên quan.  Một  DataNode có thể đồng thời nhận và truyền dữ liệu. 

    ![img](https://i.imgur.com/nSFjiAX.png)

- Cơ chế đọc file trong HDFS 

  - Client bắt đầu yêu cầu đọc khi thực hiện lệnh gọi RPC đến NameNode để truy xuất vị trí của một vài khối đầu tiên của tệp mà máy khách muốn đọc.
  - NameNode trả về danh sách địa chỉ của DataNode cho từng khối được yêu cầu, danh sách được trả về cho mỗi khối bao gồm các Datanode với một bản sao của khối (metadata).
  - Khi client nhận được thông tin metadata của DataNode, nó cũng nhận được object FSDataInputStream, object này chứa DFSInputStream chịu trách nhiệm giao tiếp với DataNode. Client gọi phương thức read() khiến DFSInputStream khời tạo kết nối đến DataNode.
  - Dữ liệu được client gọi liên tục qua phương thức read() cho đến cuối của block.
  - Khi đọc xong một block, client tiếp tục đọc đến các block tiếp theo.
  - Khi đã đọc xong hết các block, client đóng kết nối với phương thức close().
  - Khi NameNode gửi thông tin DataNode chứa block cho client, NameNode ưu tiên chọn replica ở vị trí gần với client nhất để gửi tin. Việc này giảm thiểu tốc độ băng thông.

![img](https://i.imgur.com/ZfsKjsJ.png)

**High Avaibility**

- Tính sẵn sàng cao (High Availability - HA) là một khái niệm quan trọng  trong các hệ thống phân tán, đặc biệt là khi xử lý dữ liệu lớn như trong hệ thống Hadoop
- Mục tiêu của HA là đảm bảo rằng hệ thống có khả năng  tiếp tục hoạt động mà không gián đoạn, ngay cả khi một số thành phần của hệ thống gặp sự cố. 

​    => Trong HDFS, cần nhiều phiên bản Namenode để tránh thời gian ngừng hoạt động và lỗi trong quá trình nâng cấp phần mềm/phần cứng.

- Trong mô hình HA, có 2 Namenode:

  - Một Active Namenode phục vụ các truy vấn của khách hàng, 
  - Còn lại là standby Namenode (là bản sao của Active) , nếu active Namenode bị lỗi, standby Namenode sẽ tiếp quản.

- Hoạt động :

  - Để standby Namenode tiếp quản thành công trong trường hợp active Namenode xảy ra lỗi, nó bắt chước chính xác các hành động được thực hiện bởi active Namenode đang hoạt  động ở trạng thái không gian tên của nó.Điều này được thực hiện bằng cách triển khai JournalNodes.  

  - Giống như một cuốn nhật ký chỉnh sửa của hệ thống (edit logs), JournalNodes lưu giữ bản ghi tất cả những  thay đổi mà Namenode đang hoạt động thực hiện trên không gian tên của  nó.  Vì đây là hệ thống phân tán nên các thay đổi được ghi lại vào phần  lớn các JournalNodes.  Chúng tôi cần nhiều hơn một JournalNode để ghi  lại các hoạt động của Namenode vì bản thân JournalNode rất dễ bị lỗi.

  - Khi active Namenode ngừng hoạt động, standby Namenode bắt đầu sao chép từ JournalNodes,tất cả các sửa đổi được thực hiện bởi Namenode đang hoạt động sang trạng thái siêu dữ liệu (metadata) của nó. Standby Namenode sau đó áp dụng các thay đổi cho trạng thái của chính nó.

    ![img](https://lh7-us.googleusercontent.com/NYUtUCKwCVixF8sNY1q_YG2uQkPh2-4ljlGnlcLnsciOKancJk69gNhP4m3fmW8o3nur8eBxEsxuw6Epr5hCfSCijGcpf4oZVc0cEx8HVhTfatbLQU18-N82kZcy7_tjx41quPVe8vnB8XPYu7N98g)

  - Số lượng JournalNode:

    - Đối với số lượng JournalNodes chẵn, chúng ta cần chạy ít nhất ba để đảm bảo tính sẵn sàng cao.
    - Công thức để xác định số lượng JournalNodes có thể gặp sự cố mà hệ thống vẫn có thể sử dụng là: (N - 1) / 2, với N là số lượng JournalNodes.



### 5.6 Spark

- Nền tảng phổ biến để xử lý dữ liệu và đã dần thay thế MapReduce truyền thống. 
- Nhược điểm Mapreduce so với Spark
  - Lặp lại job : các công việc lặp lại ( thuật toán) phải thực hiện nhiều lần trên tập dữ liệu để tính kết quả , tăng thời gian thực hiện do I/O disk
  - Phân tích tương tác : mỗi truy vấn SQL tương tác trên tập dữ liệu lớn có thể chuyển đổi thành một công việc MapReduce riêng biệt,dẫn đến việc nhiều công việc MapReduce phải đọc dữ liệu từ đĩa, làm tăng độ trễ thực hiện truy vấn.
  - Nhiều APIs : việc biểu diễn các hoạt động phức tạp thường đòi hỏi nhiều dòng mã.

**Architecture (kiến trúc)** : kiến trúc chủ-nô lệ giống như MapReduce

- Driver
- Executor

- Driver :  quản lý việc thực hiện job của Spark , duy trì state , phân phối và lập lịch cho các executor 
- Executor: tiến trình thực thi mã được gán bởi driver, báo cáo state tính toán của tiến trình này cho driver.

![img](https://i.imgur.com/DkrJ7la.png)

- Quản lý cụm (cluster manager)

  - Spark job chạy trên một cụm máy, nhưng Driver không có khả năng phân bổ tài nguyên cluster để thực hiện job. Driver của Spark cần đám phán tài nguyên với trình quản lý cụm để khởi chạy quy trình executor

  - Spark tương thích với các cụm :

    - Hadoop YARN

    - Apache Mesos

    - Built-in standalone cluster manager

    - Kubernete

    - Local mode

      ![](https://lh7-us.googleusercontent.com/pk4jQW9tKxdspWgDNG5zfJd0ZSwiUqS37HSmUZcQ4Qbwr-634ksYX3NYwLVhF8XM0gFVPCZpU-40H97EpmPltUe96opJj1U7R0cz_dtAfzOIDoqe_AQjj2-lxWkZTwKXDdXn1na7zE5I3SraWV8mgA)

  - Cụm Spark không phụ thuộc vào các thành phần Hadoop và có thể quản lý tài nguyên của mình mà không cần sự can thiệp từ YARN.

  - Trong môi trường cụm độc lập, driver Spark đảm nhận vai trò người quản lý cụm

- Execution mode

  - Spark có 2 chế độ excutor 

  - Cluster mode: ở chế độ này , người dùng gửi application Spark cho người quản lý cụm (cluster manager). Người  quản lý cụm lần lượt sinh ra driver và executor xử lý các node để thực thi job.Cả driver và executor đều nằm trong cụm .

    ![img](https://i.imgur.com/LWprJWR.png)

  - Client mode: driver nằm trên máy khách được sử dụng để gửi job bên ngoài cluster,máy khách chịu trách nhiệm duy trì quy trình trình điều khiển, trong khi cụm chịu trách nhiệm duy trì các quy trình thực thi.

    ![image-20231128152806992](/home/son/snap/typora/86/.config/Typora/typora-user-images/image-20231128152806992.png)

**Vòng đời** 

- User gửi job đến cluster : spark submit . Nếu công việc được chấp nhận, Resource Manager sẽ tạo driver Spark trên một trong các máy trong cụm.
- Quy trình driver thực hiện code của người dùng, giao tiếp với trình quản lý cụm (RM) .Code này thiết lập SparkSession để lập cụm Spark (driver and excutor)
- RM khởi chạy các excutor trên các node trên cụm và trả lại vị trí các executor cho driver,Spark được thiết lập và driver có thể giao tiếp với drivers
- Driver sẽ giao nhiệm vụ cho các quy trình executor  và bắt đầu thực hiện công việc.  
- Driver exit khi Spark job hoàn thành

**Spark API** 

- Spark cho phép xử lý dữ liệu phân tán thông qua các phép biến đổi chức năng của bộ sưu tập dữ liệu (RDD). 
-  API Spark giảm đáng kể kích thước  của chương trình so với các khung khác như MapReduce. 
-  Ba bản tóm tắt dữ liệu có sẵn trong Spark là:
  - **Resilient Distributed Datasets**
  - **DataFrames**
  - **Datasets**
- DataFrames và Datasets thuộc các API có cấu trúc cấp cao hơn trong khi RDD được gọi là các API không có cấu trúc cấp thấp.

- **Resilient Distributed Datasets (RRD)**

  - Là một cấu trúc dữ liệu cơ bản  của Spark,đại diện cho tập dữ liệu phân tán,là một tập hợp các đối tượng hoặc bản ghi chỉ đọc (không thay đổi), được phân vùng trên cụm có thể được vận hành song song.

  - **Resilient** ( khả năng phục hồi) :có nghĩa là RDD có khả năng chịu lỗi và có thể tính toán lại các phân vùng bị thiếu hoặc bị hỏng do lỗi nút.
  - **Distributed** (Phân phối): có nghĩa là dữ liệu tạo nên RDD được trải rộng trên một cụm máy.
  - **DataSet** (Bộ dữ liệu) : đề cập đến cách trình bày các bản ghi dữ liệu làm việc 
  - Có hai cách để tạo RDDs:
    - Tạo từ một tập hợp dữ liệu có sẵn trong ngôn ngữ sử dụng như Java, Python, Scala.
    - Lấy từ dataset hệ thống lưu trữ bên ngoài như HDFS, Hbase hoặc các cơ sở dữ liệu quan hệ.
  - RDD là bất biến, nghĩa là chúng không thể sửa đổi được.  **Transformations** được áp dụng trên RDD để tạo ra RDD mới,**Actions** được áp dụng để tạo ra kết quả

- **DataFrame**

  - Đại diện cho một bảng có các hàng và cột.  Mỗi cột có một loại xác định được duy trì trong một lược đồ.
  - Hiểu đơn giản DF giống như 1 bảng trong hệ CSDL quan hệ. Có các trường,  được định sẵn kiểu dữ liệu, và tập hợp các bản ghi. Tuy nhiên 1 DF có  thể đại diện cho lượng dữ liệu lớn hơn rất nhiều so với các bảng trong  DB
  - DataFrame được chia thành các phần nhỏ hơn gọi là phân vùng.  Phân vùng  là tập hợp các hàng từ DataFrame gốc nằm trên một máy vật lý cụ thể trên cụm.
  - Với một phân vùng duy nhất, chỉ một người thực thi duy nhất có thể xử lý dữ liệu, ngay cả khi có sẵn hàng trăm phân vùng.

- **DataSet**

  -  Là một bộ sưu tập các đối tượng được xác định rõ kiểu, không bị thay đổi, được ánh xạ vào một schema quan hệ.
  -  Datasets là một API có kiểu cấu trúc, chủ yếu hỗ trợ trong các ngôn ngữ như Java và Scala
  -  Tính năng chính của Dataset là sử dụng bộ mã hóa để chuyển đổi các loại dữ liệu JVM thành biểu diễn bảng của Spark SQL, cung cấp hiệu suất  tối ưu và quản lý bộ nhớ hiệu quả.
  -  Các loại dữ liệu được xác định trước, và bộ mã hóa tạo mã tùy chỉnh để tuần tự hóa và giải tuần tự hóa dữ liệu.
  - Khác biệt với DataFrame:
    - Kiểm tra kiểu tại thời điểm biên dịch (compile time). Các kiểu phải tuân thủ định dạng được xác định trước.
    - Sử dụng bộ mã hóa để chuyển đổi kiểu dữ liệu JVM thành biểu diễn Spark  SQL, cung cấp hiệu suất tối ưu hóa và quản lý bộ nhớ hiệu quả.
    -  DataFrames có thể được coi là DataSet thuộc loại Hàng, là biểu diễn  trong bộ nhớ nội bộ và được tối ưu hóa của Spark để tính toán.
  - Các trường hợp sử dụng:
    - Một số thao tác không thể được biểu thị bằng DataFrames
    - Yêu cầu an toàn về kiểu dữ liệu (Type-safety)
    - Sử dụng lại dễ dàng trong cả công việc phân tán và cục bộ

**RDD Operations**

- RDD hỗ trợ 2 loại operations:
  - **transformations**: tạo tập dữ liệu mới từ tập dữ liệu hiện có
  - **actions**: trả về giá trị cho chương trình điều khiển sau khi thực hiện tính toán trên tập dữ liệu
- Tất cả **transformations** trong Spark đều **lazy**: các transformations không tính toán kết quả ngay lập tức, thay vào đó nó nhớ phép biến đổi  được áp dụng cho tập dữ liệu, Transformations chỉ thực hiện tính toán  khi actions yêu cầu một kết quả trả về.

**Anatomy of a Spark Application** (Cấu trúc của một ứng dụng Spark)

- Spark Application bao gồm một hoặc một số jobs ( công việc ). Mỗi job được tạo thành từ một biểu đồ tuần hoàn có hướng của stages (giai đoạn ). Một stage được chia thành các task (nhiệm vụ) theo thời gian chạy Spark và được thực thi song song trên các phân vùng của RDD trên cụm.

  ![img](https://i.imgur.com/z47HJYF.png)

- Một ứng dụng Spark có thể chạy một hoặc nhiều jobs một cách tuần tự và song song
- Đầu ra RDD được lưu trong bộ nhớ đệm từ một job có thể được cung  cấp cho một công việc khác mà không yêu cầu I/O đĩa ở giữa.  Điều này  làm cho một số tính toán nhất định cực kỳ nhanh chóng. 
- Spark-shell là một phiên bản của Spark App.

### 5.7.MISC

**Zookeeper**

- ZooKeeper ZooKeeper là một dịch vụ cho các hệ thống phân tán cung cấp giá trị khóa phân cấp, được sử dụng để cung cấp dịch vụ cấu hình phân tán, dịch vụ đồng bộ hóa và đăng ký đặt tên cho các hệ thống phân tán lớn. 

- Khối xây dựng cơ bản của Zookeeper là znode.  Một znode có thể lưu trữ dữ liệu (như một tập tin) hoặc có các znode con (như một thư mục).Thiết kế tổng thể của Zookeeper cung cấp một hệ thống có tính sẵn sàng  cao bao gồm các znode tạo nên một namespace có thứ bậc 

  ![img](https://lh7-us.googleusercontent.com/e6AnCv5SK4QDoQp1TSLFLqXfBoNcqWKbBmjrP92YH5kNGdYY7Uxkj8HCUo-rIHxCS9rmTFKakrivCGTQP413gO_y9N23xwHxeFa3qO9-0N6uRNBDGa2HALC9Lp0Al95azo_Zj5feD8K7iBt3vVlDpA)

- Zookeeper có thể được chạy như một máy chủ duy nhất ở chế độ độc lập  hoặc trên một cụm máy ở chế độ sao chép, được gọi là quần thể

- Tính sẵn sàng cao ở chế độ sao chép đạt được bằng cách đảm bảo các sửa  đổi đối với cây znodes được sao chép thành phần lớn của quần thể.  Nếu  một số ít máy trong nhóm bị lỗi thì ít nhất một máy đang hoạt động trong nhóm sẽ có trạng thái mới nhất.

  

- Zookeeper sử dụng giao thức tên là Zab, hoạt động theo 2 giai đoạn:
  - Giai đoạn 1 (lựa chọn leader) :  lựa chọn một người đứng đầu, các máy chủ khác trở thành người theo dõi và đồng bộ hóa trạng thái của họ với nhà lãnh đạo được chọn.
  - Giai đoạn 2 (chuyển tiếp yêu cầu ghi): chuyển tiếp các yêu cầu ghi đến nhà lãnh đạo, nhà lãnh đạo phát thông tin cập nhật đến những người theo dõi của mình,sau khi thay đổi được cam kết với đa số máy chủ, khách hàng nhận được thông báo về việc thực hiện thành công.
  - Tất cả các máy trong nhóm ghi các cập nhật vào đĩa trước khi cập nhật bản sao trong bộ nhớ của cây znode.Khách hàng có thể gửi yêu cầu đọc trực tiếp tới bất kỳ máy nào, và các yêu cầu đọc được thực hiện từ bộ nhớ, giúp tăng tốc độ phản hồi cho truy vấn.
  - Nếu nhà lãnh đạo (leader) gặp sự cố, một cuộc bầu cử mới sẽ được tổ chức để chọn ra một nhà lãnh đạo mới. Nếu nhà lãnh đạo trước đó khôi phục  lại và tham gia lại, nó sẽ tham gia với vai trò người theo dõi  (follower).

**Data model (mô hình dữ liệu):**

- Trong Zookeeper, Znodes có một danh sách kiểm soát truy cập (ACL) liên kết, quyết định ai có thể đọc hoặc ghi một Znode cụ thể.
- Các đọc và ghi trên một Znode là nguyên tử, có nghĩa là một yêu cầu đọc/ghi sẽ thành công hoặc thất bại, không bao giờ đọc hoặc ghi dữ liệu  một cách không đầy đủ.
- Znodes được tham chiếu thông qua các đường dẫn, giúp chúng ta có thể hiểu Zookeeper như một hệ thống tệp hệ thống phân cấp.
- Ngoài Znodes tạm thời, có Znodes tuần tự có một số thứ tự được gắn kết là một phần của tên.Các số thứ tự có thể áp đặt một sắp xếp toàn cầu trên các sự kiện trong một hệ thống phân tán.Zookeeper có thể đặt watches (theo dõi) trên Znodes, kích hoạt khi Znode thay đổi, có thể được sử dụng để theo dõi các cấu hình thay đổi của ứng dụng chẳng hạn.

- Consistency (tính nhất quán)

  - Mọi thay đổi trong cây znode được gán một số nhận dạng duy nhất toàn cầu, gọi là Zookeeper transaction ID hay zxid.

  - Các cập nhật được sắp xếp, nếu zxid A nhỏ hơn zxid B, A phải xảy ra trước B.

  - Bảo đảm của tính nhất quán :

    - **Sequential Consistency** (tính nhất quán tuần tự): Các cập nhật từ máy khách (client) được áp dụng theo thứ tự. 
    - **Atomicity**( tính nguyên tử) : sự sửa đổi được thực hiện thành công hay thất bại một cách hoàn toàn, chứ không riêng một phần nào.
    - **Single System Image** (hệ thống hình ảnh đơn):  Máy khách  sẽ thấy cùng một khung nhìn về dịch vụ bất kể máy chủ mà nó kết nối. 
    - **Durability** (độ bền) :Khi một bản cập nhật đã được áp dụng thành công, nó sẽ được duy trì .
    - **Timeliness** (tính kịp thời): Chế độ xem của khách hàng về hệ thống được đảm bảo được cập nhật trong một thời gian nhất định.

  - Zookeeper không hỗ trợ xem nhất quán 'chéo client' đồng thời, có nghĩa là một client có thể đọc một giá trị cũ khi có thay đổi từ client khác.

    Để máy khách Y đọc giá trị mới nhất, nó phải gọi thao tác (sync) đồng bộ hóa (một phần của API Zookeeper) trên znode. ZooKeeper không đảm bảo rằng các máy khách khác nhau sẽ luôn có chế độ xem dữ liệu giống hệt nhau.

