/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bulanan;

/**
 *
 * @author Acer
 */
public class Fasilitas extends Penghuni {
    private int jumlahKamarMandi;

    public Fasilitas(String nama, int harga, int kapasitas, int jumlahKamarMandi) {
        super(nama, harga, kapasitas);
        this.jumlahKamarMandi = jumlahKamarMandi;
    }

    public int getJumlahKamarMandi() {
        return jumlahKamarMandi;
    }

    public void setJumlahKamarMandi(int jumlahKamarMandi) {
        this.jumlahKamarMandi = jumlahKamarMandi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Jumlah Kamar Mandi: " + jumlahKamarMandi);
    }
}


