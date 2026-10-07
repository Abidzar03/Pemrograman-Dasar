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

public class MenuPolaBintang {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan, tinggi, i, j, k;

        do {
            System.out.println("===== MENU POLA =====");
            System.out.println("1. Segitiga");
            System.out.println("2. Segitiga Terbalik");
            System.out.println("3. Persegi");
            System.out.println("4. Piramida");
            System.out.println("5. Diamond");
            System.out.println("6. Keluar");
            System.out.println("Pilihan: ");
            pilihan = input.nextInt();
            if (pilihan == 6) {
                System.out.println("Terima kasih! Program selesai.");
            break;}
            if (pilihan >= 1 && pilihan <= 5) {
                System.out.println("Masukkan tinggi/ukuran: ");
                tinggi = input.nextInt();
                if (pilihan == 1) {
                    for (i = 1; i <= tinggi; i++) {
                        for (j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                } else {
                    if (pilihan == 2) {
                        for (i = tinggi; i >= 1; i--) {
                            for (j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                    } else {
                        if (pilihan == 3) {
                            for (i = 1; i <= tinggi; i++) {
                                for (j = 1; j <= tinggi; j++) {
                                    System.out.print("*");
                                }
                                System.out.println("");
                            }
                        } else {
                            if (pilihan == 4) {
                                for (i = 1; i <= tinggi; i++) {
                                    for (j = 1; j <= tinggi - i; j++) {
                                        System.out.print(" ");
                                    }
                                    for (k = 1; k <= 2 * i - 1; k++) {
                                        System.out.print("*");
                                    }
                                    System.out.println("");
                                }
                            } else {
                                if (pilihan == 5) {
                                    for (i = 1; i <= tinggi; i++) {
                                        for (j = 1; j <= tinggi - i; j++) {
                                            System.out.print(" ");
                                        }
                                        for (k = 1; k <= 2 * i - 1; k++) {
                                            System.out.print("*");
                                        }
                                        System.out.println("");
                                    }
                                    for (i = tinggi; i >= 1; i--) {
                                        for (j = 1; j <= tinggi - i; j++) {
                                            System.out.print(" ");
                                        }
                                        for (k = 1; k <= 2 * i - 1; k++) {
                                            System.out.print("*");
                                        }
                                        System.out.println("");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid!");
                                }
                            }
                        }
                    }
                }
            }
        } while (pilihan != 6);
        while (pilihan != 6) {
        }
    }
}
