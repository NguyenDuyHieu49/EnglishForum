# 🇬🇧 The English Forum – Báo cáo UI/UX

## Thành viên nhóm
Nguyễn Duy Hiệu.MSV 23010363
Vũ Đức Minh.MSV 23010381
## 📝 I. Tóm tắt

Báo cáo giới thiệu và phân tích ứng dụng di động **The English Forum** – một diễn đàn học tiếng Anh tích hợp chức năng luyện tập hằng ngày và cá nhân hóa.  
Dự án được thực hiện bởi **nhóm 1 – lớp Kỹ thuật phần mềm**, giảng viên hướng dẫn: *Trương Anh Hoàng*.

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
git clone https://github.com/yourusername/the-english-forum.git
cd the-english-forum
Mở bằng Android Studio:

File → Open → Chọn thư mục dự án

### 3. Build & chạy ứng dụng
Chạy trên trình giả lập hoặc thiết bị thật (USB Debugging).

Nếu lỗi font/màu xảy ra, kiểm tra file theme/ hoặc SettingsViewModel.kt.


## 📁 VI. Cấu trúc dự án
Hellothegioi/
├── MainActivity.kt
├── ui/
│   ├── components/        # Giao diện: bài viết, bình luận
│   ├── navigation/        # Điều hướng bottom bar
│   ├── screens/           # Tất cả màn hình (Login, Home, Profile, Help,...)
│   ├── theme/             # Cấu hình giao diện (màu sắc, font, kích cỡ)
├── data/
│   ├── model/             # Class dữ liệu: User, Post, Comment, Notification
│   ├── repository/        # Dữ liệu mẫu (demo)
└── assets/
    └── screens/           # Ảnh minh họa UI
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
