# EnglishForum 📚

[![Kotlin Version](https://img.shields.io/badge/Kotlin-1.8.0-blue.svg)](https://kotlinlang.org)
[![License](https://img.shields.io/badge/License-MIT-green.svg)](https://opensource.org/licenses/MIT)

Ứng dụng **EnglishForum** là một diễn đàn học tiếng Anh được phát triển bằng Kotlin, giúp người dùng thảo luận, chia sẻ tài liệu và nâng cao kỹ năng ngôn ngữ.

## 📱 Tính năng chính

- **Đăng bài & Thảo luận**: Tạo chủ đề, bình luận, upvote/downvote.
- **Tài liệu chia sẻ**: Upload và tải tài liệu học tập (PDF, MP3, video).
- **Quiz tương tác**: Làm bài test trắc nghiệm kiến thức.
- **Thông báo real-time**: Nhận alert khi có phản hồi bài viết.
- **Hồ sơ cá nhân**: Theo dõi tiến trình học tập.

## 🛠 Công nghệ sử dụng

- **Ngôn ngữ**: Kotlin
- **Backend**: Ktor/Spring Boot
- **Database**: Firebase/Firestore hoặc PostgreSQL
- **Authentication**: Firebase Auth/JWT
- **UI**: Jetpack Compose (Android) hoặc TornadoFX (Desktop)

## ⚙️ Cài đặt

### Yêu cầu hệ thống
- Android Studio (bản mới nhất)
- JDK 17+
- Gradle 8.0+

### Các bước chạy ứng dụng
1. Clone repo:
   ```bash
   git clone https://github.com/NguyenDuyHieu49/EnglishForum
   Mở project bằng Android Studio.

2. Cấu hình Firebase (nếu sử dụng):

3. Tải file google-services.json từ Firebase Console và đặt vào thư mục app/.

4. Chạy ứng dụng:

bash
./gradlew run

## 📌 Điểm yếu/Hạn chế hiện tại

⚠️ **Triển khai môi trường**:
- Ứng dụng đang chạy trên **localhost**, chưa triển khai lên cloud (AWS/Google Cloud/Azure).  
- Chưa có domain riêng, phải truy cập qua địa chỉ IP local.  
- Chưa kết nối cloud database.  

🔧 **Khả năng mở rộng**:
- Chưa hỗ trợ cân bằng tải (load balancing) khi có nhiều người dùng đồng thời.  
- Authentication đang dùng mock data Firebase Local Emulator.  
