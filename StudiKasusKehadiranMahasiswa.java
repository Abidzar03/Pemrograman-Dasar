/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author HYPE AMD
 */
public class StudiKasusKehadiranMahasiswa {
    public static void main (String[] args) {
        int[] hadir = {14, 13, 16, 12, 15, 10, 16, 14};
        int totalPertemuan = 16;

        System.out.println("=== KEHADIRAN MAHASISWA ===");
        System.out.println("Total Pertemuan: " + totalPertemuan);
        System.out.println("Batas Minimal  : 75% (Minimal hadir "
                + (int)(totalPertemuan * 0.75) + " kali)");
        
        // Looping untuk memproses setiap data kehadiran dalam array
        for (int i = 0; i < hadir.length; i++) {
            // Menghitung persentase kehadiran (casting ke double agar hasilnya akurat)
            double persentase = ((double) hadir[i] / totalPertemuan) * 100;

            // Menentukan status apakah mencapai minimal 75%
            String status;
            if (persentase >= 75.0) {
                status = "Mencapai Target (Lulus)";
            } else {
                status = "Belum Mencapai Target";
            }

            // Menampilkan hasil
            System.out.println("Mahasiswa ke-" + (i + 1) + 
                               " | Hadir: " + hadir[i] + "/" + totalPertemuan + 
                               " | " + String.format("%.1f", persentase) + "%" + 
                               " | Status: " + status);
        }
    }
}        
       
