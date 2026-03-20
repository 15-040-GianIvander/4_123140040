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
| ![Light](../../Pictures/Android%20Studio/Screenshot_20260320_203628.png) | ![Dark](../../Pictures/Android%20Studio/Screenshot_20260320_203609.png) | ![Edit](../../Pictures/Android%20Studio/Screenshot_20260320_203621.png)     |

---
**Developed by:** Gian Ivander  
**NIM:** 123140040  
**Major:** Teknik Informatika - ITERA