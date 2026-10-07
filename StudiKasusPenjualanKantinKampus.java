/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author HYPE AMD
 */
public class StudiKasusPenjualanKantinKampus {
    public static void main(String[] args) {
        // Data penjualan selama 7 hari
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};

        int total = 0;
        int tertinggi = penjualan[0];
        int terendah = penjualan[0];
        int hariMin30 = 0;

        // Looping untuk memproses data dalam array
        for (int i = 0; i < penjualan.length; i++) {
            // 1. Hitung total penjualan
            total += penjualan[i];

            // 2. Cek penjualan tertinggi
            if (penjualan[i] > tertinggi) {
                tertinggi = penjualan[i];
            }

            // 3. Cek penjualan terendah
            if (penjualan[i] < terendah) {
                terendah = penjualan[i];
            }

            // 4. Hitung hari dengan penjualan minimal 30
            if (penjualan[i] >= 30) {
                hariMin30++;
            }
        }

        // Hitung rata-rata (gunakan double agar hasil desimal akurat)
        double rataRata = (double) total / penjualan.length;

        // Menampilkan Hasil
        
        System.out.println("Total Penjualan      : " + total);
        System.out.println("Rata-rata  : " + rataRata);
        System.out.println("Penjualan Tertinggi  : " + tertinggi);
        System.out.println("Penjualan Terendah   : " + terendah);
        System.out.println("Jumlah Hari (>= 30)  : " + hariMin30 + " hari");
    }
}    

