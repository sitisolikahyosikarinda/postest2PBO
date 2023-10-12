/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kosdaisy;

import Bulanan.Fasilitas;
import Bulanan.Penghuni;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KosDaisy {
    private static final List<Penghuni> daftarKosKosan = new ArrayList<>();

    public static void main(String[] args) {
        KosDaisy kosDaisy = new KosDaisy();

        try (Scanner input = new Scanner(System.in)) {
            boolean selesai = false;
            while (!selesai) {
                System.out.println("Menu:");
                System.out.println("1. Tambah KosKosan");
                System.out.println("2. Tampilkan Daftar KosKosan");
                System.out.println("3. Edit KosKosan");
                System.out.println("4. Hapus KosKosan");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                
                int opsi = input.nextInt();
                input.nextLine();  // Membersihkan newline dari buffer
                
                switch (opsi) {
                    case 1:
                        // Tambah KosKosan
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Harga: ");
                        int harga = input.nextInt();
                        System.out.print("Kapasitas: ");
                        int kapasitas = input.nextInt();
                        input.nextLine();
                        
                        Penghuni penghuni = new Fasilitas(nama, harga, kapasitas, 0); // Ganti 0 dengan jumlahKamarMandi yang sesuai
                        kosDaisy.tambahKosKosan(penghuni);
                        System.out.println("KosKosan ditambahkan.");
                        break;

                    case 2:
                        // Tampilkan Daftar KosKosan
                        kosDaisy.tampilkanDaftarKosKosan();
                        break;

                    case 3:
                        // Edit KosKosan
                        System.out.print("Masukkan indeks yang akan diubah: ");
                        int indexEdit = input.nextInt();
                        input.nextLine();

                        if (indexEdit >= 0 && indexEdit < daftarKosKosan.size()) {
                            System.out.print("Nama baru: ");
                            String namaBaru = input.nextLine();
                            System.out.print("Harga baru: ");
                            int hargaBaru = input.nextInt();
                            System.out.print("Kapasitas baru: ");
                            int kapasitasBaru = input.nextInt();
                            input.nextLine();

                            // Ambil objek kos-kosan yang akan diubah
                            Penghuni kosKosanDiubah = daftarKosKosan.get(indexEdit);

                            // Modifikasi atribut-atributnya
                            kosKosanDiubah.setNama(namaBaru);
                            kosKosanDiubah.setHarga(hargaBaru);
                            kosKosanDiubah.setKapasitas(kapasitasBaru);

                            System.out.println("KosKosan telah diubah.");
                        } else {
                            System.out.println("Indeks tidak valid.");
                        }
                        break;

                    case 4:
                        // Hapus KosKosan
                        System.out.print("Masukkan indeks yang akan dihapus: ");
                        int indexHapus = input.nextInt();
                        input.nextLine();
                        
                        kosDaisy.hapusKosKosan(indexHapus);
                        System.out.println("KosKosan telah dihapus.");
                        break;

                    case 5:
                        // Keluar
                        selesai = true;
                        break;

                    default:
                        System.out.println("Opsi tidak valid. Silakan coba lagi.");
                        break;
                }
            }
        }
    }

    public void tambahKosKosan(Penghuni penghuni) {
        daftarKosKosan.add(penghuni);
    }

    public void tampilkanDaftarKosKosan() {
        for (int i = 0; i < daftarKosKosan.size(); i++) {
            System.out.println("Index " + i);
            daftarKosKosan.get(i).tampilkanInfo();
            System.out.println();
        }
    }

    public void hapusKosKosan(int index) {
        if (index >= 0 && index < daftarKosKosan.size()) {
            daftarKosKosan.remove(index);
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
}






    

