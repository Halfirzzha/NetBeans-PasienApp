/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.halfirzhadev.patientinfo.auto;

/**
 *
 * @author halfirzzha
 */
import java.util.Scanner;

public class PatientInfoAuto {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan data pasien
        System.out.print("Masukkan No. Pasien: ");
        String noPasien = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        input.nextLine(); // Menangani newline agar tidak terlewat

        System.out.print("Masukkan Jenis Kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Masukkan Berat Badan (kg): ");
        double beratBadan = input.nextDouble();

        // Menutup objek Scanner
        input.close();

        // Menampilkan informasi pasien
        System.out.println("\n--- Informasi Pasien ---");
        System.out.println("No. Pasien: " + noPasien);
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        System.out.println("Berat Badan: " + beratBadan + " kg");
    }
}
