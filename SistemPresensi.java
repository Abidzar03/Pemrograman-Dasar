/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konsepdasarstrukturkontrol;

/**
 *
 * @author HYPE AMD
 */
import java.util.*;
import java.lang.Math;

public class SistemPresensi {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, status, jumlahHadir, jumlahTidakHadir;
        double persentase;

        jumlahHadir = 0;
        jumlahTidakHadir = 0;
        System.out.println("Masukkan jumlah mahasiswa:");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println("Masukkan status mahasiswa ke-" + i + " (1 = Hadir, 0 = Tidak Hadir):");
            status = input.nextInt();
            if (status == 1) {
                jumlahHadir = jumlahHadir + 1;
            } else {
                jumlahTidakHadir = jumlahTidakHadir + 1;
            }
        }
        persentase = (double) jumlahHadir / n * 100;
        System.out.println("Jumlah Hadir: " + jumlahHadir);
        System.out.println("Jumlah Tidak Hadir: " + jumlahTidakHadir);
        System.out.println("Persentase Kehadiran: " + persentase + "%");
        if (persentase >= 75) {
            System.out.println("Status: Memenuhi syarat");
        } else {
            System.out.println("Status: Tidak memenuhi syarat");
        }
    }
}
