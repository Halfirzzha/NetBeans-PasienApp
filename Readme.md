# Patient Info Auto

**PatientInfoAuto** adalah aplikasi berbasis Java sederhana yang memungkinkan pengguna untuk memasukkan dan menampilkan informasi dasar pasien, seperti nomor pasien, nama, usia, jenis kelamin, tinggi badan, dan berat badan. Program ini berjalan di terminal dan menerima input dari pengguna.

## Fitur

* Meminta pengguna memasukkan informasi pasien.
* Menampilkan informasi pasien yang telah dimasukkan secara lengkap.
* Sederhana dan mudah digunakan.

## Persyaratan Sistem

* Java Development Kit (JDK) versi 8 atau yang lebih baru.
* Aplikasi editor atau IDE yang mendukung Java, seperti Apache NetBeans.

## Cara Penggunaan

1. **Kloning atau Unduh Proyek**

   * Pastikan proyek ini sudah diunduh atau dikloning ke dalam direktori lokal Anda.
2. **Buka Proyek di Apache NetBeans atau IDE Lainnya**

   * Buka file `PatientInfoAuto.java` yang terdapat di dalam package `me.halfirzhadev.patientinfo.auto`.
3. **Jalankan Program**

   * Jalankan program dengan menekan tombol **Run** pada IDE atau melalui terminal dengan perintah berikut:

     ```bash
     java PatientInfoAuto
     ```
4. **Masukkan Informasi Pasien**

   * Program akan meminta Anda untuk memasukkan informasi berikut:
     * Nomor Pasien
     * Nama Pasien
     * Usia
     * Jenis Kelamin
     * Tinggi Badan (dalam cm)
     * Berat Badan (dalam kg)
5. **Output**

   * Program akan menampilkan informasi pasien yang telah dimasukkan dalam format berikut:

     ```plaintext
     --- Informasi Pasien ---
     No. Pasien: <No.Pasien>
     Nama: <Nama>
     Usia: <Usia> tahun
     Jenis Kelamin: <Jenis Kelamin>
     Tinggi Badan: <Tinggi Badan> cm
     Berat Badan: <Berat Badan> kg
     ```

## Contoh

Berikut adalah contoh input dan output dari program:

### Input

```plaintext
Masukkan No. Pasien: 001
Masukkan Nama: M'HALFIRZZHATULLAH
Masukkan Usia: 20
Masukkan Jenis Kelamin: Laki-laki
Masukkan Tinggi Badan (cm): 175.5
Masukkan Berat Badan (kg): 65.5
```


## **Catatan**

Pastikan memasukkan data sesuai jenis yang diminta. Misalnya, Usia harus berupa angka (integer) dan Tinggi Badan serta Berat Badan harus berupa desimal (double).
Program ini menggunakan kelas Scanner untuk membaca input dari pengguna, pastikan untuk menutup input setelah digunakan untuk mencegah kebocoran memori.

## Lisensi


Aplikasi ini dikembangkan untuk tujuan pembelajaran dan penggunaan pribadi. Anda bebas untuk memodifikasi dan mengembangkan aplikasi ini lebih lanjut sesuai kebutuhan Anda.
