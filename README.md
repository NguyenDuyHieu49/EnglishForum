# 🇬🇧 The English Forum 


## 📝 I. Tóm tắt

Báo cáo giới thiệu và phân tích ứng dụng di động **The English Forum** – một diễn đàn học tiếng Anh tích hợp chức năng luyện tập hằng ngày và cá nhân hóa.  
Dự án được thực hiện bởi nhóm 9 
---

## ❓ II. Đặt vấn đề

### ⚠️ 1. Vấn đề hiện tại

- Người học tiếng Anh thiếu môi trường tương tác.
- Thiếu phản hồi chất lượng, cập nhật không thường xuyên.
- Không có động lực học tập bền vững.

### 💡 2. Giải pháp

Phát triển ứng dụng **diễn đàn tiếng Anh chuyên biệt** với:

- Tính năng diễn đàn học thuật.
- Luyện tập câu hỏi hằng ngày.
- Giao diện thân thiện, cá nhân hóa.

### 👥 3. Người dùng mục tiêu

- Học sinh, sinh viên, người đi làm.
- Giáo viên muốn chia sẻ kiến thức.

---

## 🧩 III. Các tác vụ chính

- 🔐 Đăng nhập / Đăng ký tài khoản  
- 👤 Quản lý hồ sơ người dùng  
- 📝 Đăng / Tìm / Xem / Chỉnh sửa / Xoá bài viết  
- 💬 Bình luận / ❤️ Thích / 🔗 Chia sẻ  
- 🚩 Báo cáo bài viết / câu trả lời  
- 🌟 Vinh danh câu trả lời hay  
- 📅 Trả lời câu hỏi hằng ngày  
- 🔔 Nhận thông báo  
- 🆘 Hỗ trợ người dùng  
- 🎨 Tuỳ chỉnh giao diện

---

## 🎨 IV. Thiết kế giao diện (UI)

> ⚠️ **Ảnh minh họa giao diện** được lưu tại thư mục `assets/screens/`. Đặt tên ảnh theo các tên gợi ý sau để đúng đường dẫn.

### 🖼️ Giao diện ứng dụng

