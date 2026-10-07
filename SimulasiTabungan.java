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

public class SimulasiTabungan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahBulan, bulan, nominal, totalTabungan, bulanTercapai;

        nominal = 100000;
        totalTabungan = 0;
        bulanTercapai = 0;
        jumlahBulan = input.nextInt();
        for (bulan = 1; bulan <= jumlahBulan; bulan++) {
            totalTabungan = totalTabungan + nominal;
            System.out.println("Bulan " + bulan + ": Rp" + nominal + " | Total: Rp" + totalTabungan);
            if (totalTabungan >= 1000000) {
                bulanTercapai = bulan;
            break;}
            nominal = nominal + 50000;
        }
        System.out.println("Total Tabungan: Rp" + totalTabungan);
        if (bulanTercapai > 0) {
            System.out.println("Total pertama kali mencapai Rp1.000.000 pada bulan ke-" + bulanTercapai);
        } else {
            System.out.println("Total tabungan belum mencapai Rp1.000.000 dalam " + jumlahBulan + " bulan.");
        }
    }
}

