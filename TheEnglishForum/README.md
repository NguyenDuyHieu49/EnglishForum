# 🇬🇧 The English Forum – Báo cáo UI/UX

## 📝 I. Tóm tắt

Báo cáo giới thiệu và phân tích ứng dụng di động **The English Forum** – một diễn đàn học tiếng Anh tích hợp chức năng luyện tập hằng ngày và cá nhân hóa.  

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
![Đăng nhập](assets\login.png)

#### 2. Màn hình đăng ký  
![Đăng ký](assets\register.png)

#### 3. Trang chính  
![Trang chính](assets\home.png)

#### 4. Câu hỏi hằng ngày  
![Câu hỏi hằng ngày](assets\dailyquestions.png)

#### 5. Trang cá nhân  
![Trang cá nhân](assets\profile.png)

#### 6. UI Settings  
![UI Settings](assets\uisetting.png)

#### 7. Cài đặt trang cá nhân  
![UserProfile](assets\userprofile.png)

#### 8. Thông báo  
![Thông báo](assets\notification.png)

#### 9. Hỗ trợ
![Help](assets\help.png)

#### 10. Quên mật khẩu 
![ForgotPassword](assets\forgotpassword.png)

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
