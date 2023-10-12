/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.kosdaisy;

import Bulanan.Penghuni;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    private final List<Penghuni> daftarKosKosan = new ArrayList<>();

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

    public void editKosKosan(int index, Penghuni penghuniBaru) {
        if (index >= 0 && index < daftarKosKosan.size()) {
            daftarKosKosan.set(index, penghuniBaru);
        } else {
            System.out.println("Indeks tidak valid.");
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