#### 1. Màn hình đăng nhập  
![Đăng nhập]![login](https://github.com/user-attachments/assets/111d142d-2175-456d-b4a6-b4f4da58a2a5)

#### 2. Màn hình đăng ký  
![Đăng ký]![register](https://github.com/user-attachments/assets/daf7bf5e-a127-4ec1-82b6-1d3c35ed2b43)

#### 3. Trang chính  
![Trang chính]![home](https://github.com/user-attachments/assets/67951ac4-727b-4691-9731-7863bf612f6c)


#### 4. Câu hỏi hằng ngày  
![Câu hỏi hằng ngày]![dailyquestions](https://github.com/user-attachments/assets/9309b125-c71b-4433-8a1e-893f5c9c61e5)


#### 5. Trang cá nhân  
![Trang cá nhân]![profile](https://github.com/user-attachments/assets/5b436086-7b68-4837-9f20-03713230c39f)


#### 6. UI Settings  
![UI Settings]![uisetting](https://github.com/user-attachments/assets/aba1ec6b-56f1-4780-8747-930d3d9d9f1b)


#### 7. Cài đặt trang cá nhân  
![UserProfile]![userprofile](https://github.com/user-attachments/assets/3926ebd7-b670-445b-bdb2-6e9b4bfcd6dd)

#### 8. Thông báo  
![Thông báo]![notification](https://github.com/user-attachments/assets/29fba8e0-ecc3-4c29-98f2-db1a7f4d5bca)


#### 9. Hỗ trợ
![Help]![help](https://github.com/user-attachments/assets/7ab463d6-5016-478b-87a9-0862b0674659)

#### 10. Quên mật khẩu 
![ForgotPassword]![forgotpassword](https://github.com/user-attachments/assets/090034fb-5365-4170-a29d-dbb8377cb79b)


---

## ⚙️ V. Hướng dẫn cài đặt

### 1. Yêu cầu hệ thống

- **Android Studio**: Arctic Fox trở lên
- **SDK**: Android API 33 (hoặc mới hơn)
- **Gradle**: 7.3.3+

### 2. Cài đặt dự án

```bash
git clone https://github.com/NguyenDuyHieu49/EnglishForum.git
cd the-english-forum
Mở bằng Android Studio:

File → Open → Chọn thư mục dự án

### 3. Build & chạy ứng dụng
Chạy trên trình giả lập hoặc thiết bị thật (USB Debugging).

Nếu lỗi font/màu xảy ra, kiểm tra file theme/ hoặc SettingsViewModel.kt.


## 📁 VI. Cấu trúc dự án
IV.LẬP TRÌNH
Mô tả cấu trúc chương trình
 Hellothegioi/
|-- MainActivity.kt   Khởi chạy ứng dụng, hiển thị các giao diện chính và thực hiện các điều hướng
|-- ui/
     |-- componets/
          |-- CommentItem.kt  Giao diện cơ bản của một bình luận
          |-- PostItemHorizontal.kt  Giao diện cơ bản của một bài viết
      |-- navigation/
          |-- BottomNavigationBar.kt  Định nghĩa các chức năng chính trong ứng dụng như: home, search, question, notification, profile
          |-- BottomNavigationItem.kt  Định nghĩa các item của các chức năng chính
      |-- screens/ 
          |-- CFInstructor.kt  Giao diện gửi xác minh tài khoản giáo viên
          |-- CommentScreen.kt  Giao diện hiển thị danh sách các bài viết của tài khoản và bình luận trong một bài viết
          |-- CreateUserScreen.kt  Giao diện đăng ký
          |-- DailyQuestionScreen.kt  Giao diện câu hỏi hằng ngày
          |-- ForgotPasswordScreen.kt  Giao diện quên mật khẩu
          |-- HelpScreen.kt  Giao diện màn hình trợ giúp
          |-- HomeScreen.kt  Giao diện màn hình chính
          |-- LoginScreen.kt  Giao diện đăng nhập
          |-- NewPostScreen.kt  Giao diện tạo bài viết
          |-- NotificationScreen.kt  Giao diện màn hình thông báo
          |-- ProfileScreen.kt  Giao diện thông tin tài khoản
          |-- QuestionComponents.kt  Giao diện hiển thị câu hỏi
          |-- QuestionViewModel_v2.kt  Lớp quản lý trạng thái và logic để hiển thị và tương tác với các câu hỏi
          |-- RePasswordScreen.kt  Giao diện thay đổi mật khẩu
          |-- SearchScreen.kt  Giao diện màn hình tìm kiếm
          |-- SettingsDataStore.kt  Lớp quản lý lưu trữ và truy xuất cài đặt ứng dụng của người dùng
          |-- SettingsScreen.kt  Giao diện cài đặt ứng dụng
          |-- SettingsViewModel.kt  Lớp quản lý trạng thái và logic cho các thiết lập của người dùng cho ứng dụng
          |-- UserProfileScreen.kt  Giao diện hiển thị thông tin tài khoản người dùng
          |-- UserProfileViewModel.kt  Lớp quản lý trạng thái và logic cho các thiết lập của người dùng cho tài khoản
      |-- theme/ 
          |-- AppTheme.kt  Định nghĩa các chủ đề của ứng dụng như chế độ tối, màu chính, kích thước phông chữ và độ đậm phông chữ, được cung cấp bởi SettingsViewModel.
                       |--Color.kt  Các màu sắc có thể sử dụng trong ứng dụng
                       |-- Theme.kt  Cài đặt các giao diện có thể sử dụng trong ứng dụng
	          |--Type.kt  Các kiểu font chữ màu chữ và kích thước độ đậm chữ có thể cài đặt trong ứng dụng
|-- data/ 
      |-- model/
          |-- Comment.kt  Định nghĩa lớp dữ liệu của một bình luận
          |-- CurrentUser.kt  Lưu thông tin người dùng hiện tại của ứng dụng
          |-- Notification.kt   Định nghĩa lớp dữ liệu của một thông báo
          |-- Post.kt  Định nghĩa lớp dữ liệu của một bài viết
          |-- Question.kt  Định nghĩa lớp dữ liệu của một câu hỏi
          |-- User.kt  Định nghĩa lớp dữ liệu của một tài khoản người dùng
      |-- repository/
          |-- ExampleComment  Danh sách bình luận demo
          |-- ExampleHelp  Danh sách câu hỏi trợ giúp demo
          |-- ExampleNotification  Danh sách thông báo demo
          |-- ExamplePost  Danh sách bài viết demo
          |-- ExampleUser  Danh sách tài khoản người dùng demo
          |-- QuestionRepository  Danh sách câu hỏi demo

## 🚧 VII. Các tính năng đặc biệt
🎨 Tùy chỉnh UI: màu chủ đạo, font chữ, độ đậm, chế độ sáng/tối.

📅 Hệ thống câu hỏi hằng ngày.

🔔 Thông báo theo dõi tương tác người dùng.

🧭 Điều hướng Compose hiện đại và dễ mở rộng.

## ⚠️ VIII. Hạn chế
❌ Chưa hỗ trợ thay đổi font tùy chọn.

📖 Thiếu hệ thống hướng dẫn tương tác trực tiếp cho người mới, mới chỉ sử dụng mock data, chưa có local và cloud database

📬 IX. Đóng góp
Đóng góp, báo lỗi hoặc gợi ý tại: nguyenduyhieuwork49@gmail.com
