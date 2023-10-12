# postest2PBO

2209116029 Siti Solikah Yosi Karinda 

# Aplikasi Manajemen Kos-Kosan KosDaisy

Aplikasi KosDaisy adalah sistem manajemen data untuk Kos-Kosan. Aplikasi ini memungkinkan Anda untuk menambahkan, melihat, mengedit, dan menghapus data tentang berbagai jenis kos-kosan.

## Daftar Isi

- [Cara Menggunakan Aplikasi](#cara-menggunakan-aplikasi)
- [Struktur Proyek](#struktur-proyek)
- [Kelas-Kelas Utama](#kelas-kelas-utama)

## Cara Menggunakan Aplikasi

Aplikasi KosDaisy menyediakan berbagai fungsi untuk manajemen data kos-kosan. Berikut adalah langkah-langkah penggunaan aplikasi:

1. **Jalankan Aplikasi**:
   - Pastikan Anda telah menginstal Java Development Kit (JDK) pada komputer Anda.
   - Jalankan kelas `KosDaisy.java` untuk memulai aplikasi.
   
2. **Menu Aplikasi**:
   - Aplikasi akan menampilkan menu utama dengan beberapa opsi.
   
   - **1. Tambah KosKosan**:
     - Pilih opsi ini untuk menambahkan data tentang kos-kosan.
     - Aplikasi akan meminta Anda mengisi informasi seperti nama, harga, kapasitas, dan atribut tambahan (jumlah kamar mandi atau universitas, tergantung jenis kos-kosan).
   
   - **2. Tampilkan Daftar KosKosan**:
     - Gunakan opsi ini untuk melihat daftar kos-kosan yang telah ditambahkan.
     - Data kos-kosan akan ditampilkan, termasuk atribut tambahan yang sesuai dengan jenisnya.
   
   - **3. Edit KosKosan**:
     - Pilih opsi ini jika Anda ingin mengedit data kos-kosan yang sudah ada.
     - Ikuti instruksi untuk memilih kos-kosan yang akan diubah dan mengganti informasi yang sesuai.
   
   - **4. Hapus KosKosan**:
     - Gunakan opsi ini untuk menghapus data kos-kosan dari daftar.
     - Pilih indeks kos-kosan yang akan dihapus dan konfirmasi penghapusan.
   
   - **5. Keluar**:
     - Pilih opsi ini untuk keluar dari aplikasi.
   
3. **Ikuti Instruksi**: 
   - Ikuti instruksi yang ditampilkan di layar untuk melakukan operasi yang diinginkan.
   
4. **Selesai**: 
   - Setelah menyelesaikan operasi yang diinginkan, Anda dapat melihat hasilnya atau keluar dari aplikasi.

## Struktur Proyek

Aplikasi KosDaisy terdiri dari dua paket utama:

- `com.mycompany.kosdaisy`: Berisi kelas utama `KosDaisy` yang merupakan entry point aplikasi.
- `Bulanan`: Berisi kelas-kelas yang mewakili jenis-jenis kos-kosan, seperti `Fasilitas` dan `KosMahasiswa`.

## Kelas-Kelas Utama

### `KosDaisy.java`

Kelas utama aplikasi yang berfungsi sebagai pengontrol utama. Kelas ini memiliki method untuk menambah, menampilkan, mengedit, dan menghapus KosKosan.

### `Penghuni.java`

Kelas abstrak yang menjadi dasar untuk kelas Penghuni lainnya. Berisi atribut dan metode abstrak yang diimplementasikan oleh kelas turunan.

### `Fasilitas.java`

Kelas yang mewakili jenis kos-kosan "Fasilitas" dengan atribut tambahan jumlah kamar mandi.

### `KosMahasiswa.java`

Kelas yang mewakili jenis kos-kosan "Kos Mahasiswa" dengan atribut tambahan universitas asal.


### Penjelasan Kode

KosDaisy.java
Kode dalam kelas KosDaisy adalah nadi dari aplikasi KosDaisy. Ini adalah kelas utama yang mengendalikan manajemen data untuk kos-kosan. Berikut adalah beberapa poin penting dalam kode ini:

Deklarasi Variabel:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/cd3f0383-a0b3-45e7-a0da-743d62beaff3)
Di sini, kita mendeklarasikan daftarKosKosan sebagai sebuah List dari objek Penghuni. Inisialisasi ini dilakukan di tingkat kelas untuk menyimpan daftar kos-kosan.

Main Method:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/bc0ef026-34e5-4dac-8a40-978fd55dd809)
Ini adalah method utama yang akan dijalankan saat aplikasi dimulai. Di dalamnya, kita memiliki logika untuk menampilkan menu, memproses input pengguna, dan mengarahkan ke operasi yang sesuai.

Switch Statement:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/d2efa3c2-5366-4ef3-a7f1-e32d90eccc5a)
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/a2a9058b-5164-4a9e-85ae-f3859055a333)
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/d6f8805d-e628-4753-bb56-cdb12c2e35f7)
Dalam bagian ini, kita menggunakan pernyataan switch untuk memproses pilihan pengguna. Bergantung pada pilihan yang dipilih, kita memanggil operasi yang sesuai atau memberikan pesan kesalahan jika pilihan tidak valid.

