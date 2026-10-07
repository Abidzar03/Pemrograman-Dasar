/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distribusiyangadil;

/**
 *
 * @author HYPE AMD
 */
// Identitas Diri
// NIM : 09020626039
// Nama : ABIDZAR MAULANA RAMADHAN
// Modul Praktikum Bab 1

import java.util.Scanner;

public class DistribusiYangAdil {

    public static void main(String[] args) {
        //Inisialisasi Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Distribusi Beras");
        
        // Meminta input dari pengguna secara dinamis
        System.out.print("total beras (kg)       : ");
        int totalBeras = input.nextInt();
        
        System.out.print("jumlah keluarga        : ");
        int jumlahKeluarga = input.nextInt();
        
        // Validasi input
        if (jumlahKeluarga <= 0) {
            System.out.println("Error");
            return;
        }
        
        // Proses Perhitungan
        int berasPerKeluarga = totalBeras / jumlahKeluarga;
        int sisaBeras = totalBeras % jumlahKeluarga;
        
        // Output Hasil Dasar
        System.out.println("\n--- HASIL PEMBAGIAN ---");
        System.out.println("Setiap keluarga menerima        : " + berasPerKeluarga + " kg");
        System.out.println("Sisa beras yang tidak terbagi   : " + sisaBeras + " kg");
        
        // Output Rekomendasi / Alternatif Solusi
        System.out.println("\n--- REKOMENDASI PENYELESAIAN SISA ---");
        if (sisaBeras > 0) {
            double tambahanGram = ((double) sisaBeras * 1000) / jumlahKeluarga;
            System.out.printf("Alternatif 1 (Sama Rata) : Tambahkan %.2f gram untuk setiap keluarga.\n", tambahanGram);
            System.out.println("Alternatif 2 (Equity)    : Berikan ekstra 1 kg kepada " + sisaBeras + " keluarga paling membutuhkan.");
        } else {
            System.out.println("Distribusi sempurna, tidak ada sisa beras.");
        }
        
        // Menutup resource scanner
        input.close();
    }
}
