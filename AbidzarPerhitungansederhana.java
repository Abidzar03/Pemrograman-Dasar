/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abidzar.perhitungansederhana;

/**
 *
 * @author HYPE AMD
 */

    import java.util.Scanner;

public class AbidzarPerhitungansederhana {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        int pilihan;

        System.out.println("=================================");
        System.out.println("     PROGRAM PERHITUNGAN SEDERHANA");
        System.out.println("=================================");

        System.out.print("Masukkan angka pertama : ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua   : ");
        angka2 = input.nextDouble();

        System.out.println("\nPilih operasi:");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan [1-4] : ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil = " + hasil);
                break;

            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil = " + hasil);
                } else {
                    System.out.println("Error: angka tidak boleh dibagi 0!");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}