Operasi Tambah KosKosan:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/dd5b91c6-2109-49b1-a37f-816bd7a18518)
Dalam kasus ini, kita mengambil input dari pengguna (nama, harga, dan kapasitas), kemudian membuat objek Penghuni yang sesuai (dalam hal ini, Fasilitas atau KosMahasiswa) dengan atribut yang sesuai.

Operasi Tampilkan Daftar KosKosan:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/873ed3b7-096a-48df-a13d-416040e97494)
    ...
Pada operasi ini, kita hanya mencetak daftar kos-kosan yang ada dengan menggunakan loop for dan memanggil tampilkanInfo pada masing-masing objek.

Operasi Edit KosKosan:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/818bfb87-09a6-496c-b14a-f36f685147f5)
Operasi ini memungkinkan pengguna untuk mengubah data kos-kosan yang ada. Kode meminta pengguna memasukkan indeks kos-kosan yang ingin diubah, dan kemudian mengganti atribut yang sesuai.

Operasi Hapus KosKosan:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/286e241d-9d77-412b-9443-b14cb8be9fbf)
Pada operasi ini, pengguna diminta untuk memasukkan indeks kos-kosan yang ingin dihapus, dan kode akan menghapusnya dari daftar.

Kelas Penghuni.java
Kelas abstrak Penghuni adalah kelas dasar untuk semua jenis kos-kosan. Berikut adalah poin penting dalam kode ini:

Deklarasi Atribut:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/e927a3af-bec9-44ad-9881-1fae88c641fb)
Di sini, kita mendefinisikan atribut dasar yang dimiliki oleh setiap objek kos-kosan, yaitu nama, harga, dan kapasitas.

Getter dan Setter:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/6e6ca813-ed8d-4082-88a1-9b83c527ad50)
Kode ini menyediakan metode getter dan setter untuk atribut-atribut tersebut sehingga mereka dapat diakses dan diubah oleh kelas-kelas turunan.

Metode Abstrak:
![image](https://github.com/sitisolikahyosikarinda/postest2PBO/assets/122278611/c531e966-a871-43a4-8271-0fa1b75ec24d)
Di sini, kita mendeklarasikan metode abstrak tampilkanInfo yang harus diimplementasikan oleh kelas-kelas turunan. Metode ini akan digunakan untuk mencetak informasi objek kos-kosan.


Kelas Fasilitas.java dan KosMahasiswa.java
Kelas-kelas ini mewakili dua jenis kos-kosan yang berbeda, yaitu "Fasilitas" dan "Kos Mahasiswa". Keduanya adalah turunan dari kelas Penghuni dan mengimplementasikan metode tampilkanInfo. Atribut tambahan sesuai dengan jenis kos-kosan masing-masing diatur di sini.

Ini adalah penjelasan singkat tentang kode yang digunakan dalam aplikasi KosDaisy. Kode ini memungkinkan manajemen data sederhana untuk berbagai jenis kos-kosan.










