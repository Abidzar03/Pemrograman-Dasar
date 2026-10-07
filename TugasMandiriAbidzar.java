/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugasmandiriabidzar;

/**
 *
 * @author HYPE AMD
 */

import java.util.Scanner;

public class TugasMandiriAbidzar {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        double angka1, angka2, hasil;

        System.out.println("menu belajar matematika andi");
        System.out.println("1. pertambahan");
        System.out.println("2. pengurangan");
        System.out.println("3. pembagian");
        System.out.println("pilih menu (1/2/3)");
        pilihan = input.nextInt();
        System.out.println("masukkan angka pertama: ");
        angka1 = input.nextDouble();
        System.out.println("masukkan angka kedua: ");
        angka2 = input.nextDouble();
        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("hasil : " + hasil);
        } else {
            if (pilihan == 2) {
                hasil = angka1 - angka2;
                System.out.println("hasil : " + hasil);
            } else {
                if (pilihan == 3) {
                    hasil = angka1 / angka2;
                    System.out.println("hasil : " + hasil);
                } else {
                    hasil = angka1 * angka2;
                    System.out.println("hasil diluar menu: " + hasil);
                }
            }
        }
    }
}
