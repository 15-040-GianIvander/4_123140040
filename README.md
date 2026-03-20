# 📱 Profile App - Compose Multiplatform (Tugas 4)

A modern, reactive Profile Application built with **Compose Multiplatform (KMP)**. This project demonstrates the implementation of **MVVM (Model-View-ViewModel)** architecture and **State Management** in Kotlin.

## 🚀 Fitur Utama
- **Reactive UI**: Data Nama dan Bio di header berubah secara *real-time* saat diketik pada form edit (State Hoisting).
- **MVVM Architecture**: Pemisahan yang bersih antara data (`ProfileUiState`), logika (`ProfileViewModel`), dan tampilan (`ProfileScreen`).
- **Dark Mode Theme**: Dukungan transisi tema gelap dan terang dengan animasi warna yang halus.
- **Modern UI/UX**: Dashboard minimalis bertema biru dengan komponen Material 2 yang sudah dioptimalkan.

## 🏗️ Struktur Proyek
Sesuai dengan prinsip **Clean Code** dan rubrik penilaian, proyek ini dibagi menjadi:
- `data/`: Berisi `ProfileUiState` (Model data utama).
- `viewmodel/`: Berisi `ProfileViewModel` (Logika bisnis & pengelola StateFlow).
- `ui/`: Berisi `ProfileScreen` dan komponen stateless lainnya.

## 🛠️ Tech Stack
- **Kotlin Multiplatform**
- **Compose Multiplatform** (Material 2)
- **AndroidX Lifecycle ViewModel**
- **Kotlin Coroutines & StateFlow**

## 📸 Preview
Berikut adalah tampilan aplikasi dalam berbagai kondisi:

| Light Mode        | Dark Mode          | Fitur Reactive (Editing) |
|-------------------|--------------------|-------------------------|
| ![Light]<img width="1080" height="2400" alt="Screenshot_20260320_203628" src="https://github.com/user-attachments/assets/b826d605-d05e-4f77-ae17-5dabb5d56c8f" />| ![Dark]<img width="1080" height="2400" alt="Screenshot_20260320_203609" src="https://github.com/user-attachments/assets/a64c8d81-1405-457e-9578-88e8b43cd928" />| ![Edit]<img width="1080" height="2400" alt="Screenshot_20260320_203621" src="https://github.com/user-attachments/assets/eee792d3-ed2c-4ef0-aab9-f03b6ad63ae5" />|

---
**Developed by:** Gian Ivander  
**NIM:** 123140040  
**Major:** Teknik Informatika - ITERA
