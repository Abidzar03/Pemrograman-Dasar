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

public class MenuProgram {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan, i, j, total;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menhitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu (1-5):");
            pilihan = input.nextInt();
            if (pilihan == 1) {
                for (i = 1; i <= 10; i++) {
                    System.out.print(Integer.toString(i) + " ");
                }
            } else {
                if (pilihan == 2) {
                    for (i = 1; i <= 10; i++) {
                        if (i % 2 == 0) {
                            System.out.print(Integer.toString(i) + " ");
                        }
                    }
                } else {
                    if (pilihan == 3) {
                        total = 0;
                        for (i = 1; i <= 10; i++) {
                            total = total + i;
                        }
                        System.out.println("Hasil penjumlahan = " + total);
                    } else {
                        if (pilihan == 4) {
                            for (i = 1; i <= 5; i++) {
                                for (j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                        } else {
                            if (pilihan == 5) {
                                System.out.println("Terima kasih, program selesai.");
                            } else {
                                System.out.println("Pilihan tidak valid!");
                            }
                        }
                    }
                }
            }
        } while (pilihan != 5);
    }
}
