/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author HYPE AMD
 */
public class StudiKasusDataProdukUMKM {
    public static void main(String[] args) {
        double[] harga = {15000, 25000, 12000, 30000, 45000};
        double total = 0;
        double tertinggi = harga[0];
        double terendah = harga[0];
        System.out.println(" LAPORAN HARGA PRODUK UMKM ");
        System.out.println("No.\tHarga Asli\tDiskon 10%\tHarga Setelah Diskon");
        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
            if (harga[i] > tertinggi) {
                tertinggi = harga[i];
            }
            if (harga[i] < terendah) {
                terendah = harga[i];
            }
            double hargaAkhir = harga[i];
            String infoDiskon = "Tidak ada";
            
            if (harga[i] >= 30000) {
                double diskon = harga[i] * 0.10;
                hargaAkhir = harga[i] - diskon;
                infoDiskon = "10%";
            }
            System.out.println((i + 1) + "\tRp" + (int)harga[i] + "\t\t" + infoDiskon + "\t\tRp" + (int)hargaAkhir);
        }
        double rataRata = total / harga.length;
        System.out.println("Keseluruhan Harga : Rp" + (int)total);
        System.out.println("Rata-rata Harga         : Rp" + rataRata);
        System.out.println("Harga Tertinggi         : Rp" + (int)tertinggi);
        System.out.println("Harga Terendah          : Rp" + (int)terendah);
    }
}
