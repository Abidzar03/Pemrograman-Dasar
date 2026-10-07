/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bantuanpendidikan;

/**
 *
 * @author HYPE AMD
 */
import java.util.*;
import java.lang.Math;

public class BantuanPendidikan {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int angka, isi, hasil;

        System.out.println("masukkan angka");
        angka = input.nextInt();
        for (isi = 1; isi <= 10; isi++) {
            hasil = angka * isi;
            System.out.println(Integer.toString(angka) + "x" + isi + "=" + hasil);
        }
    }
}

