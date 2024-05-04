Login Page Android

Deskripsi singkat tentang proyek.

Deskripsi
Project ini adalah aplikasi Android open source sederhana yang memungkinkan pengguna untuk melakukan proses login. Aplikasi ini dilengkapi dengan halaman login yang memiliki fitur untuk memasukkan alamat email, kata sandi, dan konfirmasi kata sandi. Setelah login berhasil, pengguna akan diarahkan ke halaman selamat datang.

Proyek ini dikembangkan menggunakan Firebase Authentication untuk otentikasi pengguna.

## Struktur Proyek

Berikut adalah struktur file dalam proyek ini:

- **app**
  - **src**
    - **main**
      - **java/com/example/loginpage**
        - `LoginActivity.kt`: Aktivitas untuk tampilan login.
        - `MainActivity.kt`: Aktivitas untuk tampilan utama setelah login.
        - `SignUpActivity.kt`: Aktivitas untuk tampilan pendaftaran akun baru.
      - **res**
        - **layout**
          - `activity_login.xml`: Tata letak untuk tampilan login.
          - `activity_main.xml`: Tata letak untuk tampilan utama.
          - `activity_signup.xml`: Tata letak untuk tampilan pendaftaran akun baru.
        - **drawable**: Direktori untuk gambar dan ikon.
        - **values**: Direktori untuk file nilai seperti strings.xml, colors.xml, dll.

Fitur
- Halaman login dengan edit text untuk email, kata sandi, dan konfirmasi kata sandi.
- Button untuk masuk dan text view untuk mendaftar jika belum mempunyai akun.
- Integrasi dengan Firebase Authentication.
- Halaman selamat datang setelah berhasil login.

Instalasi
- Clone repositori ini ke direktori lokal Anda
- Copy code
   git clone https://github.com/PucuBoy/Login-dan-Register-Android.git
- Buka proyek menggunakan Android Studio.
- Jalankan aplikasi di emulator atau perangkat Android Anda.

Kontribusi
Saya sangat terbuka terhadap kontribusi dari semua pihak. Jika Anda memiliki saran atau perbaikan, jangan ragu untuk membuat pull request!
Atau hubungi saya di instagram
@yusuffadilahs
