/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bulanan;

/**
 *
 * @author Acer
 */
 

public class KosMahasiswa extends Penghuni {
    private String universitas;

    public KosMahasiswa(String nama, int harga, int kapasitas, String universitas) {
        super(nama, harga, kapasitas);
        this.universitas = universitas;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Kapasitas: " + getKapasitas());
        System.out.println("Universitas: " + universitas);
    }
}
  

