/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bulanan;

/**
 *
 * @author Acer
 */
public abstract class Penghuni {
        
    private String nama;
    private int harga;
    private int kapasitas;

    public Penghuni (String nama, int harga, int kapasitas) {
        this.nama = nama;
        this.harga = harga;
        this.kapasitas = kapasitas;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Metode abstrak yang akan diimplementasikan oleh kelas turunan
    public abstract void tampilkanInfo();
}


